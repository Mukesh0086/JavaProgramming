package com.bridgelabz.functionalProgramming;

import com.bridgelabz.utility.Utility;

public class WindChill {
	
	//main method to call functions and input processing
	
	public static void main(String[] args) {
		
		System.out.println("Enter temperature");
		int temperature=Utility.readInteger();
		System.out.println("Enter speed");
		int speed=Utility.readInteger();
		if(temperature<=50 && speed <=120 && speed>3)
		{
			double result=Utility.windChill(temperature, speed);
			System.out.println(result);
		}
		else
		{
			System.out.println("Please Enter Appropriate Values");
		}
		
	}
	
	

}
