package com.samplespringboot.revision.model;

public class Salary {
	private int empid;
	private String name;
	private double basic;
	private double hra;
	private double da;
	private double totalpay;

	public Salary(int empid, String name, double basic, double hra, double da, double totalpay) {
		super();
		this.empid = empid;
		this.name = name;
		this.basic = basic;
		this.hra = hra;
		this.da = da;
		this.totalpay = totalpay;
	}

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

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}

	public double getTotalpay() {
		return totalpay;
	}

	public void setTotalpay(double totalpay) {
		this.totalpay = totalpay;
	}
}
