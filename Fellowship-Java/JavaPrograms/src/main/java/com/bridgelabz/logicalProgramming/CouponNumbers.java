package com.bridgelabz.logicalProgramming;

import java.util.ArrayList;

import com.bridgelabz.utility.Utility;

public class CouponNumbers {
	
	public static void main(String[] args) {
		System.out.println("Enter the number of distinct coupon number required");
		int number=Utility.readInteger();
		int result=distinctCoupons(number);
		System.out.println("The number of times the coupon is generated is "+result);
		
	}
	
	public static int distinctCoupons(int number) {
		int i=0,j=0;
		ArrayList<Integer> couponList=new ArrayList<>();
		System.out.println(couponList.size());
		while(number>couponList.size())
		{
			System.out.println("check"+couponList.size());
			int coupon=(int) (Math.random()*10);
			
			
			for(Integer coupons:couponList)
			{
				if(couponList.size()<1)
				{
					couponList.add(coupon);
					
					
				}
				
				else if(coupons==coupon)
				{
					j=j+1;
				}
				else {
					couponList.add(coupons);
					;
				}
			}
		}
		
		
		return number+j;
		
		
		
	}
	
	

}
