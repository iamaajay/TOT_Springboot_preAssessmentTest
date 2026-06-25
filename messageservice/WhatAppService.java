package com.messageservice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class WhatAppService implements Notification {

	@Override
	public void sendMsg(String msg) {
		System.out.println("WhatsApp Message" + msg);
	}
}
