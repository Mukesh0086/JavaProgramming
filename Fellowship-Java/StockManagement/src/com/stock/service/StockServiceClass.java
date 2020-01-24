package com.stock.service;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class StockServiceClass implements StockServiceInterface {

	

	@Override
	public void display(JSONArray array) {
		JSONObject jsonObject = new JSONObject();
		double totalValue = 0,particularValue=0;

		for (int i = 0; i < array.size(); i++) {
			jsonObject=(JSONObject) array.get(i);
			System.out.println(jsonObject.toString());
		}
			
	}

	@Override
	public double totalStockValue(JSONArray array) {
		double price=0;
		long numberOfShare=0;
		JSONObject jsonObject = new JSONObject();
		double totalValue = 0,particularValue=0;

		for (int i = 0; i < array.size(); i++) {
			jsonObject = (JSONObject) array.get(i);
		{
				price = (long) jsonObject.get("sharePrice");
				numberOfShare = (long) jsonObject.get("numberOfShare");
				particularValue=price * numberOfShare;
				totalValue=totalValue+ particularValue;
			}

		}
		return particularValue;
	
	}

	@Override
	public double particularStockValue(JSONArray array, String name) {

		JSONObject jsonObject = new JSONObject();
		long particularValue = 0,price=0;
		long numberOfShare=0;

		for (int i = 0; i < array.size(); i++) {
			jsonObject = (JSONObject) array.get(i);
			if (jsonObject.get("name").equals(name)) {
				price = (long) jsonObject.get("sharePrice");
				numberOfShare = (long) jsonObject.get("numberOfShare");
				particularValue = price * numberOfShare;
			}

		}
		return particularValue;
	}

	@Override
	public JSONArray buyShare(String name, int noOfShares, JSONArray array) {
		JSONObject jsonObject = new JSONObject();
		double totalValue = 0,particularValue=0;
		long shares=0;
		for (int i = 0; i < array.size(); i++) {
			jsonObject = (JSONObject) array.get(i);
			if(jsonObject.get("name").equals(name))
			{
				shares=(long) jsonObject.get("numberOfShare");
				shares=shares+noOfShares;
				jsonObject.replace("numberOfShare", shares);
				
			}
		

		}
		
	
		return array;
	}

	@Override
	public JSONArray sellShare(String name, int noOfShares, JSONArray array) {
		
		JSONObject jsonObject = new JSONObject();
		double totalValue = 0,particularValue=0;
		long shares=0;
		for (int i = 0; i < array.size(); i++) {
			jsonObject = (JSONObject) array.get(i);
			if(jsonObject.get("name").equals(name))
			{
				shares=(long) jsonObject.get("numberOfShare");
				shares=shares-noOfShares;
				jsonObject.replace("numberOfShare", shares);
				
			}
		

		}
		
	
		return array;
	}

	@Override
	public void printReport(JSONArray array) {
		JSONObject obj=new JSONObject();
		long shareNumber=0;
		long sharePrice=0;
		long totalvalue=0,particularValue=0;
		for (int i = 0; i < array.size(); i++) {
			
			obj=(JSONObject) array.get(i);
			shareNumber= (long) obj.get("numberOfShare");
			sharePrice= (long) obj.get("sharePrice");
			System.out.println(obj.get("name"));
			System.out.println(obj.get("numberOfShare"));
			System.out.println(obj.get("sharePrice"));
			particularValue=sharePrice*shareNumber;
			totalvalue=totalvalue+particularValue;
			System.out.println("The value of share "+obj.get("name")+"is "+shareNumber*sharePrice);
			
			
		}
		System.out.println("The total value of stocks present is"+totalvalue);
		
	}
}
