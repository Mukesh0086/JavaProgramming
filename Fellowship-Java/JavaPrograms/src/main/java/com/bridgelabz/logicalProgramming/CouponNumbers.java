package com.bridgelabz.logicalProgramming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.bridgelabz.utility.Utility;

public class CouponNumbers {
	
	//main method to call functions and input processing	
	
	public static void main(String[] args)  {
		
		System.out.println("Enter the number of distinct coupon number required");
		int number=Utility.readInteger();
		int result=Utility.distinctCoupons(number);
		System.out.println("The number of times the coupon is generated is "+result);
		
	}
	
	
	
}
//End of Program

