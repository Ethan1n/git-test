package com.iotek.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.UserDao;
import com.iotek.ssm.entity.User;
import com.iotek.ssm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> findAllUser() {
		return userDao.queryAllUsers();
	}
}
