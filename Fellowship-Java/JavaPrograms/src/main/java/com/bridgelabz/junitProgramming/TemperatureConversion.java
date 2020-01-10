package com.bridgelabz.junitProgramming;

import com.bridgelabz.utility.Utility;

public class TemperatureConversion {
	
	//main method to call functions and input processing	
	
	public static void main(String[] args) {
		System.out.println("choose far for celsius to farenheit cel for farenheit to celsius");
		String type=Utility.readString();
		System.out.println("Enter temperature value");
		int temperature=Utility.readInteger();
		double result=temperatureConversion(type, temperature);
		System.out.println(result);
		
	
	}
	
	/* The below  temperatureConversion Method takes two arguments type and temperature and 
	 * convert to either in celsius or fahrenheit based on type  	
	 */
	
	public static double temperatureConversion(String type,int temperature)
	{
		double calculatedValue=0.0;
		
		if(type.equalsIgnoreCase("far"))
		{	
			calculatedValue=(((temperature)*(9))/5+32);
			
		}
		else if(type.equalsIgnoreCase("cel"))
		{
			calculatedValue=(((temperature-32)*(5))/(9));
			
		}
		else
		{
			System.out.println("Invalid input please choose cel or far");
		}
		
		return calculatedValue;
	}

}

	//End of the program
