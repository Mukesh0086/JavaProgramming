package com.bridgelabz.algorithmicProgramming;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class Anagram {
	
	//main method to call functions and input processing	
	
	public static void main(String[] args) {
		System.out.println("Enter first string");
		String s1=Utility.readString();
		System.out.println("Enter second string");
		String s2=Utility.readString();
		boolean result=Utility.isAnagram(s1, s2);
		if(result==true)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not an Anagram");
		}
		
	}
	
	
}

//End of the program
