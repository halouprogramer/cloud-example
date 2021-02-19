package com.lvlvstart.cloud.example.company.web;

import com.lvlvstart.cloud.example.company.entity.CompanyUser;
import com.lvlvstart.cloud.example.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zishu.lv@baodanyun-inc.com
 * @description 类描述
 * @create 2021/2/19 17:14
 */
@RequestMapping("/company")
@RestController
public class CompanyWeb {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/findAll")
    public List<CompanyUser> findAll() {
        return companyService.findAll();
    }
}
