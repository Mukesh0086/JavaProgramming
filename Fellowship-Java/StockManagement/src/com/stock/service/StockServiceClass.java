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
		JSONObject jsonObject = new JSONObject();
		double totalValue = 0,particularValue=0;

		for (int i = 0; i < array.size(); i++) {
			jsonObject = (JSONObject) array.get(i);
		{
				double price = (double) jsonObject.get("sharePrice");
				double numberOfShare = (double) jsonObject.get("numberOfShare");
				particularValue=price * numberOfShare;
				totalValue=totalValue+ particularValue;
			}

		}
		return particularValue;
	
	}

	@Override
	public double particularStockValue(JSONArray array, String name) {

		JSONObject jsonObject = new JSONObject();
		double particularValue = 0;

		for (int i = 0; i < array.size(); i++) {
			jsonObject = (JSONObject) array.get(i);
			if (jsonObject.get("name").equals(name)) {
				double price = (double) jsonObject.get("sharePrice");
				double numberOfShare = (double) jsonObject.get("numberOfShare");
				particularValue = price * numberOfShare;
			}

		}
		return particularValue;
	}

	@Override
	public JSONArray buyShare(String name, int noOfShares, JSONArray array) {
		JSONObject jsonObject = new JSONObject();
		double totalValue = 0,particularValue=0;

		for (int i = 0; i < array.size(); i++) {
			jsonObject = (JSONObject) array.get(i);
			if(jsonObject.get("name").equals(name))
			{
				int shares=(int) jsonObject.get("numberOfShare");
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

		for (int i = 0; i < array.size(); i++) {
			jsonObject = (JSONObject) array.get(i);
			if(jsonObject.get("name").equals(name))
			{
				int shares=(int) jsonObject.get("numberOfShare");
				shares=shares-noOfShares;
				jsonObject.replace("numberOfShare", shares);
				
			}
		

		}
		
	
		return array;
	}
}
