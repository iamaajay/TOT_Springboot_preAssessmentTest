package com.abes.demohrms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@GetMapping("/")
	public String defaultmsg() {
		return "Wlcome to HRMS Portal";
	}

	@GetMapping("/msg")
	public String msg() {
		return "Hey.... I m using Springboot Application";
	}
}
