package com.abes.demohrms.model;

public class Employee {
	private int empid;
	private String name;
	private double salary;

	public Employee(int empid, String name, String department, int mobile, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.department = department;
		this.mobile = mobile;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	String department;
	int mobile;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
}
