<?php
// namespace App\Model;

include java\util\*;
// import java\math\BigDecimal;

// public interface Person {
//     public function getName() : string;
//     public function getAge() : int;
// }

/**
 * 简单的类测试：包含属性、常量和初始化值。
 */
public abstract class User extends People implements Person, Serializable {
    public int $id;
    public string $name = "Alice";
    private float $score = 3.14;
    protected bool $active;
    public List<: int :> $friendIds = [2, 3, 4];
    public Map<: string, int :> $attributes = ["age" => 30, "level" => 5];
    public List<: Map<: string, string :> :> $complexData = [["key1" => "value1"], ["key2" => "value2"]];
    public static int $instanceCount = 0;


    // 常量定义（支持字面量、数组）
    const DEFAULT_ROLE = "member";
    const List<: int :> ADMIN_IDS = [1, 2, 3];      // 若需要数组
    const float PI = 3.14159;
    const NEG = -10;
    const string CONCAT = "Hello" . "World";
    
    public function __construct(int $id, string $name, bool $active) {
        //PHP中super不是关键字，可以直接使用不处理也行
        super($id, $name, $active);
        //parent::__construct($id, $name, $active);  // 调用父类构造器（如果有）
        parent::init();  // 调用父类初始化方法（如果有）
        $this->id = $id;
        $this->name = $name;
        $this->active = $active;
        $this->init();
    }
    // 方法暂未实现，会生成 // TODO: method declaration
    public abstract function getScore(float $multiplier,float $bonus): double {
        return $this->score * $multiplier + $bonus;
    }

    public abstract function isActive(): bool ;

    public static function incrementInstanceCount(): int {
        // $this->score = 0.0; // 错误示例：静态方法中不能使用 $this 关键字
        User::$instanceCount++;
        self::$instanceCount += 2;
        return self::$instanceCount;
    }
    protected function init(): void {
        $c = PI * 2.0;
        $a = $this->getScore(2.0, 1.0);
        $i = self::incrementInstanceCount();
        $s = "Hello World!$i";
        echo "Score: ", $a, "\n";
    }
}