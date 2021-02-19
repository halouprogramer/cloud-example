package com.lvlvstart.cloud.example.user.web;

import com.lvlvstart.cloud.example.user.entity.User;
import com.lvlvstart.cloud.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zishu.lv@baodanyun-inc.com
 * @description 类描述
 * @create 2021/2/19 16:17
 */
@RestController
@RequestMapping("/user")
public class UserWeb {


    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }


}
