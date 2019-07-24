package com.example.event;

import com.example.bean.UserBean;
import lombok.Getter;

import org.springframework.context.ApplicationEvent;


/**
 * @Author: zj
 * @Date: 2019/7/24
 * @Description: UserRegisterEvent
 */
@Getter
public class UserRegisterEvent extends ApplicationEvent {

	private UserBean userBean;

	/**
	 *
	 * @param source
	 * @param userBean
	 */
	public UserRegisterEvent(Object source, UserBean userBean) {
		super(source);
		this.userBean = userBean;
	}
}
