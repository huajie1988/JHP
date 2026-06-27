package com.huajie.app.domain;

import runtime.JhpRuntime;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
@Data
@TableName("user")
class User {
    @TableId(type=IdType.AUTO)
    public Integer id;
    public String name;
    public String email;
    public Integer age;
}
