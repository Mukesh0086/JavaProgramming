package com.bridgelabz.basicProgramming;

import java.util.ArrayList;

import com.bridgelabz.utility.Utility;

public class PrimeFactors {

	//main method to call functions and input processing

	
	public static void main(String[] args) { 
		
		System.out.println("Enter the number to find prime factor");
		int number=Utility.readInteger();
		ArrayList<Integer> primeList=new ArrayList<Integer>();
		primeList=primeFactors(number);
		for(Integer pm:primeList)
		{
			System.out.println(pm);
		}
	}
	
	/* The below primefactors method takes a number and calculate the number of
	 * the number and each prime factor is stored in a ArrayList which is returned
	 */
	
	
	public static ArrayList<Integer> primeFactors(int number)
	{
		int i=0;
		ArrayList<Integer> factorList=new ArrayList<Integer>();
		while(number>1)
		{
			for(i=2;i<=number;i++)
			{
				if(number%i==0)
				{
					number=number/i;
					factorList.add(i);
					break;
				}
			}
		}
		return factorList;
		
	}

}
//End of Program
