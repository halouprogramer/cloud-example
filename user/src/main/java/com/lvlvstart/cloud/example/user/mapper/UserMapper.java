package com.lvlvstart.cloud.example.user.mapper;

import com.lvlvstart.cloud.example.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zishu.lv@baodanyun-inc.com
 * @description 类描述
 * @create 2021/2/19 16:33
 */
@Mapper
public interface UserMapper {

    @Select("select id , username from user ")
    public List<User> findAll();
}
