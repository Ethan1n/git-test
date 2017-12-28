package com.iotek.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iotek.ssm.entity.User;
import com.iotek.ssm.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/showAllUsers")
	public String list(Model model){
		List<User> users = userService.findAllUser();
		model.addAttribute("users", users);
		return "result";
	}
}





