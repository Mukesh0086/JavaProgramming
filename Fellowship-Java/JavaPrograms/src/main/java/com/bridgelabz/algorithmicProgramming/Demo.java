package com.bridgelabz.algorithmicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		int ans=anagramNumbers();
		System.out.println(ans);
	}
	public static int anagramNumbers()
	{
		int anagram=1246878;
		long check=0;
		for(int i=2;i<10;i++)
				
			{
				long anagramLong=anagram*i;
				char[] anagramString=String.valueOf(anagramLong).toCharArray();
				char[] anagramOriginal=String.valueOf(anagram).toCharArray();
				Arrays.sort(anagramString);
				Arrays.parallelSort(anagramOriginal);
				boolean flag=Arrays.equals(anagramString, anagramOriginal);
				if(flag==true)
				{
					 anagram=1246878;
				}
				else
				{
					anagram=0;
				}
				
				
				
			}
		
		
		
		
		
		return anagram;
	}

}
