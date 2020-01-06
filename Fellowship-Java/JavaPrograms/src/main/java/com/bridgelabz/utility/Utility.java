package com.bridgelabz.utility;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Utility {
	
	private static final Scanner SCAN=new Scanner(System.in);
	
	/*creating a Scanner object to use it across the project
	 * Scanner object is made final value cannot be changed
	 */
	
	private static final Logger LOG=Logger.getLogger(Utility.class.getName());
	
	/*creating a Logger object for the utility class
	 * to log informations and warnings
	 */
	
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
