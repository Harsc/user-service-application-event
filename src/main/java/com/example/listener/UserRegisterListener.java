package com.example.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class UserRegisterListener implements SmartApplicationListener {

//	@EventListener
//	public void register(UserRegisterEvent userRegister) {
//		UserBean userBean = userRegister.getUserBean();
//		System.out.println(userBean);
//	}

	@Override
	public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
		return false;
	}

	@Override
	public void onApplicationEvent(ApplicationEvent event) {

	}

	@Override
	public boolean supportsSourceType(Class<?> sourceType) {
		return false;
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
