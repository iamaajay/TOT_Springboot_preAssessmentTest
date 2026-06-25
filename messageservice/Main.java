package com.messageservice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
	public static void main(String... a) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentService ss = context.getBean(StudentService.class);
		ss.msg();
		((AbstractApplicationContext) context).close();
	}
}
