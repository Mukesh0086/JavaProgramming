package com.clinique.model;

public class Patient {
	
	String name;
	String disease;
	String department;
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(String name, String disease, String department) {
		super();
		this.name = name;
		this.disease = disease;
		this.department = department;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	

}
