<?php
// ============================================================
// 完整语法测试文件：测试 README 中标注"行为无法预料"的语法
// 期望：Mode 3/4 直接输出，不添加包裹类
// 注意：此文件只包含类定义，不包含普通PHP语法（符合JHP规范）
// 重要：只有 AmbiguousSyntaxTest 类有 main() 方法，其他类使用 test() 方法
// ============================================================

// ============================================================
// 测试1: 动态变量名 ($$var)
// 说明：可能通过 chain 工作，但未充分测试
// 期望：$$varName 展开为 $dynamic，赋值 "dynamic_value"
// ============================================================
class DynamicVarTest {
    public string $dynamic = "default";
    public string $dynamic_value = "from_$$var";

    public function test(): void {
        $varName = "dynamic";
        $$varName = "dynamic_value";  // 相当于 $dynamic = "dynamic_value"

        echo "DynamicVarTest:\n";
        // 期望输出: dynamic_value
        // 注意：Java中无动态变量名对应，可能输出默认值或报错
    }
}

// ============================================================
// 测试2: Mixed 类型提示
// 说明：ObjectType 已支持，但 mixed 关键字未明确处理
// 期望：mixed 参数/返回值 -> Object
// ============================================================
class MixedTypeTest {
    public function processMixed(mixed $value): mixed {
        return $value;
    }

    public function test(): void {
        $str = $this->processMixed("hello");
        $num = $this->processMixed(123);

        echo "MixedTypeTest:\n";
        // 期望输出: hello 和 123 的某种表示
        // Java: public Object processMixed(Object value) { return value; }
    }
}

// ============================================================
// 测试3: unset() 强制转换
// 说明：语法中有但代码未处理
// 期望：unset($arr[0]) 可能被忽略或产生副作用
// ============================================================
class UnsetCastTest {
    public array $data = [1, 2, 3];

    public function testUnset(): array {
        $arr = [10, 20, 30];
        unset($arr[0]);  // 可能未正确处理

        return $arr;  // 期望: [20, 30] 或 原数组
    }

    public function test(): void {
        $result = $this->testUnset();
        echo "UnsetCastTest:\n";
        // 期望输出取决于unset实现
    }
}

// ============================================================
// 测试4: 匿名类
// 说明：语法支持但生成代码为 Object
// 期望：new class { ... } -> Object 类型
// ============================================================
class AnonymousClassTest {
    public Object $anonymousObj;

    public function test(): void {
        $this->anonymousObj = new class {
            public string $value = "anonymous";

            public function getValue(): string {
                return $this->value;
            }
        };

        echo "AnonymousClassTest:\n";
        // 注意：Java中匿名类会保留，但类型为Object，调用需要反射
    }
}

// ============================================================
// 测试5: 反引号字符串
// 说明：词法分析器有 BackQuoteString 但未使用
// 期望：`echo "test"` 可能被忽略或当作普通字符串
// ============================================================
class BackQuoteStringTest {
    public string $shellResult = "";

    public function test(): void {
        // 反引号字符串在PHP中是shell命令执行
        // Java无对应功能，可能忽略或保留为字符串
        $this->shellResult = `echo "test"`;

        echo "BackQuoteStringTest:\n";
        // 期望输出: 空字符串或 "test"
    }
}

// ============================================================
// 测试6: trait 语句
// 说明：能解析但输出警告"不支持"
// 期望：trait 当作普通类处理
// ============================================================
trait MyTrait {
    public string $traitProperty = "trait_value";

    public function traitMethod(): string {
        return "from trait";
    }
}

class TraitTest {
    use MyTrait;

    public function test(): void {
        echo "TraitTest:\n";
        echo $this->traitMethod();
        echo "\n";
        // 期望输出: from trait (可能带警告)
    }
}

// ============================================================
// 测试7: 任意表达式上的注解
// 说明：attributes expressionStatement 规则存在但覆盖不完整
// 期望：#[Attribute] ($expr) 形式的注解可能不被正确处理
// ============================================================
#[\Attribute]
class CustomAttribute {}

class AttributeOnExpressionTest {
    public int $exprValue = 0;

    public function test(): void {
        // 表达式上的注解 - JHP可能不完全支持
        #[\Attribute]
        ($this->exprValue = 123);

        echo "AttributeOnExpressionTest:\n";
        echo strval($this->exprValue);
        echo "\n";
    }
}

// ============================================================
// 测试8: 冒号风格替代语法
// 说明：基本可解析但未完全验证
// 期望：endif;、endwhile; 等可能正确解析
// ============================================================
class ColonStyleSyntaxTest {
    public string $output = "";

    public function test(): void {
        $x = 10;
        if ($x > 5):
            $this->output = $this->output . "x>5 ";
        endif;

        $i = 0;
        while ($i < 3):
            $this->output = $this->output . strval($i) . " ";
            $i++;
        endwhile;

        $j = 0;
        for ($j = 0; $j < 2; $j++):
            $this->output = $this->output . "for ";
        endfor;

        echo "ColonStyleSyntaxTest:\n";
        echo $this->output;
        echo "\n";
        // 期望输出: x>5 0 1 2 for for
    }
}

// ============================================================
// 测试9: clone 表达式
// 说明：已实现但行为依赖于类复制或构造函数处理
// ============================================================
class CloneableClass {
    public string $name = "original";

    public function setName(string $name): void {
        $this->name = $name;
    }
}

class CloneExpressionTest {
    public function test(): void {
        $obj1 = new CloneableClass();
        $obj2 = clone $obj1;
        $obj2->setName("cloned");

        echo "CloneExpressionTest:\n";
        echo "obj1.name = " . $obj1->name . "\n";  // 期望: original
        echo "obj2.name = " . $obj2->name . "\n";  // 期望: cloned
    }
}

// ============================================================
// 测试10: static 变量声明
// 说明：函数内 static $var 声明未完全支持
// 期望：static 变量可能作为实例变量处理
// ============================================================
class StaticVarTest {
    public int $counter = 0;

    public function increment(): int {
        // PHP中 static $counter 会保持状态
        // Java无对应概念，可能每次重置为0
        $this->counter += 1;
        return $this->counter;
    }

    public function test(): void {
        echo "StaticVarTest:\n";
        echo strval($this->increment());  // 期望: 1
        echo " ";
        echo strval($this->increment());  // 期望: 2 (PHP), 1 (Java)
        echo "\n";
    }
}

// ============================================================
// 主类：运行所有测试（只有此类有 main 方法）
// ============================================================
class AmbiguousSyntaxTest {
    public function main(): void {
        echo "=== Ambiguous Syntax Test Suite ===\n\n";

        (new DynamicVarTest())->test();
        echo "\n";

        (new MixedTypeTest())->test();
        echo "\n";

        (new UnsetCastTest())->test();
        echo "\n";

        (new AnonymousClassTest())->test();
        echo "\n";

        (new BackQuoteStringTest())->test();
        echo "\n";

        (new TraitTest())->test();
        echo "\n";

        (new AttributeOnExpressionTest())->test();
        echo "\n";

        (new ColonStyleSyntaxTest())->test();
        echo "\n";

        (new CloneExpressionTest())->test();
        echo "\n";

        (new StaticVarTest())->test();
        echo "\n";

        echo "=== All Tests Completed ===\n";
    }
}
