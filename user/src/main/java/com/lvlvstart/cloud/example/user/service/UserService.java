package com.lvlvstart.cloud.example.user.service;

import com.lvlvstart.cloud.example.user.entity.User;
import com.lvlvstart.cloud.example.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zishu.lv@baodanyun-inc.com
 * @description 类描述
 * @create 2021/2/19 16:38
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {
        return userMapper.findAll();
    }
}
