package com.bridgelabz.junitProgramming;

import com.bridgelabz.utility.Utility;

public class TemperatureConversion {
	
	//main method to call functions and input processing	
	
	public static void main(String[] args) {
		System.out.println("choose far for celsius to farenheit cel for farenheit to celsius");
		String type=Utility.readString();
		System.out.println("Enter temperature value");
		int temperature=Utility.readInteger();
		double result=Utility.temperatureConversion(type, temperature);
		System.out.println(result);
	
	}
}

	//End of the program
