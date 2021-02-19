package com.lvlvstart.cloud.example.company.service;

import com.google.common.collect.Maps;
import com.lvlvstart.cloud.example.company.entity.CompanyUser;
import com.lvlvstart.cloud.example.company.entity.User;
import com.lvlvstart.cloud.example.company.feign.UserFeign;
import com.lvlvstart.cloud.example.company.mapper.CompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zishu.lv@baodanyun-inc.com
 * @description 类描述
 * @create 2021/2/19 17:02
 */
@Service
public class CompanyService {

    @Autowired
    private CompanyMapper companyMapper;

    @Autowired
    private UserFeign userFeign;

    public List<CompanyUser> findAll() {
        List<CompanyUser> all = companyMapper.findAll();
        if(CollectionUtils.isEmpty(all)) {
            return all;
        }
        Map<Long, User> users = users();
        for(CompanyUser companyUser : all) {
            User user = users.get(companyUser.getUserId());
            if(user != null) {
                companyUser.setUsername(user.getUsername());
            }

        }
        return all;

    }


    public Map<Long, User> users() {

        List<User> all = userFeign.findAll();
        if(CollectionUtils.isEmpty(all)) {
            return Maps.newHashMap();
        }

        Map<Long, User> result = Maps.newHashMap();
        for(User user : all) {
            result.put(user.getId(),user);
        }
        return result;
    }



}
