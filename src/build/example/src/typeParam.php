<?php

// =============================================
// 泛型容器类 Box<:T:>
// =============================================
class TypeParam {
    public static function main(List<:String:> $args): void {
        $box = new Box<:String:>("Hello, World!");
        #[Type(Function<:string, string:>)]
        $func = function(string $str): string {
            return strtoupper($str);
        };
        $box->transform<:string:>($func);
        #[Type(string)]
        $result = Utils::getFirst<:string:>($someList);
    }
}

class Box<:T:> {
    public T $value;

    public function __construct(T $value) {
        $this->value = $value;
    }

    public function getValue():T {
        return $this->value;
    }

    public function setValue(T $value): void {
        $this->value = $value;
    }

    public function transform<:U:>(Function<:T, U:> $func): U {
        return $func($this->value);
    }
}

// =============================================
// 泛型工具类 Pair<:K, V:>
// =============================================
class Pair<:K, V:> {
    public K $key;
    public V $val;

    public function __construct(K $key, V $val) {
        $this->key = $key;
        $this->val = $val;
    }

    public function getKey(): K {
        return $this->key;
    }

    public function getVal(): V {
        return $this->val;
    }
}

class Utils {
    public static function getFirst<:T:>(List<:T:> $list): T {
        return $list[0];
    }
}
