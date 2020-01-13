package com.bridgelabz.junitProgramming;

import java.util.ArrayList;

import com.bridgelabz.utility.Utility;

public class ToBinary {
	
	//main method to call functions and input processing	
	
	public static void main(String[] args) {
		
		System.out.println("Enter decimal number to convert to binary");
		int number=Utility.readInteger();
		ArrayList<Integer> binaryList=new ArrayList<Integer>();
		binaryList=Utility.decimalToBinary(number);
		System.out.print("The binary equivalent of"+number+" is ");
		for(int i=binaryList.size()-1;i>=0;i--)
		{
			System.out.print(binaryList.get(i));
		}
		
	}
	
	
}

	//End of program
