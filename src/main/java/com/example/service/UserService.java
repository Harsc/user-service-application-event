package com.example.service;

import com.example.bean.UserBean;
import com.example.event.UserRegisterEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class UserService {


	@Autowired
	private ApplicationContext context;


	public void register(UserBean userBean) {
		context.publishEvent(new UserRegisterEvent(this, userBean));
	}
}
