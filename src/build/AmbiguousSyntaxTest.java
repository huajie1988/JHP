import runtime.JhpRuntime;
class DynamicVarTest {
    public String dynamic = "default";
    public String dynamic_value = "from_$$var";
    public  void test() 
    {
        String varName = "dynamic";
        String $varName = "dynamic_value";
        JhpRuntime.echo("DynamicVarTest:" + "\\n");
    }
}
class MixedTypeTest {
    public  mixed processMixed( mixed value) 
    {
        return value;
    }
    public  void test() 
    {
        mixed str = this.processMixed("hello");
        mixed num = this.processMixed(123);
        JhpRuntime.echo("MixedTypeTest:" + "\\n");
    }
}
class UnsetCastTest {
    public List<Integer> data = new ArrayList<>(Arrays.asList(1, 2, 3));
    public  array testUnset() 
    {
        List<Integer> arr = new ArrayList<>(Arrays.asList(10, 20, 30));
        return arr;
    }
    public  void test() 
    {
        array result = this.testUnset();
        JhpRuntime.echo("UnsetCastTest:" + "\\n");
    }
}
interface HelloWorld {
    public void greet();
    public void greetSomeone( String someone);
}
class AnonymousClassTest {
    public Object anonymousObj;
    public  void test() 
    {
        HelloWorld s = new HelloWorld()        {
            public  void greet() 
            {
                JhpRuntime.echo("Hello, World!");
            }
            public  void greetSomeone( String someone) 
            {
                JhpRuntime.echo(("Hello, " + someone) + "!");
            }
        };
        JhpRuntime.echo("AnonymousClassTest:" + "\\n");
    }
}
class BackQuoteStringTest {
    public String shellResult = "";
    public  void test() 
    {
        this.shellResult = "echo \"test\"";
        JhpRuntime.echo("BackQuoteStringTest:" + "\\n");
    }
}
class MyTrait {
    public String traitProperty = "trait_value";
    public  String traitMethod() 
    {
        return "from trait";
    }
}
class TraitTest {
    The trait use statement is not supported yet; skipping.
    public  void test() 
    {
        JhpRuntime.echo("TraitTest:" + "\\n");
        JhpRuntime.echo(this.traitMethod());
        JhpRuntime.echo("\\n");
    }
}
class CustomAttribute {
}
class AttributeOnExpressionTest {
    public Integer exprValue = 0;
    public  void test() 
    {
        this.exprValue = 123;
        JhpRuntime.echo("AttributeOnExpressionTest:" + "\\n");
        JhpRuntime.echo(strval(this.exprValue));
        JhpRuntime.echo("\\n");
    }
}
class ColonStyleSyntaxTest {
    public String output = "";
    public  void test() 
    {
        Integer x = 10;
        if (x > 5){
            this.output = this.output + "x>5 ";
        }
        Integer i = 0;
        while (i < 3)
        {
            this.output = (this.output + String.valueOf(strval(i))) + " ";
            i++;
        }
        Integer j = 0;
        for (j = 0; j < 2; j++)
        {
            this.output = this.output + "for ";
        }
        JhpRuntime.echo("ColonStyleSyntaxTest:" + "\\n");
        JhpRuntime.echo(this.output);
        JhpRuntime.echo("\\n");
    }
}
class CloneableClass {
    public String name = "original";
    public  void setName( String name) 
    {
        this.name = name;
    }
}
class CloneExpressionTest {
    public  void test() 
    {
        CloneableClass obj1 = new CloneableClass();
        CloneableClass obj2 = (CloneableClass) JhpRuntime.cloneObject(obj1);
        obj2.setName("cloned");
        JhpRuntime.echo("CloneExpressionTest:" + "\\n");
        JhpRuntime.echo(("obj1.name = " + String.valueOf(obj1.name)) + "\\n");
        JhpRuntime.echo(("obj2.name = " + String.valueOf(obj2.name)) + "\\n");
    }
}
class StaticVarTest {
    public Integer counter = 0;
    public  Integer increment() 
    {
        this.counter += 1;
        return this.counter;
    }
    public  void test() 
    {
        JhpRuntime.echo("StaticVarTest:" + "\\n");
        JhpRuntime.echo(strval(this.increment()));
        JhpRuntime.echo(" ");
        JhpRuntime.echo(strval(this.increment()));
        JhpRuntime.echo("\\n");
    }
}
class AmbiguousSyntaxTest {
    public static void main(String[] args)    {
        JhpRuntime.echo("=== Ambiguous Syntax Test Suite ===" + "\\n" + "\\n");
        DynamicVarTest d = new DynamicVarTest();
        d.test();
        JhpRuntime.echo("\\n");
        (new MixedTypeTest()).test();
        JhpRuntime.echo("\\n");
        (new AnonymousClassTest()).test();
        JhpRuntime.echo("\\n");
        (new BackQuoteStringTest()).test();
        JhpRuntime.echo("\\n");
        (new TraitTest()).test();
        JhpRuntime.echo("\\n");
        (new AttributeOnExpressionTest()).test();
        JhpRuntime.echo("\\n");
        (new CloneExpressionTest()).test();
        JhpRuntime.echo("\\n");
        (new StaticVarTest()).test();
        JhpRuntime.echo("\\n");
        JhpRuntime.echo("=== All Tests Completed ===" + "\\n");
    }
}
