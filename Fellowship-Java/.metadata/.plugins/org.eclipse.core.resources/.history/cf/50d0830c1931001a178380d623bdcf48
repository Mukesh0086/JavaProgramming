package com.bridgelabz.functionalProgramming;

import java.util.ArrayList;

import com.bridgelabz.utility.Utility;

public class SumEqualsZero {
	
	//main method to call functions and input processing
	
	public static void main(String[] args) {
		int []arr=new int [10];
		System.out.println("Enter 10 values for array");
		for(int i=0;i<10;i++)
		{
			int a=Utility.readInteger();
			arr[i]=a;
		}
		ArrayList<Integer> alist=new ArrayList<Integer>();
		alist=sumOfThreeNumberEqualsZero(arr);
		for(int i=0;i<alist.size();)
		{
			System.out.print(alist.get(i)+" ");
			System.out.print(alist.get(i+1)+" ");
			System.out.println(alist.get(i+2)+" ");
			i=i+3;
			System.out.println();
		}
		
	}
	

	/* The below sum of three numbers equals 0 method takes one integer array 
	 * iterate through it and if sum equals 0 the value ,the numbers are stored 
	 * in arraylist 	
	 */
	
	public static ArrayList<Integer> sumOfThreeNumberEqualsZero(int [] arr){
		ArrayList<Integer> list=new ArrayList<Integer>();
		int length=arr.length;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				for(int k=j+1;k<length;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						list.add(arr[i]); //adding values  arraylist
						list.add(arr[j]);
						list.add(arr[k]);
					}
				}
			}
		}
		
		return list;
	}

}
