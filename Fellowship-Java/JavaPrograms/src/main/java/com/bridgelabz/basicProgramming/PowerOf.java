package com.bridgelabz.basicProgramming;

import com.bridgelabz.utility.Utility;

public class PowerOf {
	
	//main method to call functions and input processing
	
	public static void main(String[] args) {
		
		System.out.println("Enter the exponent");
		int exp=Utility.readInteger();
		if (exp<32)
		{
			int result=power(exp);
			System.out.println(result);
		}
		else
		{
			System.out.println("The functions supports exponents upto 31 only");
		}
		
	}
	
	/* The below power method will take exponent input and generate
	 * the value of 2 to the power of exponent. The functions works upto 2 to the power
	 * of 31, since thats the limit of Integer datatype. 	
	 */
	
	public static int power(int exp) {
	
		int base=2,result=1;
		for(int i=1;i<=exp;i++)
		{
			result=result*2;
		}
		return result;
	}

}
