package runtime;

public class JhpRuntime {
    // 模拟 PHP 的 echo 功能
    public static void echo(Object obj) {
        System.out.print(obj);
    }

    public static void echo() {
        // 无参数时输出空
    }
}