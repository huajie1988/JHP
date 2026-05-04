package runtime;

public class JhpRuntime {
    // 模拟 PHP 的 echo 功能
    public static void echo(Object... args) {
        for (int i = 0; i < args.length; i++) {
            if (i > 0) System.out.print(" ");  // 参数间加空格
            System.out.print(args[i]);
        }
    }
    public static void echo() {
        // 无参数时输出空
    }
}