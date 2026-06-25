package com.abes.demohrms.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abes.demohrms.model.Employee;
import com.abes.demohrms.respoitory.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employee;

	public ArrayList<Employee> getData() {
		return employee.getAllEmployees();
	}
}
