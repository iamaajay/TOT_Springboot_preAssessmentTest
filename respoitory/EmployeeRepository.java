package com.abes.demohrms.respoitory;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.abes.demohrms.model.Employee;

@Repository
public class EmployeeRepository {
	ArrayList<Employee> empList = new ArrayList<>();

	public EmployeeRepository() {

		empList.add(new Employee(100, "ram", "CSE", 4646464, 544111));
		empList.add(new Employee(100, "Aam", "CSE", 400064, 5111));
		empList.add(new Employee(100, "Sam", "CSE", 46464, 54411));
	}

	public ArrayList<Employee> getAllEmployees() {
		return empList;
	}
}