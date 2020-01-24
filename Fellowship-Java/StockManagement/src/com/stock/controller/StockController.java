package com.stock.controller;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.stock.model.Stock;
import com.stock.repository.StockRepository;
import com.stock.service.StockServiceClass;
import com.stock.service.StockServiceInterface;
import com.stock.utility.Utility;

public class StockController {
	static Stock stock=new Stock();
	static StockServiceInterface serviceInterface=new StockServiceClass();
	static StockRepository repository=new StockRepository();
	public static void main(String[] args) {
		
		
		JSONArray readArray,buyArray,sellArray;
		
		String filePath="/home/admin1/fellowship/Fellowship-Java/StockManagement/stock.json";
		int choice=0;
		
		do {
			System.out.println("Enter 1 to particular stock value\nEnter 2 for total stocks value\nEnter 3 for buying share\nEnter 4 for selling share \nEnter 5 for printing report \nEnter 6 to EXIT");
			choice=Utility.readInteger();
			Utility.readString();
			
			int numberOfShares=0;
			switch(choice)
			{
			
			case 1:	readArray=repository.readFile(filePath);
					System.out.println("Enter the stock name to get its value");
					String stockName=Utility.readString();
					double particularValue=serviceInterface.particularStockValue(readArray, stockName);
					System.out.println(particularValue);
					break;
			case 2:	readArray=repository.readFile(filePath);
					double totalValue=serviceInterface.totalStockValue(readArray);
					System.out.println(totalValue);
					break;
			case 3:	readArray=repository.readFile(filePath);
					System.out.println("Enter stock name to buy");
					stockName=Utility.readString();
					System.out.println("Enter the number of share needed");
					numberOfShares=Utility.readInteger();
					buyArray=serviceInterface.buyShare(stockName, numberOfShares, readArray);
					repository.writeToJsonFile(buyArray, filePath);
					serviceInterface.display(buyArray);
					
				
				
					break;
			case 4:	readArray=repository.readFile(filePath);
					System.out.println("Enter stock name to sell");
					stockName=Utility.readString();
					System.out.println("Enter the number of share to be sold");
					numberOfShares=Utility.readInteger();
					sellArray=serviceInterface.sellShare(stockName, numberOfShares, readArray);
					repository.writeToJsonFile(sellArray, filePath);
					serviceInterface.display(sellArray);
				
				
					break;
			case 5:	readArray=repository.readFile(filePath);
					serviceInterface.printReport(readArray);
					
				
					break;
			case 6:readArray=repository.readFile(filePath);
				
				
					break;
			}
		}while(choice!=6);
	
	}
	
	
	
	

}
