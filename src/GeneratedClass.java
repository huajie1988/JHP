import java.util.*;
import java.math.BigDecimal;
public class GeneratedClass {
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
        runtime.JhpRuntime.echo(list.get(0), "\n");
        runtime.JhpRuntime.echo(list.get(1), "\n");
        runtime.JhpRuntime.echo(map.get("name"), "\n");
        runtime.JhpRuntime.echo(map.get("age"), "\n");
        runtime.JhpRuntime.echo(array.get(0).get(1), "\n");
        ArrayList<Integer> n = array.get(1);
        HashMap<String, Object> m = map3.get("person1");
    }
}
