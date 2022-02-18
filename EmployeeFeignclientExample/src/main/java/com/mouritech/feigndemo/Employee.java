package com.mouritech.feigndemo;

public class Employee {
	private Integer empid;
	private String empName;
	private double empSalary;
	private String empLocation;
	
	public Employee(Integer empid, String empName, double empSalary, String empLocation) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empLocation = empLocation;
	}
	public Employee() {
		
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	
}
