package com.addressBook.service;

import org.json.simple.JSONArray;

public interface AddressBookServiceInterface {
	
	public JSONArray readJson(String filePath);
	
	public JSONArray addAddress(JSONArray array,String filePath);
	
	public JSONArray deleteAddress(JSONArray array,String filePath,String deleteAddress);
	
	public JSONArray editAddress(JSONArray array,String filePath,String editName,String replaceName);

	public JSONArray sortByLastName(JSONArray array);
	
	public JSONArray sortByZipCode(JSONArray array);
}
