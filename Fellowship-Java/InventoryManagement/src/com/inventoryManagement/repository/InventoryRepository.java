package com.inventoryManagement.repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.inventoryManagement.Utility.Utility;
import com.inventoryManagement.model.Inventory;

public class InventoryRepository {
	
	public  JSONArray readJsonFile(String filePath) {

		// JSON parser object to parse read file

		JSONParser jsonParser = new JSONParser();
		JSONArray inventory = null;
		try {
			FileReader reader = new FileReader("/home/admin1/Desktop/check.json");
			// Read JSON file

			inventory = (JSONArray) jsonParser.parse(reader);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return inventory;
	}
	
	
	public  double inventoryValue(int countItems) {
		double singleValue=0;
		double totalInventoryValue=0;
		JSONArray array = new JSONArray();

		for (int i = 0; i < countItems; i++)
		{
			JSONObject jsonObject = new JSONObject();
			Inventory inventory = new Inventory();
			Utility.readString();
			System.out.println("enter the name of the item");
			String name = Utility.readString();
			inventory.setName(name);
			System.out.println("Enter the price of the item");
			double price = Utility.readDouble();
			inventory.setPrice(price);

			System.out.println("Enter the weight");
			double weight = Utility.readDouble();
			inventory.setWeight(weight);

			jsonObject.put("name", inventory.getName());
			jsonObject.put("price", inventory.getPrice());
			jsonObject.put("weight", inventory.getWeight());
			array.add(jsonObject);

			try {

				FileWriter fw = new FileWriter("/home/admin1/Desktop/check.json");
				fw.write(array.toString());
				fw.flush();

			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		for (int i = 0; i < array.size(); i++) 
		{
			JSONObject obj=(JSONObject) array.get(i);
			double price=(double) obj.get("price");
			double weight=(double) obj.get("weight");
			totalInventoryValue=totalInventoryValue+price*weight;
			
		}
		return totalInventoryValue;
		
	}
	
	public void writeToJsonFile(JSONArray array,String filePath)
	{
		FileWriter fileWriter;
		
		try {
			fileWriter = new FileWriter(filePath);
			fileWriter.write(array.toString());
			fileWriter.close();
			//fileWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
