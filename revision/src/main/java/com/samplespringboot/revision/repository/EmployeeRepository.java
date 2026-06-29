package com.samplespringboot.revision.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.samplespringboot.revision.model.Employee;

@Repository
public class EmployeeRepository {
	ArrayList<Employee> employee = new ArrayList<>();

	public EmployeeRepository() {
		employee.add(new Employee("Rahul", 200, "Account", "Google"));
		employee.add(new Employee("Amit", 201, "Software Developer", "Google"));
		employee.add(new Employee("Ram Kishna", 202, "Trainee", "gGoogle"));

	}

	public List<Employee> getAllEmployee() {
		return employee;

	}

	public Employee getEmployeeById(int id) {
		Employee emp = employee.stream().filter((e) -> e.getId() == id).findFirst().orElse(null);
		return emp;
	}

	public Employee createEmployee() {
		Employee emp1 = new Employee("anuj", 205, "Teacher", "ABES");
		employee.add(emp1);
		return (emp1);
	}

	public String addEmployee(Employee emp) {
		employee.add(emp);
		return "Insert Data Sucessfully";
	}
}
