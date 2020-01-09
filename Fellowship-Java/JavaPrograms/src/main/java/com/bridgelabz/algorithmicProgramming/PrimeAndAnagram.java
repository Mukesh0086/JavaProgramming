package com.bridgelabz.algorithmicProgramming;

import java.util.ArrayList;

public class PrimeAndAnagram {
	
	//main method to call functions and input processing
	
	public static void main(String[] args) {
		ArrayList<Integer> primeList=new ArrayList<Integer>();
		primeList=printIfPrimeAndAnagram();
		for(Integer pn:primeList)
		{
			System.out.println(pn);
		}
	}
	
	/*The below printifPrime method prints the prime numbers from the range between 
	 * 1 and 1000 by iteration
	 */
	
	public static ArrayList<Integer> printIfPrimeAndAnagram(){
	
		int number=2;
		ArrayList<Integer> primenumbers=new ArrayList<Integer>();
		while(number<1000) {
			int count=0;
			for(int i=2;i<number;i++)
			{
				if(number%i==0)
				{
					count=count+1;
				}
			}
			if(count==0)
			{
				primenumbers.add(number);
				
			}
			number=number+1;
			
		}
		return primenumbers;
		
	}
	
	public boolean isAnagram(int number)
	{
		
	}

}

//End of the Program
