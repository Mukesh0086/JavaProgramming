package com.bridgelabz.dataStructures;


import java.util.*;


import com.bridgelabz.utility.Utility;

public class PrimePalindrome2dArray {

	public static void main(String[] args) {
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		primeList = Utility.printIfPrime();
		primeAndAnagram(primeList);
		
	}

	public static void primeAndPalindrome(ArrayList<Integer> primeList)
	{
		int [][] primePalindromeArray=new int[2][2];
		LinkedHashMap<Integer, Integer>palindrome=new LinkedHashMap<Integer, Integer>();
		int number = 0, temp = 0, remainder = 0,count=0;
		int[] primeArray = new int[primeList.size()];
		for (int i = 0; i < primeList.size(); i++) {
			primeArray[i] = primeList.get(i);
		}

		for (int j = 0; j < primeArray.length; j++) {
			int reverse = 0;
			
			temp = primeArray[j];
			number=temp;
			
			
			while (number > 0) {
				remainder = number % 10;
				reverse = reverse * 10 + remainder;
				number = number / 10;
			}
			palindrome.put(temp, reverse);
			

		}
		
		for(Map.Entry<Integer, Integer> hm:palindrome.entrySet())
		{
			System.out.println(hm.getKey()+"    "+hm.getValue());
			if(hm.getKey()==hm.getValue())
			{
				count=count+1;    // calculating rows of 2d Array
				//System.out.println(hm.getKey());
			}
		}
		System.out.println(count);
		
		

	}

	
	public static void primeAndAnagram(ArrayList<Integer> primeList)
	{
		LinkedHashMap<Integer,Integer>map=new LinkedHashMap<Integer, Integer>();
		for(Integer pn:primeList)
		{
			int temp=sortDigits(pn);
			map.put(pn,temp );
		}
		
		
		
		
		for(Map.Entry<Integer, Integer> number:map.entrySet())
		{
			
		}
		
		

	}
	
	public static int sortDigits(int number)
	{
		int index=0;
		int remainder=0;
		int length=lengthOfDigits(number);
		int [] digitArray=new int [length];
		int sortNumber=0;
		while(number>0)
		{
			remainder=number%10;
			digitArray[index]=remainder;
			index=index+1;
			
			number=number/10;
		}
		Arrays.sort(digitArray);
		for (int i = 0; i < digitArray.length; i++) {
			sortNumber=sortNumber*10+digitArray[i];
		}
		return sortNumber;
	}
	
	public static int lengthOfDigits(int number)
	{
		int count=0;
		while(number>0)
		{
			number=number/10;
			count=count+1;
		}
		return count;
	}

}
