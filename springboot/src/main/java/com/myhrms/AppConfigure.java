package com.myhrms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigure {
	@Bean
	public Employee employee() {
		return new Employee();
	}
}
