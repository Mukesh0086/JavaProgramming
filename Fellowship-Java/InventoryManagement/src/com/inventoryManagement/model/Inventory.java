package com.inventoryManagement.model;

public class Inventory {
	
	private String name;
	private double price;
	private double weight;
	
	
	public Inventory(String name, double price, double weight) {
		super();
		this.name = name;
		this.price = price;
		this.weight = weight;
	}
	
	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}


	


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	

}
