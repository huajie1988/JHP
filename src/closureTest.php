<?php

import java\util\*;
import java\util\function\*;

/**
 * 闭包测试类
 */
class ClosureTest {

    /**
     * 主测试入口，类似 Java 的 main
     */
    public static function main(string $args): void {

        // ==========================================
        // 1. 单行箭头函数测试
        // ==========================================
        #[Type("Function<: int, int :>")]
        $timesTwo = fn(int $x) => $x * 2;
        echo "TimesTwo(5): ", $timesTwo(5), "\n";

        #[Type("Function<: string, string :>")]
        $greet = fn(string $name) => "Hello, " . $name;
        echo "Greeting: ", $greet("World"), "\n";

        // ==========================================
        // 2. 多行匿名函数测试
        // ==========================================
        #[Type("Runnable")]
        $runnable = function() : void {
            echo "Running a multi-line closure:\n";
            for ($i = 0; $i < 3; $i++) {
                echo "  Count: ", $i, "\n";
            }
        };
        $runnable();  // 调用 run

        $num = 42;
        $thread = new Thread((Runnable) function() : void {
            echo "Number is: " . $num;
        });
        $thread->start();

        $rr=(Runnable) function() : void {
            echo "这是一个虚拟线程运行的任务";
        };
        Thread::ofVirtual()->start($rr);

        #[Type("Function<: int, string :>")]
        $intToString = function(int $num) : string {
            $prefix = "Number: ";
            return $prefix . $num;
        };
        echo "IntToString(42): ", $intToString(42), "\n";

        // ==========================================
        // 3. 复杂：构造函数套闭包测试
        // ==========================================
        #[Type("Runnable")]
        $initTask = function() : void {
            echo "Init task executed.\n";
        };
        $runner = new TaskRunner($initTask);
        $runner->execute();  // 内部调用 $initTask
    }
}

/**
 * 用于测试构造函数注入闭包的类
 */
class TaskRunner {
    #[Type("Runnable")]
    private Runnable $task;

    public function __construct(Runnable $task) {
        $this->task = $task;
    }

    public function execute(): void {
        echo "Executing task...\n";
        $this->task();
    }

    public function echoList(List<: string :> $list): void {
        foreach ($list as $item) {
            echo "Item: ", $item, "\n";
        }
    }

    public function task(): void {
        echo "Task executed.\n";
    }
}