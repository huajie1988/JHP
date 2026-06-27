<?php
namespace com\huajie\app\mapper;

import com\baomidou\mybatisplus\core\mapper\BaseMapper;
import com\huajie\app\domain\User;

interface UserMapper extends BaseMapper<: User :> {
    // 自定义方法可在此添加
}