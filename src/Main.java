import jhp.parser.*;
import compiler.JhpVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.err.println("Usage: java Main <input.php> <mode> [className]");
            System.exit(1);
        }
        String phpFile = args[0];
        int mode = Integer.parseInt(args[1]);   // 1,2,3
        String customClassName = args.length > 2 ? args[2] : null;

        // 根据 PHP 文件名生成默认类名
        String baseName = Paths.get(phpFile).getFileName().toString();
        if (baseName.contains(".")) {
            baseName = baseName.substring(0, baseName.lastIndexOf('.'));
        }
        // 首字母大写，其余不变（简单处理：只改第一个字符）
        String defaultClassName = baseName.substring(0, 1).toUpperCase() + baseName.substring(1);
        String className = (customClassName != null && !customClassName.isEmpty()) ? customClassName : defaultClassName;

        String javaFile = className + ".java";

        // 1. 解析 PHP
        CharStream input = CharStreams.fromFileName(phpFile);
        JhpLexer lexer = new JhpLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JhpParser parser = new JhpParser(tokens);

        // 先设置严格错误处理
        // 移除默认控制台错误输出，换成自定义收集器
        parser.removeErrorListeners();
        List<String> errors = new ArrayList<>();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine,
                                    String msg, RecognitionException e) {
                errors.add("line " + line + ":" + charPositionInLine + " " + msg);
            }
        });

        ParseTree tree = parser.phpFile();   // 使用默认错误恢复策略，会尽可能解析出所有错误

        // 如果有错误，打印详细信息并退出，不继续翻译
        if (!errors.isEmpty()) {
            System.err.println("PHP 语法错误：");
            for (String err : errors) {
                System.err.println("  " + err);
            }
            System.exit(1);
        }

        // 2. 生成 Java 代码 走到这里说明解析成功，继续生成 Java
        try (PrintWriter out = new PrintWriter(new FileWriter(javaFile))) {
            JhpVisitor visitor = new JhpVisitor(out, mode, className);
            visitor.visit(tree);
        }

        System.out.println("Generated " + javaFile);

        // 3. 编译生成的 Java 文件
        if(mode == 1 || mode == 2) {
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            int compileResult = compiler.run(null, null, null, javaFile);
            if (compileResult != 0) {
                System.err.println("Compilation failed");
                System.exit(1);
            }

            // 4. 运行生成的类
            if (mode == 1) {
                ProcessBuilder pb = new ProcessBuilder("java", className);
                pb.inheritIO();
                Process p = pb.start();
                int exitCode = p.waitFor();
                System.exit(exitCode);
            }
        }
        
    }
}