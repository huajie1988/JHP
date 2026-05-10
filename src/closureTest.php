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

    public function task(): void {
        echo "Task executed.\n";
    }
}