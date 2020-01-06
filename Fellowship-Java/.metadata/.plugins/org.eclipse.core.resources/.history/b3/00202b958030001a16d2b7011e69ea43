package com.bridgelabz.basicProgramming;

import java.io.PrintWriter;

import com.bridgelabz.utility.Utility;

public class TwodArray {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Rows");
		int rows=Utility.readInteger();
		System.out.println("Enter Columns");
		int columns=Utility.readInteger();
		int addArray[][]=twodArrayInputs(rows, columns);
		int printArray[][]=print2dArray(addArray, rows, columns);
		
		
	}
	public static int [][] twodArrayInputs(int rows ,int columns)
	{
		
		int [][] twodArray=new int[rows][columns];
		for(int i=0;i<=rows;i++)
		{
			for(int j=0;j<=columns;j++)
			{
				System.out.print("Enter Array Values");
				int input=Utility.readInteger();
				
				
				twodArray[i][j]=input;
				
			}
			System.out.println("");
		}
		
		
		
		
		return twodArray;
				
	}
	public static int [][] print2dArray(int [][]twodArray,int rows,int columns)
	{
		PrintWriter pw=new PrintWriter(System.out,true);
		for(int i=0;i<=rows;i++)
		{
			for(int j=0;j<=columns;j++)
			{
				System.out.println((twodArray[i][j]));
			}
			System.out.println("");
		}
		return twodArray;
		
	}
	

}
