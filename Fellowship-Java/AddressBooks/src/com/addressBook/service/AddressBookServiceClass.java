package com.addressBook.service;

import java.io.FileReader;
import java.util.Collections;
import java.util.Comparator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.addressBook.model.AddressBook;
import com.addressBook.utility.Utility;

public class AddressBookServiceClass implements AddressBookServiceInterface{

	@Override
	public JSONArray readJson(String filePath) {
		JSONParser parser = new JSONParser();
		JSONArray array = null;
		try {
			FileReader fileReader = new FileReader(filePath);
			array = (JSONArray) parser.parse(fileReader);
			fileReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return array;
		
	}

	@Override
	public JSONArray addAddress(JSONArray array, String filePath) {
		AddressBook book=new AddressBook();
		JSONObject jsonObject=new JSONObject();
		System.out.println("Enter the first name ");
		String firstName = Utility.readString();
		System.out.println("Enter the last name ");
		String lastName = Utility.readString();
		System.out.println("Enter the city");
		String city=Utility.readString();
		System.out.println("Enter state ");
		String state = Utility.readString();
		System.out.println("Enter address ");
		String address = Utility.readString();
		System.out.println("Enter the pincode");
		int zip = Utility.readInteger();
		System.out.println("Enter the phonenumber");
		long phoneNumber = Utility.readLong();
		book.setAddress(address);
		book.setCity(city);
		book.setFname(firstName);
		book.setLname(lastName);
		book.setPhone(phoneNumber);
		book.setState(state);
		book.setZip(zip);
		jsonObject.put("firstName", book.getFname());
		jsonObject.put("lastName", book.getLname());
		jsonObject.put("city", book.getCity());
		jsonObject.put("address", book.getAddress());
		jsonObject.put("state", book.getState());
		jsonObject.put("zip", book.getZip());
		jsonObject.put("phoneNumber", book.getPhone());
		array.add(jsonObject);
		return null;
	}

	@Override
	public JSONArray deleteAddress(JSONArray array, String filePath,String deleteAddress) {
		
		for (int i = 0; i < array.size(); i++) {
			JSONObject obj=(JSONObject) array.get(i);
			if(obj.get("firstName").equals(deleteAddress))
			{
				array.remove(obj);
			}
		}
		return array;
	}

	@Override
	public JSONArray editAddress(JSONArray array, String filePath,String editName,String replaceName) {
		
		for (int i = 0; i < array.size(); i++) {
			JSONObject obj=(JSONObject) array.get(i);
			if(obj.get("firstName").equals(editName))
			{
				obj.replace("firstName", replaceName);
			}
		}
		return array;
	}
	
	public JSONArray sortByLastName(JSONArray array)
	{
		Collections.sort(array,new Comparator<JSONObject>() {

			@Override
			public int compare(JSONObject o1, JSONObject o2) {
				return o1.get("lastName").toString().compareTo(o2.get("lastName").toString());
				
			}

		
		});
		
		return array;
		
	}

	public JSONArray sortByZipCode(JSONArray array)
	{
		Collections.sort(array,new Comparator<JSONObject>() {

			@Override
			public int compare(JSONObject o1, JSONObject o2) {
				return o1.get("zip").toString().compareTo(o2.get("zip").toString());
				
			}

		
		});
		
		return array;
		
	}

	
	
	

}
