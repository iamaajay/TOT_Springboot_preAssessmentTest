package com.abes.demohrms.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abes.demohrms.model.Employee;
import com.abes.demohrms.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeservice;

	@GetMapping("/emp")
	public ArrayList<Employee> getAllEmployee() {
		return employeeservice.getData();
	}
}
