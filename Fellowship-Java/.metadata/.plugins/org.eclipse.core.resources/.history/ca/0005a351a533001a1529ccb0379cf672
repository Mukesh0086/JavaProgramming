package com.bridgelabz.functionalProgramming;

import com.bridgelabz.utility.Utility;

public class TwodArray {
	
	//main method to call functions and input processing
	
	public static void main(String[] args) {
		
		System.out.println("Enter Rows");
		int rows=Utility.readInteger();
		System.out.println("Enter Columns");
		int columns=Utility.readInteger();
		double addArray[][]=twodArrayInputs(rows, columns);
		print2dArray(addArray, rows, columns);
		
		
	}
	
	/* The below twodArrayInputs method takes two inputs rows and columns and then 
	 * generate random value and the value is placed in a multi dimensional array 	
	 */
	
	public static double [][] twodArrayInputs(int rows ,int columns)
	{
		
		double [][] twodArray=new double[rows][columns];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				
				double input=Math.floor(Math.random() * (1000 - 100) + 100) / 100;
				
				
				twodArray[i][j]=input;
				
			}
			System.out.println("");
		}
		
		
		
		
		return twodArray;
				
	}
	
	/* The below print2dArray method takes rows ,columns and array from input
	 *  method and then prints the value
	 */
	
	public static double [][] print2dArray(double [][]twodArray,int rows,int columns)
	{
		//PrintWriter pw=new PrintWriter(System.out,true);
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print((twodArray[i][j])+" ");
			}
			System.out.println("");
		}
		return twodArray;
		
	}
	
}

//	End of program
