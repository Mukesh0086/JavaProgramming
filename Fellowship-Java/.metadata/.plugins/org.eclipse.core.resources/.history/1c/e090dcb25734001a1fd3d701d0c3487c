package com.bridgelabz.junitProgramming;

import java.util.ArrayList;

import com.bridgelabz.utility.Utility;

public class ToBinary {
	
	//main method to call functions and input processing	
	
	public static void main(String[] args) {
		
		System.out.println("Enter decimal number to convert to binary");
		int number=Utility.readInteger();
		ArrayList<Integer> binaryList=new ArrayList<Integer>();
		binaryList=decimalToBinary(number);
		System.out.print("The binary equivalent of"+number+" is ");
		for(int i=binaryList.size()-1;i>=0;i--)
		{
			System.out.print(binaryList.get(i));
		}
		
		}
	
	/* The below  DecimalToBinary Method takes decimal number and convert it to 
	 * Binary by dividing it by 2 and storing remainder until number reaches 0	
	 */
	
	public static ArrayList<Integer> decimalToBinary(int number){
		
		ArrayList<Integer> binaryList=new ArrayList<Integer>();
		
		int bit=0;
		while(number>=1)
		{
			bit=number%2;
			binaryList.add(bit);
			number=number/2;	
			
		}
		return binaryList;
		
	}

}

	//End of program
