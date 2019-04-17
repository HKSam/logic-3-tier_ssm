package com.sms.dao;

import com.sms.model.ClassInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface IClassInfoDao {

    @Select("select * from ClassInfo")
    public List<ClassInfo> getAllClassInfos();

    @Delete("delete from ClassInfo where Id=#{id}")
    public void delete(long id);

    @Insert("insert into ClassInfo(Name) values(#{name})")
    public void add(ClassInfo klass);

    @Select("select * from ClassInfo where Id=#{id}")
    public ClassInfo getClassInfoById(long id);

    @Update("update ClassInfo set Name=#{name} where Id=#{id}")
    public void update(ClassInfo klass);
}
