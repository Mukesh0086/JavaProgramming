package com.bridgelabz.basicProgramming;

import java.util.ArrayList;

import com.bridgelabz.utility.Utility;

public class PrimeFactors {

	//main method to call functions and input processing

	
	public static void main(String[] args) { 
		
		System.out.println("Enter the number to find prime factor");
		int number=Utility.readInteger();
		ArrayList<Integer> primeList=new ArrayList<Integer>();
		primeList=Utility.primeFactors(number);
		for(Integer pm:primeList)
		{
			System.out.println(pm);
		}
	}

}
	//End of Program
