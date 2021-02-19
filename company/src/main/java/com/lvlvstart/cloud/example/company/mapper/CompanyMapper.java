package com.lvlvstart.cloud.example.company.mapper;

import com.lvlvstart.cloud.example.company.entity.CompanyUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zishu.lv@baodanyun-inc.com
 * @description 类描述
 * @create 2021/2/19 16:59
 */
@Mapper
public interface CompanyMapper {

    @Select("select a.user_id as userId,b.company_name as companyName from company_user_ref as a left join company as b on a.comany_id = b.id")
    public List<CompanyUser> findAll();

}
