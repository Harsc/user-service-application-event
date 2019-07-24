package com.example.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author jone
 */
@Component
public class UserRegisterEmailListener implements SmartApplicationListener {
	@Override
	public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
		return false;
	}

	@Override
	public boolean supportsSourceType(Class<?> sourceType) {
		return false;
	}

	@Override
	public int getOrder() {
		return 0;
	}

	@Override
	public void onApplicationEvent(ApplicationEvent event) {

	}
}
