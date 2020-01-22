package com.stock.model;

public class Stock {
	
	private int numberOfShares;
	private String name;
	private double price;
	
	
	
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stock(int numberOfShares, String name, double price) {
		super();
		this.numberOfShares = numberOfShares;
		this.name = name;
		this.price = price;
	}
	public int getNumberOfShares() {
		return numberOfShares;
	}
	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
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

}
