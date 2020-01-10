package com.bridgelabz.junitProgramming;

import com.bridgelabz.utility.Utility;

public class TemperatureConversion {
	
	//main method to call functions and input processing	
	
	public static void main(String[] args) {
		System.out.println("choose far for celsius to farenheit cel for farenheit to celsius");
		String type=Utility.readString();
		System.out.println("Enter temperature value");
		int temperature=Utility.readInteger();
		temperatureConversion(type, temperature);
	
	}
	
	/* The below  temperatureConversion Method takes two arguments type and temperature and 
	 * convert to either in celsius or fahrenheit based on type  	
	 */
	
	public static void temperatureConversion(String type,int temperarture)
	{
		if(type.equalsIgnoreCase("far"))
		{
			double fahrenheit=(temperarture*(9/5)+32);
			System.out.println("Fahrenheit="+fahrenheit);
		}
		else if(type.equalsIgnoreCase("cel"))
		{
			double celsius=((temperarture-32)*(5/9));
			System.out.println("Celsius="+celsius);
		}
		else
		{
			System.out.println("Invalid input please choose cel or far");
		}
	}

}

	//End of the program
