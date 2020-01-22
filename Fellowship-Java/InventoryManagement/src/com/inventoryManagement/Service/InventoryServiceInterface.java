package com.inventoryManagement.Service;

import org.json.simple.JSONArray;

import com.inventoryManagement.model.Inventory;
import com.inventoryManagement.repository.InventoryRepository;

public interface InventoryServiceInterface {
	Inventory inventory=new Inventory();
	
	
	
	public  JSONArray readJsonFile(String filePath);
	
	public  double inventoryValue(int countItems);
	
	public void display(JSONArray array);
	
	public JSONArray addItems(JSONArray array);
	
	public JSONArray removeItems(JSONArray array,String name);

	public JSONArray editPrice(JSONArray array, String name, double replacePrice);
	
	public double totalValueOfInventory(JSONArray array);
	
	public double totalWeightOfInventory(JSONArray array);
	
	public double totalPriceOfInventory(JSONArray array);
	
	
		
	

}
