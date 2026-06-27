import compiler.GlobalSymbolTable;
import compiler.SymbolCollector;
import jhp.parser.*;
import compiler.JhpCompilationException;
import compiler.JhpVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // ===== 参数解析 =====
        String srcDir = null;
        String outDir = null;
        String singlePhpFile = null;
        int mode = 0;
        String customClassName = null;

        if (args[0].equals("-collect")) {
            String file = args[1];
            CharStream input = CharStreams.fromFileName(file);
            JhpLexer lexer = new JhpLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            JhpParser parser = new JhpParser(tokens);
            ParseTree tree = parser.phpFile();
            SymbolCollector collector = new SymbolCollector();
            collector.visit(tree);
            collector.getTable().dump();
            return;
        }

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-srcdir":
                case "-d":
                    srcDir = args[++i];
                    break;
                case "-outdir":
                case "-o":
                    outDir = args[++i];
                    break;
                case "-mode":
                case "-m":
                    mode = Integer.parseInt(args[++i]);
                    break;
                case "-class":
                case "-c":
                    customClassName = args[++i];
                    break;
                default:
                    if (singlePhpFile == null && !args[i].startsWith("-")) {
                        singlePhpFile = args[i];
                    }
            }
        }

        // ===== 目录模式 =====
        if (srcDir != null) {
            if (outDir == null) {
                // 默认输出目录：源目录同级的 dist
                Path srcPath = Paths.get(srcDir).toAbsolutePath();
                outDir = srcPath.getParent().resolve("dist").toString();
            }
            processDirectory(srcDir, outDir, mode, customClassName);
            return;
        }

        // ===== 单文件模式（原有行为） =====
        if (singlePhpFile == null || mode == 0) {
            System.err.println("Usage: java Main <input.php> <mode> [className]");
            System.err.println("   or: java Main -srcdir <dir> [-outdir <dir>] [-mode <mode>]");
            System.exit(1);
        }
        processSingleFile(singlePhpFile, mode, customClassName);
    }

    // ==================== 目录处理 ====================

    private static void processDirectory(String srcDir, String outDir, int mode, String className) throws Exception {
        Path srcPath = Paths.get(srcDir);
        Path outPath = Paths.get(outDir);

        // 使用默认模式3（仅翻译）如果未指定
        int actualMode = (mode == 0) ? 3 : mode;

        // ----- 第一阶段：收集所有文件的符号 -----
        System.out.println("正在收集全局符号表...");
        SymbolCollector collector = new SymbolCollector();
        Files.walkFileTree(srcPath, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                String fileName = file.getFileName().toString().toLowerCase();
                if (fileName.endsWith(".php") || fileName.endsWith(".jhp")) {
                    try {
                        CharStream input = CharStreams.fromFileName(file.toString());
                        JhpLexer lexer = new JhpLexer(input);
                        CommonTokenStream tokens = new CommonTokenStream(lexer);
                        JhpParser parser = new JhpParser(tokens);
                        ParseTree tree = parser.phpFile();
                        collector.visit(tree);
                    } catch (Exception e) {
                        System.err.println("符号收集失败：" + file + " - " + e.getMessage());
                    }
                }
                return FileVisitResult.CONTINUE;
            }
        });
        GlobalSymbolTable globalTable = collector.getTable();
        // globalTable.dump();  // 调试时打印

        // ----- 第二阶段：翻译每个文件，并注入全局表 -----
        System.out.println("开始翻译文件...");
        System.out.println("源目录: " + srcPath.toAbsolutePath());
        System.out.println("输出目录: " + outPath.toAbsolutePath());
        System.out.println("模式: " + actualMode);

        // 递归遍历
        Files.walkFileTree(srcPath, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                String fileName = file.getFileName().toString().toLowerCase();
                Path relativePath = srcPath.relativize(file);
                Path targetPath = outPath.resolve(relativePath);

                try {
                    if (fileName.endsWith(".php") || fileName.endsWith(".jhp")) {
                        // 翻译 PHP/JHP 文件
                        // 翻译文件，传入全局表
                        translateFile(file, targetPath, actualMode, className, globalTable);

                        System.out.println("翻译: " + file + " -> " + targetPath);
                    } else {
                        // 直接拷贝其他文件
                        Files.createDirectories(targetPath.getParent());
                        Files.copy(file, targetPath, StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("拷贝: " + file + " -> " + targetPath);
                    }
                } catch (Exception e) {
                    System.err.println("处理文件失败: " + file);
                    e.printStackTrace();
                }
                return FileVisitResult.CONTINUE;
            }
        });

        System.out.println("所有文件处理完成！");
    }

    // ==================== 单文件翻译 ====================

    private static void translateFile(Path phpFile, Path targetPath, int mode, String customClassName, GlobalSymbolTable globalTable) throws Exception {
        // 读取 PHP 源码
        CharStream input = CharStreams.fromFileName(phpFile.toString());
        JhpLexer lexer = new JhpLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JhpParser parser = new JhpParser(tokens);

        // 错误收集
        parser.removeErrorListeners();
        List<String> errors = new ArrayList<>();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine,
                                    String msg, RecognitionException e) {
                System.err.println("语法错误 at " + phpFile + " line " + line + ":" + charPositionInLine + " - " + msg);
                errors.add("line " + line + ":" + charPositionInLine + " " + msg);
            }
        });

        ParseTree tree = parser.phpFile();
        if (!errors.isEmpty()) {
            System.err.println("文件 " + phpFile + " 有语法错误，跳过翻译。");
            return;
        }

        // 确定 Java 文件名：将 .php/.jhp 替换为 .java
        String phpFileName = phpFile.getFileName().toString();
        String javaFileName = phpFileName.replaceAll("\\.(php|jhp)$", ".java");
        // 首字母大写（简单处理）
        javaFileName = javaFileName.substring(0, 1).toUpperCase() + javaFileName.substring(1);

        Path javaFile = targetPath.getParent().resolve(javaFileName);
        Files.createDirectories(javaFile.getParent());

        // 使用传入的 className，或根据文件名生成
        String className = customClassName != null ? customClassName : getDefaultClassName(phpFileName);

        // 翻译
        try (PrintWriter out = new PrintWriter(new FileWriter(javaFile.toFile()))) {
            JhpVisitor visitor = new JhpVisitor(out, mode, className);
            // 注入全局符号表（可为 null）
            if (globalTable != null) {
                visitor.getVariableProcessor().setGlobalTable(globalTable);
            }
            visitor.visit(tree);
        } catch (JhpCompilationException e) {
            System.err.println("翻译失败: " + phpFile + " - " + e.getMessage());
            javaFile.toFile().delete();
            return;
        }

        // 如果是模式4，编译生成的 Java 文件
        if (mode == 4) {
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            int compileResult = compiler.run(null, null, null, javaFile.toString());
            if (compileResult != 0) {
                System.err.println("编译失败: " + javaFile);
            }
        }
    }

    // ==================== 原有单文件处理（保留不变） ====================

    private static void processSingleFile(String phpFile, int mode, String customClassName) throws Exception {
        // 根据 PHP 文件名生成默认类名
        String baseName = Paths.get(phpFile).getFileName().toString();
        if (baseName.contains(".")) {
            baseName = baseName.substring(0, baseName.lastIndexOf('.'));
        }
        String defaultClassName = baseName.substring(0, 1).toUpperCase() + baseName.substring(1);
        String className = (customClassName != null && !customClassName.isEmpty()) ? customClassName : defaultClassName;
        String javaFile = className + ".java";

        // ===== 第一阶段：收集该文件的全局符号 =====
        CharStream collectInput = CharStreams.fromFileName(phpFile);
        JhpLexer collectLexer = new JhpLexer(collectInput);
        CommonTokenStream collectTokens = new CommonTokenStream(collectLexer);
        JhpParser collectParser = new JhpParser(collectTokens);
        ParseTree collectTree = collectParser.phpFile();

        SymbolCollector collector = new SymbolCollector();
        collector.visit(collectTree);
        GlobalSymbolTable globalTable = collector.getTable();   // 获取该文件的全局符号表

        // ===== 第二阶段：翻译 =====
        CharStream input = CharStreams.fromFileName(phpFile);
        JhpLexer lexer = new JhpLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JhpParser parser = new JhpParser(tokens);

        parser.removeErrorListeners();
        List<String> errors = new ArrayList<>();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine,
                                    String msg, RecognitionException e) {
                System.err.println("语法错误 at line " + line + ":" + charPositionInLine + " - " + msg);
                System.err.println("Offending symbol: " + offendingSymbol);
            }
        });

        ParseTree tree = parser.phpFile();
        if (!errors.isEmpty()) {
            System.err.println("PHP 语法错误：");
            for (String err : errors) {
                System.err.println("  " + err);
            }
            System.exit(1);
        }

        // 生成 Java 代码
        try (PrintWriter out = new PrintWriter(new FileWriter(javaFile))) {
            JhpVisitor visitor = new JhpVisitor(out, mode, className);
            // 注入全局符号表（单文件也可能有多个类）
            visitor.getVariableProcessor().setGlobalTable(globalTable);
            visitor.visit(tree);
        } catch (JhpCompilationException e) {
            System.err.println(e.getMessage());
            new File(javaFile).delete();
            System.exit(1);
        }

        System.out.println("Generated " + javaFile);

        // 编译和运行（保持不变）
        if (mode == 1 || mode == 2 || mode == 4) {
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            int compileResult = compiler.run(null, null, null, javaFile);
            if (compileResult != 0) {
                System.err.println("Compilation failed");
                System.exit(1);
            }
            if (mode == 1) {
                ProcessBuilder pb = new ProcessBuilder("java", className);
                pb.inheritIO();
                Process p = pb.start();
                int exitCode = p.waitFor();
                System.exit(exitCode);
            }
        }
    }

    // ==================== 辅助方法 ====================

    private static String getDefaultClassName(String phpFileName) {
        String baseName = phpFileName.replaceAll("\\.(php|jhp)$", "");
        return baseName.substring(0, 1).toUpperCase() + baseName.substring(1);
    }
}