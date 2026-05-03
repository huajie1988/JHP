import jhp.parser.*;
import compiler.JhpVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.*;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java Main <input.php>");
            System.exit(1);
        }
        String phpFile = args[0];
        String javaFile = "GeneratedClass.java";

        // 1. 解析 PHP
        CharStream input = CharStreams.fromFileName(phpFile);
        JhpLexer lexer = new JhpLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JhpParser parser = new JhpParser(tokens);
        ParseTree tree = parser.phpFile();

        // 2. 生成 Java 代码
        try (PrintWriter out = new PrintWriter(new FileWriter(javaFile))) {
            JhpVisitor visitor = new JhpVisitor(out);
            visitor.visit(tree);
        }

        System.out.println("Generated " + javaFile);

        // 3. 编译生成的 Java 文件
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int compileResult = compiler.run(null, null, null, javaFile);
        if (compileResult != 0) {
            System.err.println("Compilation failed");
            System.exit(1);
        }

        // 4. 运行生成的类
        ProcessBuilder pb = new ProcessBuilder("java", "GeneratedClass");
        pb.inheritIO();
        Process p = pb.start();
        int exitCode = p.waitFor();
        System.exit(exitCode);
    }
}