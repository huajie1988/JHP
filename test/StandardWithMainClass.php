<?php
// ============================================================
// 标准PHP文件：包含多个类，有一个与文件名相同的主类带main函数
// 期望：Mode 3/4 直接输出，不添加包裹类
// 重要：只有 StandardWithMainClass 类有 main() 方法，其他类使用 test() 方法
// ============================================================

// 工具类
class MathHelper {
    public static function sum(int $a, int $b): int {
        return $a + $b;
    }

    public static function multiply(int $a, int $b): int {
        return $a * $b;
    }
}

// 字符串工具类
class StringUtils {
    public static function capitalize(string $str): string {
        return strtoupper($str);
    }

    public static function repeat(string $str, int $times): string {
        $result = "";
        for ($i = 0; $i < $times; $i++) {
            $result = $result . $str;
        }
        return $result;
    }
}

// 主类（与文件名相同，只有此类有 main 方法）
class StandardWithMainClass {
    public function main(): void {
        echo "=== StandardWithMainClass Demo ===\n";

        $sum = MathHelper::sum(10, 20);
        echo "Sum: " . strval($sum) . "\n";

        $product = MathHelper::multiply(5, 6);
        echo "Product: " . strval($product) . "\n";

        $cap = StringUtils::capitalize("hello");
        echo "Capitalized: " . $cap . "\n";

        $repeated = StringUtils::repeat("Ha", 3);
        echo "Repeated: " . $repeated . "\n";
    }
}
