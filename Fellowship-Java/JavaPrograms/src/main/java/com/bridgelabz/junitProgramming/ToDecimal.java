package com.bridgelabz.junitProgramming;

import com.bridgelabz.utility.Utility;

public class ToDecimal {
	
	//main method to call functions and input processing	
	
	public static void main(String[] args) {
		System.out.println("Enter the binary number");
		double binary=Utility.readDouble();
		double decimalValue=toDecimal(binary);
		System.out.println("The decimal equivalent for "+binary+" is "+(int) decimalValue);
		
	}
	
	/* The below  ToDecimal Method takes a binary number as argument  and 
	 * convert to decimal by taking each places and multiplying with 2 power of respective positions  	
	 */
	
	public static double toDecimal(double binary)
	{
		
		String findLength=String.valueOf((int) binary);
		
		double decimal=0;
		int i=0;
		while(binary>=1)
		{
			
			int modulus=(int) (binary%10);
			binary=(int) binary/10;
			decimal=decimal+modulus*Math.pow(2, i);
			i=i+1;
		}
		
		return decimal;
	}

}

//End of the program