package com.bridgelabz.basicProgramming;

import com.bridgelabz.utility.Utility;

public class LeapYear {
	
	//main method to call functions and input processing	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the year");
		int year=Utility.readInteger();
		boolean isLeapYear=Utility.isLeapYear(year);
		
		
		String result= (isLeapYear==true?" Its a leap year":"Its not a leap year");
		System.out.println(result);
		
		//ternary operator for boolean condition.
	}
	
	
	

}
	//End of program