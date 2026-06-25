package com.messageservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class StudentService {
	private Notification notification;

	@Autowired
	public StudentService(Notification notification) {

		this.notification = notification;
	}

	public void msg() {
		notification.sendMsg("Notification Regarding Exam");
	}

	@PostConstruct
	public void init() {
		System.out.println("Work started after creating object");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("work finish object destroy");
	}

}
