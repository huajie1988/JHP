<?php
namespace App\Model;

import java\util\*;  // 翻译为 import java.util.*;
include runtime\JhpRuntime;

//interface UserService extends UserServiceInterface1, UserServiceInterface2{
//    public function getUserById(int $id): User;
//}

/**
 * 用户测试类
 */
//#[JavaDoc(@Service,@Repository)]
//#[JavaDoc(@Data)]
class User {
    // ---------- 成员变量 ----------

    public int $id = 0;
    public string $name = "Alice";
    private float $score = 3.14;
    protected bool $active = true;

    //#[JavaDoc(@Autowired,@Qualifier("userService"))]
    //#[JavaDoc(@Autowired)]
    public UserService $userService;

    public List<: string :> $tags = ["new", "vip"];
    public String $names = "Alice,Bob,Charlie";  // 用于测试字符串函数
    // 列表/映射/嵌套泛型
    public List<: int :> $friendIds = [2, 3, 4];
    public Map<: string, int :> $attributes = ["age" => 30, "level" => 5];
    public List<: Map<: string, string :> :> $complexData = [
        ["key1" => "value1", "key2" => "value2"],
        ["key3" => "value3"]
    ];

    // 静态变量
    public static int $instanceCount = 0;
    private static string $appName = "MyApp";

    // ---------- 常量 ----------
    const string DEFAULT_ROLE = "member";
    const List<: int :> ADMIN_IDS = [1, 2, 3];
    const float PI = 3.14159;
    const int NEG = -10;
    const string CONCAT = "Hello" . "World";

    // ---------- 构造方法 ----------
    public function __construct(int $id, string $name, bool $active) {
        // parent::__construct($id, $name, $active);  // 调用父类构造
        $this->id = $id;
        $this->name = $name;
        $this->active = $active;
        self::$instanceCount++;  // 静态变量自增
        $this->init();
    }

    // ---------- 静态方法 ----------
    public static function getInstanceCount(): int {
        return self::$instanceCount;
    }

    public static function printAppInfo(): void {
        // 在静态方法中访问静态属性
        echo "App: ", self::$appName, " | Instances: ", self::$instanceCount, "\n";
    }

    // ---------- 普通方法 ----------
    //#[JavaDoc(@Override,@Transactional)]
    public function getScore(float $multiplier, float $bonus): double {
        return $this->score * $multiplier + $bonus;
    }

    protected function init(): void {
        // 测试常量、静态方法、取属性值
        $c = self::PI * 2.0;
        echo "Init with PI*2 = ", $c, "\n";

        // 测试 if-else
        if ($this->score > 0) {
            echo "Positive score\n";
        } else {
            echo "Non-positive score\n";
        }

        // 测试 for 循环
        for ($i = 0; $i < count($this->friendIds); $i++) {

            $fid = $this->friendIds[$i];
            echo "Friend[", $i, "] = ", $fid, "\n";
        }

        // 测试 foreach 遍历 List
        foreach ($this->friendIds as $id) {
            echo "Friend ID: ", $id, "\n";
        }

        // 测试 foreach 遍历 Map 带键值
        foreach ($this->attributes as $key => $value) {
            echo $key, " => ", $value, "\n";
        }

        // 测试 foreach 遍历嵌套泛型
        foreach ($this->complexData as $row) {
            echo "Row:\n";
            foreach ($row as $k => $v) {
                echo "  ", $k, ": ", $v, "\n";
            }
        }
    }

    public function display(): void {

        $tagsStr = (string) join(" | ", $this->tags);
        $namesList = split(",", $this->names);
        echo "User: ", $this->name, " (ID: ", $this->id, ")\n";
        echo "Active: ", $this->active ? "true" : "false", "\n";
    }

}