package com.clinique.model;

public class Doctor {
	
	String name;
	long id;
	String specialization;
	String availability;
	
	
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Doctor(String name, long id, String specialization, String availability) {
		super();
		this.name = name;
		this.id = id;
		this.specialization = specialization;
		this.availability = availability;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
	
	
	

}
