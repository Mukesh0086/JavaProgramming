package com.bridgelabz.algorithmicProgramming;

public class BubbleSort {
	
	//main method to call functions and input processing
	
	public static void main(String[] args) {
		
		
		int []array= {10,51, 45,3,89,2};
		int [] arr=bubbleSort(array);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	/* The below insertionsort method takes an unsorted Integer array as input 
	 * and then  sort elements by using by using bubble sort logic	
	 */
	
	public static  int[] bubbleSort(int []array)
	{
		int temp=0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		return array;
	}
}

//End of Program
