import runtime.JhpRuntime;
public enum EnumTest {
    NOT_PAID(0, "未支付"),
    PAID(1, "已支付"),
    ;
    private final Integer code;
    private final String message;
    EnumTest(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    public Integer getCode() { return code; }
    public String getMessage() { return message; }
        public static String getMessage(@PathVariable(value="code")  Integer code)
{
    List<EnumTest> list = List.of(EnumTest.values());
    for (EnumTest os : list) {
        if (os.getCode() == code)
        {
            return os.message;
        }
    }
    return null;
}
    }
