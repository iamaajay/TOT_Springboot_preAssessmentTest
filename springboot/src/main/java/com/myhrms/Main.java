package com.myhrms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String... a) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigure.class);
		Employee emp = context.getBean(Employee.class);
		emp.getData();
	}
}
