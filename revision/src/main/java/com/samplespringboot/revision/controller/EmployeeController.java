package com.samplespringboot.revision.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.samplespringboot.revision.model.Employee;
import com.samplespringboot.revision.services.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeservice;

	@GetMapping("/emp")
	public List<Employee> showAllEmployee() {
		return employeeservice.getAllEmployee();

	}

	@GetMapping("/emp/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeservice.getEmployeeById(id);

	}

	@PostMapping("/emp/create")
	public Employee CreateEmployee() {
		return employeeservice.createEmployee();
	}

	@PostMapping("/emp/insert")
	public String addNewEmployee(@RequestBody Employee emp) {
		return employeeservice.addEmployee(emp);
	}
}
