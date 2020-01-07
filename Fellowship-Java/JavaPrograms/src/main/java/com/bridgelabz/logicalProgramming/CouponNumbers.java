package com.bridgelabz.logicalProgramming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.bridgelabz.utility.Utility;

public class CouponNumbers {
	
	public static void main(String[] args)  {
		
		System.out.println("Enter the number of distinct coupon number required");
		int number=Utility.readInteger();
		int result=distinctCoupons(number);
		System.out.println("The number of times the coupon is generated is "+result);
		
	}
	
	public static int distinctCoupons(int number){
		HashSet< Integer> hs=new HashSet();
		
		int count=0;
		int distinct=number;
		
		while(number>0 && hs.size()<=distinct)
		{
			
			boolean flag=false;
			
			count=count+1;
			int coupon=(int) (Math.random()*10);
			System.out.println("coupon"+coupon);
			
			
			flag=hs.add(coupon);
			
			
			
			if(flag==false)
			{
				number=number+1;
			}
		
			
			
			
		
		number=number-1;
		
			
			
		
	}	
		
		
		
		
		
		return count;
}
	



}
