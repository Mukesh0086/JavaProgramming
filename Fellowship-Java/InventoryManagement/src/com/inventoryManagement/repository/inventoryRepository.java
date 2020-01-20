package com.inventoryManagement.repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class inventoryRepository {
	
	public static JSONArray readJsonFile(String filePath) {

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

}
