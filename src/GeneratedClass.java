import java.util.*;
import java.math.BigDecimal;
public class GeneratedClass {
    public static void main(String[] args) {
        Integer a = 10;
        if (a > 5)
        {
            runtime.JhpRuntime.echo("big");
            runtime.JhpRuntime.echo("aaaa\n");
        }
        else
        if (a == 5)
        {
            runtime.JhpRuntime.echo("equal");
            runtime.JhpRuntime.echo("bbbb\n");
        }
        else
        {
            runtime.JhpRuntime.echo("small");
        }
        a = 10;
        switch (a) {
            case 10:
                runtime.JhpRuntime.echo("ten\n");
                break;
            case 5:
                runtime.JhpRuntime.echo("five\n");
                break;
            default:
                runtime.JhpRuntime.echo("other\n");
        }
    }
}
