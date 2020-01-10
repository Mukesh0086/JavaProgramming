package com.bridgelabz.basicProgramming;

import com.bridgelabz.utility.Utility;

public class FlipCoins {
	
//main method to call functions and input processing	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number of turns");
		
		int turns=Utility.readInteger();
		
		int headTailPercentage=Utility.flipsCoin(turns);
		
		System.out.println("The Percentage of Head vs Tail is "+headTailPercentage);
	}
}

	//End of program
