<?php
// ============================================================
// 泛型语法测试文件
// JHP泛型语法：List<: T :>  转换为 Java: List<T>
// 重要：只有 GenericsTest 类有 main() 方法，其他类使用 test() 方法
// ============================================================

// ============================================================
// 测试1: 泛型类定义
// 期望：class Box<:T:> -> class Box<T>
// ============================================================
class Box<:T:> {
    private T $content;

    public function __construct(T $content) {
        $this->content = $content;
    }

    public function get(): T {
        return $this->content;
    }

    public function set(T $content): void {
        $this->content = $content;
    }
}

// ============================================================
// 测试2: 多类型参数泛型类
// 期望：Map<: K, V :> -> Map<K, V>
// ============================================================
class Pair<:K, V:> {
    private K $key;
    private V $value;

    public function __construct(K $key, V $value) {
        $this->key = $key;
        $this->value = $value;
    }

    public function getKey(): K {
        return $this->key;
    }

    public function getValue(): V {
        return $this->value;
    }
}

// ============================================================
// 测试3: 泛型方法
// 期望：function getFirst<:T:>(array<:T:> $arr): T
// ============================================================
class ArrayHelper {
    public static function getFirst<:T:>(array<:T:> $arr): T {
        return $arr[0];
    }

    public static function last<:T:>(array<:T:> $arr): T {
        $len = count($arr);
        return $arr[$len - 1];
    }

    public static function contains<:T:>(array<:T:> $arr, T $item): bool {
        foreach ($arr as $element) {
            if ($element == $item) {
                return true;
            }
        }
        return false;
    }
}

// ============================================================
// 测试4: 嵌套泛型
// 期望：List<: List<: int :> :> -> List<List<Integer>>
// ============================================================
class NestedGenericTest {
    public function test(): void {
        $matrix = [[1, 2], [3, 4]];
        $firstRow = $matrix[0];
        $element = $firstRow[1];

        echo "NestedGenericTest:\n";
        echo "Matrix element[0][1]: " . strval($element) . "\n";
        // 期望输出: Matrix element[0][1]: 2
    }
}

// ============================================================
// 测试5: 泛型接口
// 期望：interface Repository<:T:> -> interface Repository<T>
// ============================================================
interface Repository<:T:> {
    public function find(int $id): T;
    public function save(T $entity): void;
}

class User {
    public int $id = 0;
    public string $name = "";
}

class UserRepository<:T:> implements Repository<:User:> {
    private array $users = [];

    public function find(int $id): User {
        foreach ($this->users as $user) {
            if ($user->id == $id) {
                return $user;
            }
        }
        return new User();
    }

    public function save(User $entity): void {
        $this->users[] = $entity;
    }
}

// ============================================================
// 测试6: 泛型与类型约束
// JHP目前没有extends约束语法，保持简单类型推断
// ============================================================
class ConstrainedGenericTest {
    public function test(): void {
        $box = new Box<:int:>(42);
        $value = $box->get();

        echo "ConstrainedGenericTest:\n";
        echo "Box value: " . strval($value) . "\n";
        // 期望输出: Box value: 42
    }
}

// ============================================================
// 测试7: 复杂泛型嵌套
// 期望：Map<: string, List<: int :> :> -> Map<String, List<Integer>>
// ============================================================
class ComplexGenericTest {
    public function test(): void {
        $data = ["numbers" => [1, 2, 3], "scores" => [90, 85, 92]];
        $numbers = $data["numbers"];
        $firstNum = $numbers[0];

        echo "ComplexGenericTest:\n";
        echo "First number: " . strval($firstNum) . "\n";
        // 期望输出: First number: 1
    }
}

// ============================================================
// 主类（只有此类有 main 方法）
// ============================================================
class GenericsTest {
    public function main(): void {
        echo "=== Generics Test Suite ===\n\n";

        // 泛型类测试
        $intBox = new Box<:int:>(100);
        echo "Box<int>: " . strval($intBox->get()) . "\n";

        $strBox = new Box<:string:>("Hello");
        echo "Box<string>: " . $strBox->get() . "\n";

        // Pair测试
        $pair = new Pair<:string, int:>("age", 25);
        echo "Pair: " . $pair->getKey() . " = " . strval($pair->getValue()) . "\n";

        // 泛型方法测试
        $nums = [1, 2, 3, 4, 5];
        $first = ArrayHelper::getFirst<:int:>($nums);
        echo "First: " . strval($first) . "\n";

        $last = ArrayHelper::last<:int:>($nums);
        echo "Last: " . strval($last) . "\n";

        $hasThree = ArrayHelper::contains<:int:>($nums, 3);
        echo "Contains 3: " . ($hasThree ? "true" : "false") . "\n";

        // 嵌套泛型
        (new NestedGenericTest())->test();
        echo "\n";

        // 复杂泛型
        (new ComplexGenericTest())->test();
        echo "\n";

        echo "=== Generics Tests Completed ===\n";
    }
}
