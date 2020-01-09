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
		fewestNotes=fewestNotes(notes, amount,0,0);
		
		}
	
		
	
	/* The below  fewestNotes Method takes two arguments type and temperature and 
	 * convert to either in celsius or fahrenheit based on type  	
	 */
	
	public static ArrayList<Integer> fewestNotes(int [] result,int amount,int index,int count)
	{
		ArrayList<Integer> notes=new ArrayList<Integer>();
		while(amount>0)
		{
			if(amount>=result[index])
			{
				count=count+1;
				amount=amount-result[index];
				System.out.println(result[index]);
				notes=fewestNotes(result, amount, index,count);
			}
			else
			{
				
				index=index+1;
				notes=fewestNotes(result, amount, index,count);
			}
			break;
			
		}
		if(amount==0)
			System.out.println("Number of fewest notes required is "+count);
			
		return notes;
		
	}

}
