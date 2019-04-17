package com.sms.service;

import com.sms.dao.IClassInfoDao;
import com.sms.model.ClassInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassInfoService {

    @Autowired
    private IClassInfoDao dao;

    public List<ClassInfo> getClassInfos(){
        return this.dao.getAllClassInfos();
    }

    public void deleteClassInfo(long id){

        this.dao.delete(id);
    }

    public void addClassInfo(ClassInfo klass){
        this.dao.add(klass);
    }

    public ClassInfo getClassInfo(long id){
        return this.dao.getClassInfoById(id);
    }

    public void updateClassInfo(ClassInfo klass){
        this.dao.update(klass);
    }

}
