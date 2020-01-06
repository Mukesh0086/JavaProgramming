package com.bridgelabz.basicProgramming;

import java.util.ArrayList;

public class PrimeFactors {
	
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
