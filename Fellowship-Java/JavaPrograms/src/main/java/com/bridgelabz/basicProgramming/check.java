package com.bridgelabz.basicProgramming;

public class check {
	
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
	public static void main(String[] args) {
		
		int []arr= {6,4,23,7,12,96,22};
		int [] result=bubbleSort(arr);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
		
	}

}
