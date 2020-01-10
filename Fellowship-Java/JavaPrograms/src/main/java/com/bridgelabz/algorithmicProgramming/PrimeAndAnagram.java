package com.bridgelabz.algorithmicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class PrimeAndAnagram {
	
	//main method to call functions and input processing
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> primeList=new ArrayList<Integer>();
		ArrayList<Integer> primePalindromeList=new ArrayList<Integer>();
		primeList=Utility.printIfPrime();
		
		primePalindromeList=Utility.primePalindrome(primeList);
		Utility.anagramNumbers(primePalindromeList);
	}
	
		

}

//End of the Program
