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
			double result=windChill(temperature, speed);
			System.out.println(result);
		}
		else
		{
			System.out.println("Please Enter Appropriate Values");
		}
		
	}
	
	/* The below windChill method will take 2 integer temperature and speed
	 *  as input and calculate wind stores in a double and returns the wind 	
	 */
	
	public static double windChill(int t,int v)
	{
		double wind=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
		return wind;
	}

}
