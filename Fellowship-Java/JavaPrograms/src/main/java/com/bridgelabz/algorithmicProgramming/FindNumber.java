package com.bridgelabz.algorithmicProgramming;

import com.bridgelabz.utility.Utility;

public class FindNumber {
	
	//main method to call functions and input processing
	
	public static void main(String[] args) {
		
		System.out.println("Enter the range");
		int range=Utility.readInteger();
		int [] numberArray=createArray(range);
		System.out.println("Think of a number between 0 and "+range);
		int key=Utility.readInteger();
		boolean result=findNumber(numberArray, key);
		System.out.println(result);
		
	}
	
	/*The below createArray takes a integer and creates a array of values
	 *  ranging from 0 to n
	 */
	
	public static int [] createArray(int n)
	{
		int [] array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=i;
		}
		return array;
	}
	
	/*The below method findNumber takes Integer array and int key as an arguement and 
	 * finds whether the key is present or not using binary search
	 */
	
	public static boolean findNumber(int []numberArray,int key)
	{
		boolean flag=false;
		int li=0;
		int hi=numberArray.length-1;
		while(li<=hi)
		{
			int mi=(li+hi)/2;
			if(numberArray[mi]==key)
			{
				flag=true;
				break;
			}
			else if(numberArray[mi]<key)
			{
				li=mi+1;
			}
			else if(numberArray[mi]>key)
			{
				hi=mi-1;
			}
		}
		return flag;
	}
	
	
}
//End of program
