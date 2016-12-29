package com.xzl.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xzl.dao.IUserDao;
import com.xzl.pojo.User;
import com.xzl.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{

	@Resource  
    private IUserDao userDao; 
	@Override
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId); 
	}

}
