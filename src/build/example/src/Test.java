import runtime.JhpRuntime;
import java.util.*;
public class Test {
    public static  String func1(String b, Integer c) 
    {
        JhpRuntime.echo("Hello from func1" + "\\n", c);
        return "Result from func1" + b;
    }
    public static  void func2() 
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
        String name = "Alice";
        Object str = ;
        <<<EOT
我的名字是$name，
这是一段多行文本。
>>>EOT;


foreach ($array as $row) {
    echo $row, ":\n";
    foreach ($row as $k2=>$value) {
        echo $k2, ": ", $value, "\n";
    }
}
func2();
foreach ($map3 as $personInfo) {
    
    foreach ($personInfo as $infoValue) {
        echo  "aaaa\n";
        echo "  ",  $infoValue, "\n";
    }
;
    }
}
