<?php
// ============================================================
// 标准PHP文件：不含类，只有顶层语句和函数
// 期望：Mode 1/2 会自动包装在同名类 StandardNoClass 中
// ============================================================

function add(int $a, int $b): int {
    return $a + $b;
}

function greet(string $name): string {
    return "Hello, " . $name;
}

// 变量声明
$numbers = [1, 2, 3, 4, 5];
$sum = 0;

// foreach 循环
foreach ($numbers as $num) {
    $sum += $num;
}

echo greet("World");
echo "\n";
echo "Sum: " . strval($sum);
echo "\n";

$result = add(10, 20);
echo "Result: " . strval($result);
echo "\n";

// if/elseif/else
$x = 15;
if ($x > 20) {
    echo "x > 20";
} elseif ($x > 10) {
    echo "x > 10";
} else {
    echo "x <= 10";
}
echo "\n";

// for 循环
for ($i = 0; $i < 3; $i++) {
    echo "i=" . strval($i);
    echo "\n";
}

// while 循环
$y = 0;
while ($y < 2) {
    $y++;
}
echo "y=" . strval($y);
echo "\n";

// do-while 循环
$z = 0;
do {
    $z++;
} while ($z < 3);
echo "z=" . strval($z);
echo "\n";

// switch 语句
$day = 2;
switch ($day) {
    case 1:
        echo "Monday";
        break;
    case 2:
        echo "Tuesday";
        break;
    default:
        echo "Other day";
}
echo "\n";

// try/catch/finally
try {
    throw new \Exception("Test error");
} catch (\Exception $e) {
    echo "Caught: " . $e->getMessage();
} finally {
    echo " Finally block";
}
echo "\n";
