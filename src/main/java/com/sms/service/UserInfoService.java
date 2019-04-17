package com.sms.service;

import com.sms.dao.IUserInfoDao;
import com.sms.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

	@Autowired
	private IUserInfoDao dao;
	
	/**
	 * 处理用户登录的逻辑，成功登录返回真，否则返回假
	 * @param username
	 * @param pwd
	 * @return
	 */
	public UserInfo login(String username,String pwd){
		UserInfo user = this.dao.getUserInfoByName(username);
		if(user==null) return null;
		
		if(user.getPassword().equals(pwd)) return user;
		
		return null;
		
	}

}
