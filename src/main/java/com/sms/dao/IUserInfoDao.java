package com.sms.dao;

import com.sms.model.UserInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface IUserInfoDao {

    @Select("select * from UserInfo where Username=#{name}")
    public UserInfo getUserInfoByName(String name);
}
