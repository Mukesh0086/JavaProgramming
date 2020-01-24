package com.stock.model;

public class Stock {
	
	int numberOfShares;
	String name;
	int price;
	
	
	
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stock(int numberOfShares, String name, int price) {
		super();
		this.numberOfShares = numberOfShares;
		this.name = name;
		this.price = price;
	}
	public long getNumberOfShares() {
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
	public void setPrice(int price) {
		this.price = price;
	}

}
