package com.stock.controller;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.stock.model.Stock;
import com.stock.repository.StockRepository;
import com.stock.service.StockServiceInterface;
import com.stock.utility.Utility;

public class StockController {
	static Stock stock=new Stock();
	
	public static void main(String[] args) {
		StockRepository repository=new StockRepository();
		
		JSONArray readArray;
		
		String filePath="/home/admin1/fellowship/Fellowship-Java/StockManagement/stock.json";
		int choice=0;
		
		do {
			System.out.println("Enter 1 to particular stock value\nEnter 2 for total stocks value\nEnter 3 for buying share\nEnter 4 for selling share \nEnter 5 for printing report \nEnter 6 to EXIT");
			choice=Utility.readInteger();
			switch(choice)
			{
			
			case 1:	readArray=repository.readFile(filePath);
					
			
				
					break;
			case 2:readArray=repository.readFile(filePath);
				
				
					break;
			case 3:readArray=repository.readFile(filePath);
				
				
					break;
			case 4:readArray=repository.readFile(filePath);
				
				
					break;
			case 5:readArray=repository.readFile(filePath);
				
				
					break;
			case 6:readArray=repository.readFile(filePath);
				
				
					break;
			}
		}while(choice!=6);
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
