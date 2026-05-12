import runtime.JhpRuntime;
import java.util.*;
import java.util.function.*;
public class ClosureTest {
    public static void main(String[] args)    {
        Function< Integer, Integer > timesTwo = x -> x * 2;
        JhpRuntime.echo("TimesTwo(5): ", timesTwo.apply(5), "\n");
        Function< String, String > greet = name -> "Hello, " + String.valueOf(name);
        JhpRuntime.echo("Greeting: ", greet.apply("World"), "\n");
        Runnable runnable = new Runnable() {
            @Override
            public void run() 
                {
                    JhpRuntime.echo("Running a multi-line closure:\n");
                    for (Integer i = 0; i < 3; i++)
                    {
                        JhpRuntime.echo("  Count: ", i, "\n");
                    }
                }
            };
        runnable.run();
        Integer num = 42;
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() 
            {
                JhpRuntime.echo("Number is: " + String.valueOf(num));
            }
            
        });
        thread.start();
        Function< Integer, String > intToString = new Function< Integer, String >() {
            @Override
            public String apply(Integer num) 
                {
                    String prefix = "Number: ";
                    return String.valueOf(prefix) + String.valueOf(num);
                }
            };
        JhpRuntime.echo("IntToString(42): ", intToString.apply(42), "\n");
        Runnable initTask = new Runnable() {
            @Override
            public void run() 
                {
                    JhpRuntime.echo("Init task executed.\n");
                }
            };
        TaskRunner runner = new TaskRunner(initTask);
        runner.execute();
    }
}
class TaskRunner {
    private Runnable task;
    public  TaskRunner(Runnable task) 
    {
        this.task = task;
    }
    public void execute() 
    {
        JhpRuntime.echo("Executing task...\n");
        this.task();
    }
    public void echoList(List<String> list) 
    {
        for (String item : list) {
            JhpRuntime.echo("Item: ", item, "\n");
        }
    }
    public void task() 
    {
        JhpRuntime.echo("Task executed.\n");
    }
}
