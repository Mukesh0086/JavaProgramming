package com.bridgelabz.junitProgramming;

import com.bridgelabz.utility.Utility;

public class ToDecimal {
	
	//main method to call functions and input processing	
	
	public static void main(String[] args) {
		System.out.println("Enter the binary number");
		double binary=Utility.readDouble();
		double decimalValue=Utility.toDecimal(binary);
		System.out.println(decimalValue);
		System.out.println("The decimal equivalent for "+(int) binary+" is "+(int) decimalValue);
		
	}
	
	

}

//End of the program
