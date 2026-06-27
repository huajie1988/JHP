package com.huajie.app.service.impl;

import runtime.JhpRuntime;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huajie.app.mapper.UserMapper;
import com.huajie.app.domain.User;
import com.huajie.app.service.UserService;
import org.springframework.stereotype.Service;
@Service
class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    public  User getByEmail( String email) 
    {
        Object list = this.list();
        for (Object user : list) {
            if (user.email == email)
            {
                return user;
            }
        }
        return null;
    }
    public  Integer getByPrice( Integer id) 
    {
        return 1000;
    }
}
