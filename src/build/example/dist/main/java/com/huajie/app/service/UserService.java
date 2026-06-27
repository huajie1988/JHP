package com.huajie.app.service;

import runtime.JhpRuntime;
import com.baomidou.mybatisplus.extension.service.IService;
import com.huajie.app.domain.User;
interface UserService extends IService<User> {
    public User getByEmail( String email);
    public Integer getByPrice( Integer id);
}
