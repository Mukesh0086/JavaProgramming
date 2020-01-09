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
		boolean result=isAnagram(s1, s2);
		if(result==true)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not an Anagram");
		}
		
	}
	
	/* The below isAnagram method takes two strings convert them to a char array
	 * and then the sort elements by using arrays.sort method and then campare 
	 * both the elements 	
	 */
	
	public static boolean isAnagram(String s1,String s2)
	{
		boolean flag=false;
		
		char[] word1=s1.toCharArray();
		char[] word2=s2.toCharArray();
		Arrays.sort(word1);
		Arrays.sort(word2);
		
		if(Arrays.equals(word1, word2))
		{
			flag=true;
		}
		
		
		return flag;
	}

}

//End of the program
