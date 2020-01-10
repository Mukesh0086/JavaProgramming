package com.bridgelabz.algorithmicProgramming;

import com.bridgelabz.utility.Utility;

public class BubbleSort {
	
	//main method to call functions and input processing
	
	public static void main(String[] args) {
		
		
		int []array= {10,51, 45,3,89,2};
		int [] arr=Utility.bubbleSort(array);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	
}

//End of Program
