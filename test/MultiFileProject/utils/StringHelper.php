<?php
// 工具类：字符串处理
namespace utils;

class StringHelper {
    public static function format(string $template, string $value): string {
        return str_replace("{name}", $value, $template);
    }

    public static function join(array $parts, string $glue): string {
        return implode($glue, $parts);
    }
}
