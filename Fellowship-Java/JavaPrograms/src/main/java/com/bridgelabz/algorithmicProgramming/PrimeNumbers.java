package com.bridgelabz.algorithmicProgramming;

import java.util.ArrayList;

import com.bridgelabz.utility.Utility;

public class PrimeNumbers {
	
	//main method to call functions and input processing
	
	public static void main(String[] args) {
		ArrayList<Integer> primeList=new ArrayList<Integer>();
		primeList=Utility.printIfPrimeNumber();
		for(Integer pn:primeList)
		{
			System.out.println(pn);
		}
	}
}

//End of the Program
