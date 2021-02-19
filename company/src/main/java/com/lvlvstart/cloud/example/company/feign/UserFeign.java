package com.lvlvstart.cloud.example.company.feign;

import com.lvlvstart.cloud.example.company.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author zishu.lv@baodanyun-inc.com
 * @description 类描述
 * @create 2021/2/19 17:04
 */
@FeignClient(value = "user",url = "${user.address}")
public interface UserFeign {

    @GetMapping("/user/findAll")
    List<User> findAll();

}
