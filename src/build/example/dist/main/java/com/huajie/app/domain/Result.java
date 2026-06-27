package com.huajie.app.domain;

import runtime.JhpRuntime;
class Result<T> {
    public Integer code;
    public String msg;
    public T data;
    public  T getData() 
    {
        return this.data;
    }
}
