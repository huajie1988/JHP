import java.util.*;
public class Test {
    public static  String func1(String b, Integer c) 
    {
        runtime.JhpRuntime.echo("Hello from func1\n", c);
        return "Result from func1" + b;
    }
    public static  void func2() 
    {
        runtime.JhpRuntime.echo("Hello from func2\n");
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4 + 1));
        HashMap<String, Object> map = new HashMap<>() {{
            put("name", "Alice");
            put("age", 30);
        }};
        runtime.JhpRuntime.echo(list, "\n");
        runtime.JhpRuntime.echo(map, "\n");
        Integer a = 10;
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
        runtime.JhpRuntime.echo(fffff, "\n");
        for (ArrayList<Integer> row : array) {
            runtime.JhpRuntime.echo(row, ":\n");
            for (int k2 = 0; k2 < row.size(); k2++) {
                Integer value = row.get(k2);
                runtime.JhpRuntime.echo(k2, ": ", value, "\n");
            }
        }
        func2();
        for (HashMap<String, Object> personInfo : map3.values()) {
            for (Object infoValue : personInfo.values()) {
                runtime.JhpRuntime.echo("aaaa\n");
                runtime.JhpRuntime.echo("  ", infoValue, "\n");
            }
        }
    }
}
