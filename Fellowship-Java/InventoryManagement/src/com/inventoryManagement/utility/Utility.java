package com.inventoryManagement.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Utility {
	
	private static final Scanner SCAN=new Scanner(System.in);
	
	public static int readInteger()
	{
		//Utility.LOG.info("readInteger() method called");
		return SCAN.nextInt(); 		//Scanner object to input Integer 
	}
	public static double readDouble()
	{
		return SCAN.nextDouble();		//Scanner object to input Double 
	}
	public static long readLong()
	{
		return SCAN.nextLong();		//Scanner object to input Long 
	}
	public static String readString()
	{
		return SCAN.nextLine();		//Scanner object to input String 
	}
	public static float readFloat()
	{
		return SCAN.nextFloat();		//Scanner object to input Float
	}
	
	

}
