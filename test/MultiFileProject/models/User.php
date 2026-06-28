<?php
// 数据模型：用户类
namespace models;

class User {
    public string $name;
    public int $age;

    public function __construct(string $name, int $age) {
        $this->name = $name;
        $this->age = $age;
    }

    public function getInfo(): string {
        return $this->name . " - " . strval($this->age);
    }
}
