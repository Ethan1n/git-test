package com.iotek.ssm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iotek.ssm.dao.UserDao;
import com.iotek.ssm.entity.User;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TestDao {
	
	@Autowired
	private UserDao userDao;
	
	@Test
	public void testQueryAllUsers(){
/*		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao = (UserDao) ctx.getBean("userDao");
*/		List<User> users = userDao.queryAllUsers();
		System.out.println(users);
	}
}
