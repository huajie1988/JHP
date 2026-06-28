<?php
// ============================================================
// 枚举语法测试文件 (PHP 8.1+)
// JHP支持 Backed Enum 和 Pure Enum
// 重要：只有 EnumsTest 类有 main() 方法，其他类使用 test() 方法
// ============================================================

// ============================================================
// 测试1: Pure Enum (纯枚举)
// 期望：enum Status -> Java 枚举类
// ============================================================
enum Status {
    case Pending;
    case Active;
    case Closed;
}

class PureEnumTest {
    public function test(): void {
        $status = Status::Active;

        echo "PureEnumTest:\n";
        echo "Status: " . strval($status) . "\n";
        // 期望输出: Status: Active
        // Java: enum Status { PENDING, ACTIVE, CLOSED }
    }
}

// ============================================================
// 测试2: Backed Enum (有值的枚举)
// 期望：enum Priority: int -> Java int枚举
// ============================================================
enum Priority: int {
    case Low = 1;
    case Medium = 2;
    case High = 3;
}

class BackedEnumTest {
    public function test(): void {
        $priority = Priority::High;

        echo "BackedEnumTest:\n";
        echo "Priority: " . strval($priority->value) . "\n";
        // 期望输出: Priority: 3
        // Java: enum Priority { LOW(1), MEDIUM(2), HIGH(3); private final int value; }
    }
}

// ============================================================
// 测试3: String Backed Enum
// 期望：enum Color: string -> Java String枚举
// ============================================================
enum Color: string {
    case Red = "red";
    case Green = "green";
    case Blue = "blue";
}

class StringBackedEnumTest {
    public function test(): void {
        $color = Color::Blue;

        echo "StringBackedEnumTest:\n";
        echo "Color: " . $color->value . "\n";
        // 期望输出: Color: blue
    }
}

// ============================================================
// 测试4: 枚举方法
// 期望：enum 可以有方法
// ============================================================
enum Weekday {
    case Monday;
    case Tuesday;
    case Wednesday;
    case Thursday;
    case Friday;
    case Saturday;
    case Sunday;

    public function isWeekend(): bool {
        return $this == Weekday::Saturday || $this == Weekday::Sunday;
    }

    public function nextDay(): Weekday {
        return match($this) {
            Weekday::Monday => Weekday::Tuesday,
            Weekday::Tuesday => Weekday::Wednesday,
            Weekday::Wednesday => Weekday::Thursday,
            Weekday::Thursday => Weekday::Friday,
            Weekday::Friday => Weekday::Saturday,
            Weekday::Saturday => Weekday::Sunday,
            Weekday::Sunday => Weekday::Monday,
        };
    }
}

class EnumMethodTest {
    public function test(): void {
        $day = Weekday::Friday;

        echo "EnumMethodTest:\n";
        echo "Is Friday weekend? " . ($day->isWeekend() ? "true" : "false") . "\n";
        // 期望输出: Is Friday weekend? false

        $next = $day->nextDay();
        echo "Next day: " . strval($next) . "\n";
        // 期望输出: Next day: Saturday
    }
}

// ============================================================
// 测试5: 枚举实现接口
// 期望：enum implements Interface
// ============================================================
interface Labeled {
    public function getLabel(): string;
}

enum Shape: string implements Labeled {
    case Circle = "circle";
    case Square = "square";
    case Triangle = "triangle";

    public function getLabel(): string {
        return $this->value;
    }
}

class EnumImplementsInterfaceTest {
    public function test(): void {
        $shape = Shape::Circle;

        echo "EnumImplementsInterfaceTest:\n";
        echo "Shape label: " . $shape->getLabel() . "\n";
        // 期望输出: Shape label: circle
    }
}

// ============================================================
// 测试6: 枚举使用match表达式
// ============================================================
class EnumMatchTest {
    public function test(): void {
        $status = Status::Pending;

        $description = match($status) {
            Status::Pending => "Waiting for processing",
            Status::Active => "Currently active",
            Status::Closed => "Has been closed",
        };

        echo "EnumMatchTest:\n";
        echo "Description: " . $description . "\n";
        // 期望输出: Description: Waiting for processing
    }
}

// ============================================================
// 测试7: 枚举常量的其他属性访问
// ============================================================
class EnumPropertiesTest {
    public function test(): void {
        $highPriority = Priority::High;

        echo "EnumPropertiesTest:\n";
        echo "Priority name: " . strval($highPriority->name) . "\n";
        echo "Priority value: " . strval($highPriority->value) . "\n";
        // 期望输出: Priority name: High, Priority value: 3
    }
}

// ============================================================
// 主类（只有此类有 main 方法）
// ============================================================
class EnumsTest {
    public function main(): void {
        echo "=== Enums Test Suite ===\n\n";

        (new PureEnumTest())->test();
        echo "\n";

        (new BackedEnumTest())->test();
        echo "\n";

        (new StringBackedEnumTest())->test();
        echo "\n";

        (new EnumMethodTest())->test();
        echo "\n";

        (new EnumImplementsInterfaceTest())->test();
        echo "\n";

        (new EnumMatchTest())->test();
        echo "\n";

        (new EnumPropertiesTest())->test();
        echo "\n";

        echo "=== Enums Tests Completed ===\n";
    }
}
