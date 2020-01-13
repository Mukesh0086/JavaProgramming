package com.bridgelabz.junitProgramming;

import java.util.ArrayList;

import com.bridgelabz.utility.Utility;

public class VendorMachine {
	static int count=0;
	
	//main method to call functions and input processing	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> fewestNotes=new ArrayList<Integer>();
		System.out.println("Enter the amount");
		int amount=Utility.readInteger();
		int []notes= {1000,500,100,50,20,10,5,2,1};
		fewestNotes=Utility.fewestNotes(notes, amount,0,0);
		
		}
	
		
	
	
	

}
