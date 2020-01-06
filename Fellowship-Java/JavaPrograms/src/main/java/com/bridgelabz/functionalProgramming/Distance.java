package com.bridgelabz.functionalProgramming;

import com.bridgelabz.utility.Utility;

public class Distance {
	
	//main method to call functions and input processing
	
	public static void main(String[] args) {
		System.out.println("Enter x and y co ordinates");
		int x=Utility.readInteger();
		int y=Utility.readInteger();
		double result=euclideanDistance(x, y);
		System.out.println(result);
	}
	
	/* The below sum of euclideanDistance Method takes two arguments x and y and 
	 * calculate the euclidean distance from origin to x and y  	
	 */
	
	public static double euclideanDistance(int x,int y)
	{
		return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
	}

}
