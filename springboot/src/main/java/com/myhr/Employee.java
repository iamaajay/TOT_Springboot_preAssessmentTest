package com.myhr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	String eName = "Ajay";
	String eId = "12";
	int age = 34;
	private Department department;
	private Address address;
	private salary salary;

	@Autowired
	public Employee(Department department, Address address, salary salary1) {
		this.department = department;
		this.address = address;
		this.salary = salary1;
	}

	public void display() {
		System.out.println("***Employee Details******");
		System.out.println("Name=" + eName);
		System.out.println("ID" + eId);
		System.out.println("AGE" + age);
		System.out.println("Department" + department.getName());
		System.out.println("Address" + address.getStreet());
		System.out.println("Salary" + salary.getBasic() + salary.getDa() + salary.getHra() + salary.getSa());
	}
}
