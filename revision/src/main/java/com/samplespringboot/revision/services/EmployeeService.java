package com.samplespringboot.revision.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.samplespringboot.revision.model.Employee;
import com.samplespringboot.revision.repository.EmployeeRepository;

@Component
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeerepository;

	public List<Employee> getAllEmployee() {
		return employeerepository.getAllEmployee();

	}

	public Employee getEmployeeById(int id) {

		return employeerepository.getEmployeeById(id);
	}

	public Employee createEmployee() {
		// TODO Auto-generated method stub
		return employeerepository.createEmployee();
	}

	public String addEmployee(Employee emp) {
		return employeerepository.addEmployee(emp);
	}

}
