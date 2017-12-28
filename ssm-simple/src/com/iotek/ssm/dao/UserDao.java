package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.User;

public interface UserDao {
	public List<User> queryAllUsers();
}
