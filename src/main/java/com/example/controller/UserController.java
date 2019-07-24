package com.example.controller;

import com.example.bean.UserBean;
import com.example.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jone
 */
@RestController
public class UserController {


	@Autowired
	private UserService userService;


	@GetMapping("/reg")
	public String register() {
		UserBean userBean = new UserBean();
		userBean.setName("acc");
		userBean.setPassword("jsdjleojdasfjl");
		userService.register(userBean);
		return "success";
	}
}
