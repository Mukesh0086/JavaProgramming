package com.addressBook.controller;

import org.json.simple.JSONArray;

import com.addressBook.repository.AddressBookRepository;
import com.addressBook.service.AddressBookServiceClass;
import com.addressBook.service.AddressBookServiceInterface;
import com.addressBook.utility.Utility;

public class AddressBookController {
	
	public static void main(String[] args) {
		AddressBookServiceInterface serviceInterface=new AddressBookServiceClass();
		JSONArray readArray=null,addArray=null,sortedNameArray=null;
		String filePath="/home/admin1/fellowship/Fellowship-Java/AddressBooks/src/com/addressBook/controller/addressbook.json";
		AddressBookRepository repository=new AddressBookRepository();
		//repository.addAddressFirst(filePath);
		
		System.out.println("Enter 1...");
		int choice=Utility.readInteger();
		switch(choice)
		{
		case 1:readArray=serviceInterface.readJson(filePath);
				addArray=serviceInterface.addAddress(readArray, filePath);
			break;
		case 2:readArray=serviceInterface.readJson(filePath);
		sortedNameArray=serviceInterface.sortByZipCode(readArray);
		System.out.println(sortedNameArray);
			break;
		case 3:break;
		case 4:break;
		}
	}

}
