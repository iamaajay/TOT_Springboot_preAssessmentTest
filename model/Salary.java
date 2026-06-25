package com.abes.demohrms.model;

public class Salary {
	private String empname;
	private int empid;
	private double da;
	private double basic;
	private double hra;
	private double totalsalary;

	public Salary(String empname, int empid, double da, double basic, double hra, double totalsalary) {
		super();
		this.empname = empname;
		this.empid = empid;
		this.da = da;
		this.basic = basic;
		this.hra = hra;
		this.totalsalary = totalsalary;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
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

	public double getTotalsalary() {
		return totalsalary;
	}

	public void setTotalsalary(double totalsalary) {
		this.totalsalary = totalsalary;
	}

}
