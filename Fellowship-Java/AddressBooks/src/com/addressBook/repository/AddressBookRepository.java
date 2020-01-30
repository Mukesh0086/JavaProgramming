package com.addressBook.repository;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.addressBook.model.AddressBook;
import com.addressBook.utility.Utility;




public class AddressBookRepository {
	
	public void addAddressFirst(String filePath)
	{
		AddressBook book = new AddressBook();

		System.out.println("Enter the number of address to be added");
		int number = Utility.readInteger();

		JSONArray array = new JSONArray();
		for (int i = 0; i < number; i++) {
			JSONObject jsonObject = new JSONObject();
			Utility.readString();
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
		}

		try {

			FileWriter fw = new FileWriter(filePath);
			fw.write(array.toString());
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void writeToAddress(JSONArray array,String path)
	{
		
		try {
			FileWriter fileWriter=new FileWriter(path);
			fileWriter.write(array.toString());
			fileWriter.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	

}
