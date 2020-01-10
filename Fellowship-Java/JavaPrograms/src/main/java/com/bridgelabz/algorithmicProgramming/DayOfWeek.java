package com.bridgelabz.algorithmicProgramming;

import com.bridgelabz.utility.Utility;

public class DayOfWeek {
	
	//main method to call functions and input processing
	
	public static void main(String[] args) {
		
		System.out.println("Enter the day");
		int day=Utility.readInteger();
		System.out.println("Enter the month");
		int month=Utility.readInteger();
		System.out.println("Enter the year");
		int year=Utility.readInteger();
		int dayOfWeek=dayOfWeek(day, month, year);
		
		switch(dayOfWeek)
		{
		case 0:System.out.println("Sunday");break;
		case 1:System.out.println("Monday");break;
		case 2:System.out.println("Tuesday");break;
		case 3:System.out.println("Wednesday");break;
		case 4:System.out.println("Thursday");break;
		case 5:System.out.println("Friday");break;
		case 6:System.out.println("Saturday");break;
		}
		
	}
	
	/*The below dayOfWeek method takes 3 inputs day ,month ,year and apply the formula
	 * and return a integer. In main method the appropriate day of week is printed using switch case 
	 */
	
	public static int dayOfWeek(int day, int month, int year) {
		
		int m0, y0, d0, x;
		y0 = year - (14 - month) / month;
		x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		m0 = month + 12 * ((14 - month) / 12) - 2;
		d0 = (day + x + (31 * m0) / 12) % 7;
		return d0;
	}
}
