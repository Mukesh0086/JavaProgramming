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
		alist=Utility.sumOfThreeNumberEqualsZero(arr);
		for(int i=0;i<alist.size();)
		{
			System.out.print(alist.get(i)+" ");
			System.out.print(alist.get(i+1)+" ");
			System.out.println(alist.get(i+2)+" ");
			i=i+3;
			System.out.println();
		}
		
	}
	

	

}

	//End of program
