package com.inventoryManagement.Service;

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

public class InventoryServiceClass implements InventoryServiceInterface {

	@Override
	public JSONArray readJsonFile(String filePath) {

		// JSON parser object to parse read file

		JSONParser jsonParser = new JSONParser();
		JSONArray inventory = null;
		try {
			FileReader reader = new FileReader(filePath);
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

	@Override
	public double inventoryValue(int countItems) {

		double singleValue = 0;
		double totalInventoryValue = 0;
		JSONArray array = new JSONArray();

		for (int i = 0; i < countItems; i++) {
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

				FileWriter fw = new FileWriter(
						"/home/admin1/fellowship/Fellowship-Java/InventoryManagement/src/com/inventoryManagement/controller/inventory1.json");
				fw.write(array.toString());
				fw.flush();

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		for (int i = 0; i < array.size(); i++) {
			JSONObject obj = (JSONObject) array.get(i);
			double price = (double) obj.get("price");
			double weight = (double) obj.get("weight");
			totalInventoryValue = totalInventoryValue + price * weight;

		}
		return totalInventoryValue;

	}
	
	

	@Override
	public void display(JSONArray array) {
		System.out.println(array);
		
	}

	@Override
	public JSONArray addItems(JSONArray array) {
		
		Inventory inventory=new Inventory();
		System.out.println("Enter the name of the item");
		String name=Utility.readString();
	
		inventory.setName(name);
		System.out.println("Enter the price of the item");
		double price=Utility.readDouble();
		inventory.setPrice(price);
		System.out.println("Enter the weight of the item");
		double weight=Utility.readDouble();
		inventory.setWeight(weight);
		
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("name", inventory.getName());
		jsonObject.put("price", inventory.getPrice());
		jsonObject.put("weight", inventory.getWeight());
		array.add(jsonObject);
		
		return array;
	}

	@Override
	public JSONArray removeItems(JSONArray array,String name)
	{
		JSONObject obj;
		for (int i = 0; i < array.size(); i++) {
			 obj=(JSONObject) array.get(i);
			 String nameFile=(String) obj.get("name");
			 if(nameFile.equals(name))
			 {
				 array.remove(obj);
			 }
			
		}
		
		return array;
	}

	
	

	@Override
	public JSONArray editPrice(JSONArray array, String name, double replacePrice) {
		JSONObject obj=null;
		for (int i = 0; i < array.size(); i++) 
		{
			obj=(JSONObject) array.get(i);
			String existingName=(String) obj.get("name");
			if(existingName.equalsIgnoreCase(name))
			{
				obj.replace("price",replacePrice);
			}
		}
		return array;
	}

	@Override
	public double totalValueOfInventory(JSONArray array) {
		JSONObject obj=null;
		double totalValue=0;
		for (int i = 0; i < array.size(); i++) {
			obj=(JSONObject) array.get(i);
			double price=(double) obj.get("price");
			double weight=(double) obj.get("weight");
			totalValue=totalValue+price*weight;
			
			
		}
		return totalValue;
	}

	@Override
	public double totalWeightOfInventory(JSONArray array) {
		JSONObject obj=null;
		double totalWeight=0;
		for (int i = 0; i < array.size(); i++) {
			obj=(JSONObject) array.get(i);
			
			double weight=(double) obj.get("weight");
			totalWeight=totalWeight+weight;
		}
			
		return totalWeight;
	}

	@Override
	public double totalPriceOfInventory(JSONArray array) {
		
		JSONObject obj=null;
		double totalWeight=0;
		for (int i = 0; i < array.size(); i++) {
			obj=(JSONObject) array.get(i);
			
			double price=(double) obj.get("price");
			totalWeight=totalWeight+price;
		}
			
		return totalWeight;
	}


	

	


}
