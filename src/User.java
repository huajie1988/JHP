package App.Model;

import java.util.*;
import runtime.JhpRuntime;
public class User {
    public Integer id = 0;
    public String name = "Alice";
    private Double score = 3.14;
    protected Boolean active = true;
    public List<String> tags = new ArrayList<>(Arrays.asList("new", "vip"));
    public String names = "Alice,Bob,Charlie";
    public List<Integer> friendIds = new ArrayList<>(Arrays.asList(2, 3, 4));
    public Map<String, Integer> attributes = new HashMap<>() {{
        put("age", 30);
        put("level", 5);
    }};
    public List<Map<String, String>> complexData = new ArrayList<>(Arrays.asList(new HashMap<>() {{
        put("key1", "value1");
        put("key2", "value2");
    }}, new HashMap<>() {{
        put("key3", "value3");
    }}));
    public static Integer instanceCount = 0;
    private static String appName = "MyApp";
    public static final String DEFAULT_ROLE = "member";
    public static final List<Integer> ADMIN_IDS = new ArrayList<>(Arrays.asList(1, 2, 3));
    public static final Double PI = 3.14159;
    public static final Integer NEG = -10;
    public static final String CONCAT = "Hello";
    public  User(Integer id, String name, Boolean active) 
    {
        this.id = id;
        this.name = name;
        this.active = active;
        User.instanceCount++;
        this.init();
    }
    public static Integer getInstanceCount() 
    {
        return User.instanceCount;
    }
    public static void printAppInfo() 
    {
        JhpRuntime.echo("App: ", User.appName, " | Instances: ", User.instanceCount, "\n");
    }
    public Double getScore(Double multiplier, Double bonus) 
    {
        return (this.score * multiplier) + bonus;
    }
    protected void init() 
    {
        Double c = User.PI * 2.0;
        JhpRuntime.echo("Init with PI*2 = ", c, "\n");
        if (this.score > 0)
        {
            JhpRuntime.echo("Positive score\n");
        }
        else
        {
            JhpRuntime.echo("Non-positive score\n");
        }
        for (Integer i = 0; i < JhpRuntime.count(this.friendIds); i++)
        {
            Integer fid = this.friendIds.get(i);
            JhpRuntime.echo("Friend[", i, "] = ", fid, "\n");
        }
        for (Integer id : this.friendIds) {
            JhpRuntime.echo("Friend ID: ", id, "\n");
        }
        for (Map.Entry<String, Integer> key_entry : this.attributes.entrySet()) {
            String key = key_entry.getKey();
            Integer value = key_entry.getValue();
            JhpRuntime.echo(key, " => ", value, "\n");
        }
        for (Map<String, String> row : this.complexData) {
            JhpRuntime.echo("Row:\n");
            for (Map.Entry<String, String> k_entry : row.entrySet()) {
                String k = k_entry.getKey();
                String v = k_entry.getValue();
                JhpRuntime.echo("  ", k, ": ", v, "\n");
            }
        }
    }
    public void display() 
    {
        String tagsStr = ((String) JhpRuntime.join(" | ", this.tags));
        List<String> namesList = JhpRuntime.split(",", this.names);
        JhpRuntime.echo("User: ", this.name, " (ID: ", this.id, ")\n");
        JhpRuntime.echo("Active: ", this.active ? "true" : "false", "\n");
    }
}
