<?php
namespace com\huajie\app\domain;

class Result<:T:> {
    public int $code;
    public string $msg;
    public T $data;

    public function getData(): T {
        return $this->data;
    }
}