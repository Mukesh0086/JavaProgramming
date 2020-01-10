package com.bridgelabz.functionalProgramming;

import com.bridgelabz.utility.Utility;

public class Distance {
	
	//main method to call functions and input processing
	
	public static void main(String[] args) {
		System.out.println("Enter x and y co ordinates");
		int x=Utility.readInteger();
		int y=Utility.readInteger();
		double result=Utility.euclideanDistance(x, y);
		System.out.println(result);
	}

}

	//End of program
