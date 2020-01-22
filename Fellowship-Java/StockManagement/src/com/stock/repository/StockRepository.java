package com.stock.repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.stock.model.Stock;
import com.stock.utility.Utility;

public class StockRepository {
	static Stock stock=new Stock();
	public static void writeToFile()
	{
		JSONObject jsonObject=new JSONObject();
		JSONArray array=new JSONArray();
		
		for (int i = 0; i < 3; i++) {
			
			System.out.println("Enter name");
			String name=Utility.readString();
			stock.setName(name);
			System.out.println("Enter share price");
			double price=Utility.readDouble();
			stock.setPrice(price);
			System.out.println("Enter number of Stocks");
			
			int numberOfStocks=Utility.readInteger();
			Utility.readString();
			jsonObject.put("name", stock.getName());
			jsonObject.put("numberOfShare", stock.getNumberOfShares());
			jsonObject.put("sharePrice",stock.getPrice());
			array.add(jsonObject);
			
			FileWriter fileWriter;
			try {
				fileWriter = new FileWriter("/home/admin1/fellowship/Fellowship-Java/StockManagement/stock.json");
				fileWriter.write(array.toString());
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}

	}
	
	
	public JSONArray readFile(String filePath)
	{
		JSONParser jsonParser=new JSONParser();
		JSONArray array=new JSONArray();
		JSONObject jsonObject=new JSONObject();
		try {
			FileReader fileReader=new FileReader(filePath);
			array=(JSONArray) jsonParser.parse(fileReader);
			fileReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return array;
		
	}
}
