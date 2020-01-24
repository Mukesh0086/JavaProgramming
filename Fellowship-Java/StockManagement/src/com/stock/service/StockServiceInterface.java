package com.stock.service;

import org.json.simple.JSONArray;

public interface StockServiceInterface {
	
	public JSONArray buyShare(String name,int noOfShares,JSONArray array);
	
	public JSONArray sellShare(String name,int noOfShares,JSONArray array);
	
	public void display(JSONArray array);
	
	public double particularStockValue(JSONArray array,String name);
	
	public double totalStockValue(JSONArray array);
	
	public void printReport(JSONArray array);

}
