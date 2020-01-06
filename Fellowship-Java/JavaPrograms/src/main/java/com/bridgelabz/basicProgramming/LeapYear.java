package com.bridgelabz.basicProgramming;

public class LeapYear {
	
	public static boolean leapYear(int year)
	{
		boolean flag=false;
		if((year%4==0) && (year%100!=0) || (year%400==0) && (year%100!=0))
		{
			flag=true;
		}
		return flag;
		
	}

}
