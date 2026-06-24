package com.myhr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String... a) {
		ApplicationContext text = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp = text.getBean(Employee.class);
		emp.display();
	}
}
