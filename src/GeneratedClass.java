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
        for (ArrayList<Integer> row : array) {
            {
                runtime.JhpRuntime.echo(row, ":\n");
                for (int k2 = 0; k2 < row.size(); k2++) {
                    Integer value = row.get(k2);
                    {
                        runtime.JhpRuntime.echo(k2, ": ", value, "\n");
                    }
                }
            }
        }
    }
}
