package com.mouritech.feigndemo;

public class Department {

	private Integer depId;
	private String depName;
	private String depLocation;
	
	
	public Department() {
		
	}
	public Department(Integer depId, String depName, String depLocation) {
		super();
		this.depId = depId;
		this.depName = depName;
		this.depLocation = depLocation;
	}
	public Integer getDepId() {
		return depId;
	}
	public void setDepId(Integer depId) {
		this.depId = depId;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public String getDepLocation() {
		return depLocation;
	}
	public void setDepLocation(String depLocation) {
		this.depLocation = depLocation;
	}
	
	
}
