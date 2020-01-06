package com.bridgelabz.basicProgramming;

import com.bridgelabz.utility.Utility;

public class FlipCoins {
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number of turns");
		
		int turns=Utility.readInteger();
		
		int headTailPercentage=flipsCoin(turns);
		
		System.out.println(headTailPercentage);
	}
	
	
	public static int flipsCoin(int turns)
	{
		int head=0,tail=0;
		
		while(turns>0)
		{
			double result=Math.random();
			if(result>0.5)
			{
				head=head+1;
			}
			else
			{
				tail=tail+1;
			}
			turns=turns-1;
		}
		
		return ((head*100)/tail);
	}
	
	

}
