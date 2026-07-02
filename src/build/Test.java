import runtime.JhpRuntime;
import java.util.*;
public class Test {
    public static   String func1( String b,  Integer c) 
    {
        JhpRuntime.echo("Hello from func1" + "\\n", c);
        return "Result from func1" + b;
    }
    public static   void func2() 
    {
        JhpRuntime.echo("Hello from func2" + "\\n");
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4 + 1));
        HashMap<String, Object> map = new HashMap<>() {{
            put("name", "Alice");
            put("age", 30);
        }};
        JhpRuntime.echo(list, "\\n");
        JhpRuntime.echo(map, "\\n");
        Integer a = 10;
        if (a > 5)
        {
            JhpRuntime.echo("big");
            JhpRuntime.echo("aaaa" + "\\n");
        }
        else
        if (a == 5)
        {
            JhpRuntime.echo("equal");
            JhpRuntime.echo("bbbb" + "\\n");
        }
        else
        {
            JhpRuntime.echo("small");
        }
        if (a > 5){
            JhpRuntime.echo(String.valueOf(a) + " is greater than 5");
        }
        else if (a == 5){
            JhpRuntime.echo(String.valueOf(a) + " equals 5");
        }
        else {
            JhpRuntime.echo(String.valueOf(a) + " is neither greater than or equal to 5");
        }
        a = 10;
        while (a > 5)
        {
            JhpRuntime.echo("big");
            JhpRuntime.echo(a, "\\n");
            a--;
        }
        while (a > 5)
        {
            JhpRuntime.echo("big");
            JhpRuntime.echo(a, "\\n");
            a--;
        }
        Integer i = 0;
        for (i = 0; i < 5; i++)
        {
            if (i == 2)
            {
                break;
            }
            JhpRuntime.echo("i=", i, "\\n");
        }
        for (i = 0; i < 5; i++)
        {
            if (i == 2){
                break;
            }
            JhpRuntime.echo("i=", i, "\\n");
        }
        switch (a) {
            case 10:
                JhpRuntime.echo("ten" + "\\n");
                break;
            case 5:
                JhpRuntime.echo("five" + "\\n");
                break;
            default:
                JhpRuntime.echo("other" + "\\n");
        }
        switch (a) {
            case 10:
                JhpRuntime.echo("ten" + "\\n");
                break;
            case 5:
                JhpRuntime.echo("five" + "\\n");
                break;
            default:
                JhpRuntime.echo("other" + "\\n");
        }
        ArrayList<ArrayList<Integer>> array = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(1, 2, 3)), new ArrayList<>(Arrays.asList(4, 5, 6)), new ArrayList<>(Arrays.asList(7, 8, 9))));
        HashMap<String, HashMap<String, Object>> map3 = new HashMap<>() {{
            put("person1", new HashMap<>() {{
            put("name", "Alice");
            put("age", 30);
        }});
            put("person2", new HashMap<>() {{
            put("name", "Bob");
            put("age", 25);
        }});
        }};
        ArrayList<Integer> n = array.get(1);
        String fffff = func1(" PHP", 100);
        JhpRuntime.echo(fffff, "\\n");
        for (ArrayList<Integer> row : array) {
            JhpRuntime.echo(row, ":" + "\\n");
            for (int k2 = 0; k2 < row.size(); k2++) {
                Integer value = row.get(k2);
                JhpRuntime.echo(k2, ": ", value, "\\n");
            }
        }
        func2();
        for (HashMap<String, Object> personInfo : map3.values()) {
            for (Object infoValue : personInfo.values()) {
                JhpRuntime.echo("aaaa" + "\\n");
                JhpRuntime.echo("  2", infoValue, "\\n");
            }
        }
    }
}
