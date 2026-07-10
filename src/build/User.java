package App.Model;

import runtime.JhpRuntime;

import java.math.BigDecimal;
import java.util.*;
@Service
@Repository
@Data
class User {
    public Integer id = 0;
    public String name = "Alice";
    private Double score = 3.14;
    protected Boolean active = true;
    public UserService userService;
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
    public   User( Integer id,  String name,  Boolean active) 
    {
        this.id = id;
        this.name = name;
        this.active = active;
        User.instanceCount++;
        this.init();
    }
    public static  Integer getInstanceCount() 
    {
        return User.instanceCount;
    }
    public static  void printAppInfo() 
    {
        JhpRuntime.echo("App: ", User.appName, " | Instances: ", User.instanceCount, "\\n");
    }
    @Override
    @Transactional
    @GETMAPPING(value="/users/{id}")
    @cron("0 0 0/1 * * *")
    public  Double getScore( Double multiplier,  Double bonus) 
    {
        return (this.score * multiplier) + bonus;
    }
    protected  void init() 
    {
        Double c = User.PI * 2.0;
        JhpRuntime.echo("Init with PI*2 = ", c, "\\n");
        if (this.score > 0)
        {
            JhpRuntime.echo("Positive score" + "\\n");
        }
        else
        {
            JhpRuntime.echo("Non-positive score" + "\\n");
        }
        for (Integer i = 0; i < JhpRuntime.count(this.friendIds); i++)
        {
            Integer fid = this.friendIds.get(i);
            JhpRuntime.echo("Friend[", i, "] = ", fid, "\\n");
        }
        for (Integer id : this.friendIds) {
            JhpRuntime.echo("Friend ID: ", id, "\\n");
        }
        for (Map.Entry<String, Integer> key_entry : this.attributes.entrySet()) {
            String key = key_entry.getKey();
            Integer value = key_entry.getValue();
            JhpRuntime.echo(key, " => ", value, "\\n");
        }
        for (Map<String, String> row : this.complexData) {
            JhpRuntime.echo("Row:" + "\\n");
            for (Map.Entry<String, String> k_entry : row.entrySet()) {
                String k = k_entry.getKey();
                String v = k_entry.getValue();
                JhpRuntime.echo("  ", k, ": ", v, "\\n");
            }
        }
    }
    public  void display() 
    {
        User a = new User();
        Boolean b = a instanceof User;
        JhpRuntime.echo(b);
        String tagsStr = ((String) JhpRuntime.join(" | ", this.tags));
        List<String> namesList = JhpRuntime.split(",", this.names);
        JhpRuntime.echo("用户: " + this.name + ",ID:" + this.id + " " + "\\n");
        Integer age = userService.getAgeById(this.id);
        JhpRuntime.echo("Tags: $tagsStr \\n");
        String name = "Alice";
        JhpRuntime.echo("name is " + this.name + "\\n");
        JhpRuntime.echo("name is " + name + "\\n");
        String str = "\r\n            我的名字是" + this.name + "，\r\n            这是一段多行" + name + "文本。\r\n";
        JhpRuntime.echo(str);
        String sptext = JhpRuntime.sprintf("我的名字是%s，%s", this.name, name);
        JhpRuntime.echo("Active: ", this.active ? "true" : "false", "\\n");
    }
    @GetMapping(value="/getInfo/{openId}")
    public  ResultVO getInfo(@PathVariable(value="openId")  String openId, @RequestHeader(value="token")  String token) 
    {
        Customer customer = authService.getCustomerByToken(token);
        if (!customer.getWxOpenid().equals(openId))
        {
            return new ResultVO(ResultCodeEnum.ACCOUNT_DISABLED, null);
        }
        BigDecimal balance = new BigDecimal(10);
        try 
        {
            customer = customerService.getCustomerByOpenId(openId);
            throw new Exception("aaasss");
        }
        catch (Exception e) 
        {
            return new ResultVO(ResultCodeEnum.ACCOUNT_NOT_EXIST, null);
        }
        finally 
        {
            return new ResultVO(ResultCodeEnum.SUCCESS, customer);
        }
        Customer customerReal = customerService.getCustomerByOpenId(openId);
        customerReal.setPassword("******");
        return new ResultVO(ResultCodeEnum.SUCCESS, customerReal);
    }
    public  void test( Integer... args) 
    {
        for (Integer i = 0; i < args.length; i++)
        {
            JhpRuntime.echo(JhpRuntime.arrayGet(args, i));
        }
    }
}
