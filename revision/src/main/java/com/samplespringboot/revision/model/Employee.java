package com.samplespringboot.revision.model;

public class Employee {
	public Employee(String name, int id, String department, String company) {
		super();
		this.name = name;
		this.id = id;
		this.department = department;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	private String name;
	private int id;
	private String department;
	private String company;

}
