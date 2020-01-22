package com.inventoryManagement.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.inventoryManagement.Service.InventoryServiceClass;
import com.inventoryManagement.Service.InventoryServiceInterface;
import com.inventoryManagement.Utility.Utility;
import com.inventoryManagement.model.Inventory;
import com.inventoryManagement.repository.InventoryRepository;

public class Controller {
	
	
	public static void main(String[] args) {
		int choice=0;
		InventoryServiceInterface service=new InventoryServiceClass();
		InventoryRepository inventoryRepository=new InventoryRepository();
		
		String filePath="/home/admin1/fellowship/Fellowship-Java/InventoryManagement/inventory.json";
		JSONArray fullFile=null,addArray=null,editArray=null,resultArray=null,deleteArray=null;
		
		System.out.println("Welcome to Inventory Management");
		
		do {	
		System.out.println("Enter 1 for adding item \nEnter 2 deleting item \nEnter 3 for editing item \nEnter 4 for viewing all items \nEnter 5 for the total value for inventory \nEnter 6 for getting total weight of inventory \nEnter 7 for getting total cost of inventory \nEnter 8 for exit");
		choice=Utility.readInteger();
		Utility.readString();
		switch(choice)
		{
		case 1: fullFile=service.readJsonFile(filePath);	
				addArray=service.addItems(fullFile);
				inventoryRepository.writeToJsonFile(addArray, filePath);
				System.out.println(addArray);
				
				break;
		case 2:	fullFile=service.readJsonFile(filePath);
				System.out.println("Enter the name of the item to delete");
				String nameDelete=Utility.readString();
				 deleteArray=service.removeItems(fullFile, nameDelete);
				inventoryRepository.writeToJsonFile(deleteArray, filePath);
				System.out.println(deleteArray);
				break;
		case 3:	fullFile=service.readJsonFile(filePath);
				System.out.println("Enter the name of the item to edit price");
				String nameEdit=Utility.readString();
				System.out.println("Enter the price to be edited");
				double replacePrice=Utility.readDouble();
				editArray=service.editPrice(fullFile, nameEdit, replacePrice);
				System.out.println(editArray);
				inventoryRepository.writeToJsonFile(editArray, filePath);
			
				break;
				
		case 4: fullFile=service.readJsonFile(filePath);
				service.display(fullFile);
				
				break;
			
			
		case 5:	fullFile=service.readJsonFile(filePath);
				double totalValue=service.totalValueOfInventory(fullFile);
				System.out.println("The total value of inventory is"+totalValue);
				break;
		case 6:	fullFile=service.readJsonFile(filePath);
				double totalWeight=service.totalWeightOfInventory(fullFile);
				System.out.println("The total weight of inventory is"+totalWeight);
			
				break;
		case 7:	fullFile=service.readJsonFile(filePath);
				double totalPrice=service.totalPriceOfInventory(fullFile);
				System.out.println("total price of inventory is"+totalPrice);
		
				break;
		case 8:	
		
				break;
		}
		}
		while(choice!=8);
		
		System.out.println("Thank YOU");
		
		
	}
	
}		
	
	
	
	
	
	


