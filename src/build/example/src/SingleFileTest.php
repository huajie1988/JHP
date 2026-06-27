<?php
namespace com\huajie\app\test;

/**
 * 普通实体类
 */
class Person {
    public string $name;
    public int $age;
}

/**
 * 普通服务类（非泛型）
 */
class PersonService {
    public function getPerson(): Person {
        $person = new Person();
        $person->name = "张三";
        $person->age = 28;
        return $person;
    }
    public function getBalance(): float {
        return 100.0;
    }
}

/**
 * 泛型容器类
 */
class Box<:T:> {
    public T $value;

    public function getValue(): T {
        return $this->value;
    }
}

// ========== 入口（类似 main 方法） ==========
class SingleFileTest {
    public static function main(string $args): void {
        // 1. 非泛型跨类调用推断
        $service = new PersonService();
        $person = $service->getPerson();
        // 如果推断成功，$person 为 Person，下面代码将正常编译
        $balance = $service->getBalance();
        echo "姓名: ", $person->name, "\n";
        echo "年龄: ", $person->age, "\n";
        echo "余额: ", $balance, "\n";

        // 2. 泛型跨类调用推断
        $box = new Box<:Person:>();
        $box->value = $person;
        $p = $box->getValue();   // 推断 $p 为 Person
        echo "再次确认姓名: ", $p->name, "\n";
    }
}