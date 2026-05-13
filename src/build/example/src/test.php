<?php

// 1. 基础赋值 & 类型推断
// $a = 10;
// $b = 3.5;
// $c = "Hello";
// $d = true;
// $e = false;

// $a += 5;
// 2. 加法、减法、乘法、除法、取模
// $f = $a + 5;        // 20
// $g = $a - 2;        // 8
// $h = $a * $b;       // 35.0 (Double)
// $i = $a / 4;        // 2 (Integer division)
// $j = $a % 3;        // 1

// // 3. 字符串连接
// $k = $c . " World";         // "Hello World"
// $l = $a . $c;               // "10Hello"
// $m = $c . " " . 2026;       // "Hello 2026"

// // 4. 比较运算
// $n = $a > 5;        // true
// $o = $a <= 3;       // false
// $p = $c == "Hello"; // true
// $q = $c != "Hi";    // true
// $r = $a === 10;     // true (PHP全等，Java映射为equals)
// $s = $a === "10";   // false

// 5. 逻辑运算
// $t = $d && $e;      // false
// $u = $d || $e;      // true
// $v = !$e;           // true

// 6. 数组
$list = [1, 2, 3, 4 + 1];        // ArrayList [1,2,3,5]
$map = ["name" => "Alice", "age" => 30];  // HashMap

// 7. 类型转换 (一元)
// $w = (int) $b;          // 3
// $x = (boolean) 0;       // false
// #[Type("String")]
// $y = (string) $a;       // "10"

// 8. 自增自减
// $z = 7;
// $za = ++$z;     // $z=8, $za=8
// $zb = $z++;     // $zb=8, $z=9
// $zc = --$z;     // $z=8, $zc=8
// $zd = $z--;     // $zd=8, $z=7

// 9. 带属性类型标注（假设编译器支持 #[Type("BigDecimal")]）
// #[Type("BigDecimal")]
// $bd = "99.95";  // 若需要可开启，但BigDecimal初始化已移出

// 10. Echo 输出所有结果
// echo $a, "\n";
// echo $a??$b, "\n";
// $cccc=3.6;
// echo 4<=>$b, "\n";
// echo true && false, "\n";
// echo $a**2, "\n";
// echo ($a>0)?($a+1):$b, "\n";
// echo $b, "\n";
// echo $c, "\n";
// echo $d, "\n";
// echo $e, "\n";
// echo $f, "\n";
// echo $g, "\n";
// echo $h, "\n";
// echo $i, "\n";
// echo $j, "\n";
// echo $k, "\n";
// echo $l, "\n";
// echo $m, "\n";
// echo $n, "\n";
// echo $o, "\n";
// echo $p, "\n";
// echo $q, "\n";
// echo $r, "\n";
// echo $s, "\n";
// // echo $t, "\n";
// // echo $u, "\n";
// // echo $v, "\n";
// // 数组echo可能调用runtime，输出取决于runtime实现
echo $list, "\n";
echo $map, "\n";
// // echo $w, "\n";
// // echo $x, "\n";
// // echo $y, "\n";
// echo $z, "\n";
// echo $za, "\n";
// echo $zb, "\n";
// echo $zc, "\n";
// echo $zd, "\n";

// $a = 10;
// if ($a > 5) {
//     echo "big";
//     echo "aaaa\n";
// }else if ($a == 5) {
//     echo "equal";
//     echo "bbbb\n";
// } else {
//     echo "small";
// }

$a = 10;
// while ($a > 5) {
//     echo "big";
//     echo $a, "\n";
//     $a--;
// }

// for ($i=0; $i < 5; $i++) {
//     if($i == 2) {
//         break; // 跳过当前循环
//     }
//     echo "i=", $i, "\n";
// }

// do {
//     echo "a=", $a, "\n";
//     $a--;
// } while ($a > 5);

// switch ($a) {
//     case 10:
//         echo "ten\n";
//         break;
//     case 5:
//         echo "five\n";
//         break;
//     default :
//         echo "other\n";
// }

$array = [
    array(1, 2, 3),
    array(4, 5, 6),
    array(7, 8, 9)
];

// for ($i = 0; $i < 3; $i++) {
//     for ($j = 0; $j < 3; $j++) {
//         echo $array[$i][$j], "\n";
//     }
// }

$map3 = [
    "person1" => ["name" => "Alice", "age" => 30],
    "person2" => ["name" => "Bob", "age" => 25]
];

// echo $list[0], "\n"; // 1
// echo $list[1], "\n"; // 2
// echo $map["name"], "\n"; // "Alice"
// echo $map["age"], "\n"; // 30
// echo $array[0][1], "\n"; // 2
$n = $array[1]; // 6
// $m = $map3["person1"]; // "Alice"

// $array[0][1] = 10;
// $map["age"] = 31;
// $map3["person1"]["name"] = "Alice2";

// $m = ["name" => "Alice3", "age" => 32]; // 重新赋值为新对象，原map3不变

// echo $array[0][1], "\n"; // 10
// echo $map["age"], "\n"; // 31
// echo $map3["person1"]["name"], "\n";
// echo $m["name"], "\n"; // "Alice3"

function func1(string $b,int $c) : string {
    echo "Hello from func1\n",$c;
    return "Result from func1".$b;
}


$fffff = func1(" PHP", 100);

echo $fffff, "\n";
function func2() : void {
    echo "Hello from func2\n";
}

foreach ($array as $row) {
    echo $row, ":\n";
    foreach ($row as $k2=>$value) {
        echo $k2, ": ", $value, "\n";
    }
}
func2();
foreach ($map3 as $personInfo) {
    
    foreach ($personInfo as $infoValue) {
        echo  "aaaa\n";
        echo "  ",  $infoValue, "\n";
    }
}