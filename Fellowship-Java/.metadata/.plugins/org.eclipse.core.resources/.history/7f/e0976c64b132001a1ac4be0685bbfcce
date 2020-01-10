package com.bridgelabz.basicProgramming;

import java.text.DecimalFormat;

import com.bridgelabz.utility.Utility;

public class Harmonic {

	//main method to call functions and input processing
	
	public static void main(String[] args) { 
		
		System.out.println("Enter the number to calculate harmonic mean ");
		int number=Utility.readInteger();
		double result=harmonicMean(number);
		System.out.println("The sum of harmonic mean for "+number+" is "+result);
		
		
		
	}
	
	/* The below harmonicMean method will take number as input and generate
	 * the summation of harmonic mean and returns the summation upto numberth 
	 * terms.(Double value) 	
	 */
	
	public static double harmonicMean(int number) {
		
		double sum = 0.0;

		for (int i = 1; i <=number; i++) { 
			sum = sum +1.0 / i; 
		} 
		return   sum; 
	}
	
}

	//End of program
