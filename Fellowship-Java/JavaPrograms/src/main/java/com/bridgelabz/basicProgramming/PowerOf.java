package com.bridgelabz.basicProgramming;

import com.bridgelabz.utility.Utility;

public class PowerOf {
	
	//main method to call functions and input processing
	
	public static void main(String[] args) {
		
		System.out.println("Enter the exponent");
		int exp=Utility.readInteger();
		if (exp<32)
		{
			int result=Utility.power(exp);
			System.out.println(result);
		}
		else
		{
			System.out.println("The functions supports exponents upto 31 only");
		}
		
	}

}

//End of program
