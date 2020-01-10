package com.bridgelabz.basicProgramming;

import com.bridgelabz.utility.Utility;

public class Harmonic {

	//main method to call functions and input processing
	
	public static void main(String[] args) { 
		
		System.out.println("Enter the number to calculate harmonic mean ");
		int number=Utility.readInteger();
		double result=Utility.harmonicMean(number);
		System.out.println("The sum of harmonic mean for "+number+" is "+result);
		
			
}
}

	//End of program
