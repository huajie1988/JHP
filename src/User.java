import java.util.*;
public abstract class User extends People implements Person, Serializable {
    public Integer id;
    public String name = "Alice";
    private Double score = 3.14;
    protected Boolean active;
    public List<Integer> friendIds = new ArrayList<>(Arrays.asList(2, 3, 4));
    public Map<String, Integer> attributes = new HashMap<>() {{
        put("age", 30);
        put("level", 5);
    }};
    public List<Map<String, String>> complexData = new ArrayList<>(Arrays.asList(new HashMap<>() {{
        put("key1", "value1");
    }}, new HashMap<>() {{
        put("key2", "value2");
    }}));
    public static Integer instanceCount = 0;
    public static final String DEFAULT_ROLE = "member";
    public static final List<Integer> ADMIN_IDS = new ArrayList<>(Arrays.asList(1, 2, 3));
    public static final Double PI = 3.14159;
    public static final Integer NEG = -10;
    public static final String CONCAT = "Hello";
    public  User(Integer id, String name, Boolean active) 
        {
            super(id, name, active);
            super.init();
            this.id = id;
            this.name = name;
            this.active = active;
            this.init();
        }
    public  Double getScore(Double multiplier, Double bonus) 
        {
            return (this.score * multiplier) + bonus;
        }
    public abstract Boolean isActive();
    public static Integer incrementInstanceCount() 
        {
            User.instanceCount++;
            User.instanceCount += 2;
            return User.instanceCount;
        }
    protected void init() 
        {
            Double c = PI * 2.0;
            Double a = this.getScore(2.0, 1.0);
            Integer i = User.incrementInstanceCount();
            String s = "Hello World!$i";
            runtime.JhpRuntime.echo("Score: ", a, "\n");
        }
}
