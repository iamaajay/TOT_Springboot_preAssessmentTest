package com.messageservice;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements Notification {
	@Override
	public void sendMsg(String msg) {
		System.out.println("Email Message" + msg);
	}
}
