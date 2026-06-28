<?php
// ============================================================
// 闭包语法测试文件
// 支持: 箭头函数(fn), 多行闭包(function), 闭包注解
// 重要：只有 ClosuresTest 类有 main() 方法，其他类使用 test() 方法
// ============================================================

// ============================================================
// 测试1: 箭头函数 (PHP 7.4+)
// 期望：fn($x) => $x * 2 -> Java lambda ($x) -> $x * 2
// ============================================================
class ArrowFunctionTest {
    public function test(): void {
        // 基本箭头函数
        $double = fn($x) => $x * 2;
        $result = $double(5);

        echo "ArrowFunctionTest:\n";
        echo "double(5) = " . strval($result) . "\n";
        // 期望输出: double(5) = 10

        // 带显式返回类型的箭头函数 (JHP扩展)
        $triple = fn($x): int => $x * 3;
        echo "triple(4) = " . strval($triple(4)) . "\n";
        // 期望输出: triple(4) = 12

        // 多参数的箭头函数
        $add = fn($a, $b) => $a + $b;
        echo "add(3, 7) = " . strval($add(3, 7)) . "\n";
        // 期望输出: add(3, 7) = 10
    }
}

// ============================================================
// 测试2: 多行闭包 (需要注解指定函数式接口)
// 期望：#[Type("Function<Integer, String>")] -> 匿名内部类
// ============================================================
#[\Attribute]
class Type {
    public string $value;
    public function __construct(string $value) {
        $this->value = $value;
    }
}

class MultiLineClosureTest {
    public function test(): void {
        // 使用注解指定函数式接口
        $convert = #[\Type("Function<Integer, String>")]
            function(int $x): string {
                return strval($x * $x);
            };

        echo "MultiLineClosureTest:\n";
        echo "convert(6) = " . $convert(6) . "\n";
        // 期望输出: convert(6) = 36

        // 多参数闭包
        $calculate = #[\Type("Function<Integer, Integer, Integer>")]
            function(int $a, int $b): int {
                return ($a + $b) * ($a - $b);
            };

        echo "calculate(10, 3) = " . strval($calculate(10, 3)) . "\n";
        // 期望输出: calculate(10, 3) = 91
    }
}

// ============================================================
// 测试3: 闭包作为参数
// 期望：function(callable $fn) -> function(Object fn)
// ============================================================
class ClosureAsParameterTest {
    public function applyOperation(int $value, #[\Type("Function<Integer, Integer>")] $operation): int {
        return $operation($value);
    }

    public function test(): void {
        $square = fn($x) => $x * $x;
        $result = $this->applyOperation(7, $square);

        echo "ClosureAsParameterTest:\n";
        echo "applyOperation(7, square) = " . strval($result) . "\n";
        // 期望输出: applyOperation(7, square) = 49
    }
}

// ============================================================
// 测试4: 闭包作为返回值
// 期望：function(): callable -> function(): Object
// ============================================================
class ClosureAsReturnTest {
    #[\Type("Function<Integer, Integer>")]
    public function createMultiplier(int $factor) {
        return fn($x) => $x * $factor;
    }

    public function test(): void {
        $triple = $this->createMultiplier(3);
        $result = $triple(5);

        echo "ClosureAsReturnTest:\n";
        echo "createMultiplier(3)(5) = " . strval($result) . "\n";
        // 期望输出: createMultiplier(3)(5) = 15
    }
}

// ============================================================
// 测试5: 闭包捕获外部变量 (use)
// 注意：Java lambda 以不同方式捕获外部变量
// ============================================================
class ClosureCaptureTest {
    public function test(): void {
        $base = 10;
        // PHP: $addBase = function($x) use ($base) { return $x + $base; };
        // JHP: 通过闭包注解 + 构造函数方式
        $addBase = #[\Type("Function<Integer, Integer>")]
            function(int $x) use ($base) {
                return $x + $base;
            };

        echo "ClosureCaptureTest:\n";
        echo "addBase(5) with base=10 = " . strval($addBase(5)) . "\n";
        // 注意：Java无对应use语法，变量捕获行为可能不同
    }
}

// ============================================================
// 测试6: 箭头函数中的外部变量自动捕获
// PHP箭头函数自动捕获外部变量 (by value)
// ============================================================
class ArrowClosureCaptureTest {
    public function test(): void {
        $multiplier = 3;

        // 箭头函数自动捕获 $multiplier
        $multiply = fn($x) => $x * $multiplier;

        echo "ArrowClosureCaptureTest:\n";
        echo "multiply(4) with multiplier=3 = " . strval($multiply(4)) . "\n";
        // 期望输出: multiply(4) with multiplier=3 = 12
    }
}

// ============================================================
// 测试7: 内联箭头函数
// ============================================================
class InlineArrowClosureTest {
    public function test(): void {
        $numbers = [1, 2, 3, 4, 5];

        // 在数组映射中使用箭头函数
        $doubled = array_map(fn($x) => $x * 2, $numbers);

        echo "InlineArrowClosureTest:\n";
        echo "Original: [1,2,3,4,5]\n";
        echo "Doubled: ";
        foreach ($doubled as $n) {
            echo strval($n) . " ";
        }
        echo "\n";
        // 期望输出: Doubled: 2 4 6 8 10
    }
}

// ============================================================
// 测试8: 闭包与数组操作
// ============================================================
class ClosureArrayOpsTest {
    public function test(): void {
        $numbers = [5, 2, 8, 1, 9];

        // 使用闭包的数组过滤
        $filtered = array_filter($numbers, fn($x) => $x > 4);

        // 使用闭包的数组转换
        $mapped = array_map(fn($x) => $x * 10, $filtered);

        echo "ClosureArrayOpsTest:\n";
        echo "Filtered (>4): ";
        foreach ($filtered as $n) {
            echo strval($n) . " ";
        }
        echo "\nMapped (*10): ";
        foreach ($mapped as $n) {
            echo strval($n) . " ";
        }
        echo "\n";
        // 期望输出: Filtered (>4): 5 8 9, Mapped (*10): 50 80 90
    }
}

// ============================================================
// 测试9: 无参数的箭头函数
// ============================================================
class NoArgArrowClosureTest {
    public function test(): void {
        $getValue = fn() => 42;
        $result = $getValue();

        echo "NoArgArrowClosureTest:\n";
        echo "getValue() = " . strval($result) . "\n";
        // 期望输出: getValue() = 42
    }
}

// ============================================================
// 测试10: 闭包中的类型声明
// ============================================================
class TypedClosureTest {
    public function test(): void {
        $add = #[\Type("Function<Integer, Integer, Integer>")]
            function(int $a, int $b): int {
                return $a + $b;
            };

        $concat = #[\Type("Function<String, String, String>")]
            function(string $a, string $b): string {
                return $a . $b;
            };

        echo "TypedClosureTest:\n";
        echo "add(3, 5) = " . strval($add(3, 5)) . "\n";
        echo "concat(\"Hello\", \"World\") = " . $concat("Hello", "World") . "\n";
        // 期望输出: add(3, 5) = 8, concat("Hello", "World") = HelloWorld
    }
}

// ============================================================
// 主类（只有此类有 main 方法）
// ============================================================
class ClosuresTest {
    public function main(): void {
        echo "=== Closures Test Suite ===\n\n";

        (new ArrowFunctionTest())->test();
        echo "\n";

        (new MultiLineClosureTest())->test();
        echo "\n";

        (new ClosureAsParameterTest())->test();
        echo "\n";

        (new ClosureAsReturnTest())->test();
        echo "\n";

        (new ClosureCaptureTest())->test();
        echo "\n";

        (new ArrowClosureCaptureTest())->test();
        echo "\n";

        (new InlineArrowClosureTest())->test();
        echo "\n";

        (new ClosureArrayOpsTest())->test();
        echo "\n";

        (new NoArgArrowClosureTest())->test();
        echo "\n";

        (new TypedClosureTest())->test();
        echo "\n";

        echo "=== Closures Tests Completed ===\n";
    }
}
