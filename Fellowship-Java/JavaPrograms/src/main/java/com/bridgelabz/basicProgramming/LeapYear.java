package com.bridgelabz.basicProgramming;

import com.bridgelabz.utility.Utility;

public class LeapYear {
	
	//main method to call functions and input processing	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the year");
		int year=Utility.readInteger();
		boolean isLeapYear=isLeapYear(year);
		
		String result= (isLeapYear==true?" Its a leap year":"Its not a leap year");
		
		//ternary operator for boolean condition.
	}
	
	/* The below isLeapYear method will take year as input and process the 
	 * conditions. If condition is passed flag is set to true else false  	
	 */
	
	public static boolean isLeapYear(int year)
	{
		boolean flag=false;
		if((year%4==0) && (year%100!=0) || (year%400==0) && (year%100!=0))
		{
			flag=true;
		}
		return flag;
		
	}
	
	

}
	//End of program