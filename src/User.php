<?php
// namespace App\Model;

include java\util\*;
// import java\math\BigDecimal;
/**
 * 简单的类测试：包含属性、常量和初始化值。
 */
class User {
    public int $id;
    public string $name = "Alice";
    private float $score = 3.14;
    protected bool $active;
    public List<: int :> $friendIds = [2, 3, 4];
    public Map<: string, int :> $attributes = ["age" => 30, "level" => 5];
    public List<: Map<: string, string :> :> $complexData = [["key1" => "value1"], ["key2" => "value2"]];
    
    // 常量定义（支持字面量、数组）
    const DEFAULT_ROLE = "member";
    const List<: int :> ADMIN_IDS = [1, 2, 3];      // 若需要数组
    const float PI = 3.14159;
    const NEG = -10;
    const string CONCAT = "Hello" . "World";
    
    public function __construct(int $id, string $name, bool $active) {
        $this->id = $id;
        $this->name = $name;
        $this->active = $active;
        $this->init();
    }
    // 方法暂未实现，会生成 // TODO: method declaration
    public function getScore(float $multiplier,float $bonus): double {
        return $this->score * $multiplier + $bonus;
    }

    protected function init(): void {
        $c = PI * 2.0;
        $a = $this->getScore(2.0, 1.0);
        echo "Score: ", $a, "\n";
    }
}