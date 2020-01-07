package com.bridgelabz.logicalProgramming;

import java.util.HashMap;
import java.util.Map;

public class Gambler {
	
	public static void main(String[] args) {
		
		HashMap<String, Float> gamblerResult=new HashMap();
		gamblerResult=gambling(5, 8, 4);
		for(Map.Entry<String, Float> map: gamblerResult.entrySet())
		{
			System.out.println(map.getKey()+"="+map.getValue());
		}
		
	}
	
	public static HashMap<String,Float> gambling(int stake,int goal,int turns)
	{
		int win=0,loss=0,count=0;
		while(turns>0)
		{
			float result=(float) Math.random();
			if(result>0.5)	
			{
				win=win+1;
				
			}
			if(result<0.5)	
			{
				loss=loss+1;
				
			}
			if(result==goal)	
			{
				System.out.println("Goal Reached");
				break;
				
			}
			
			if(result==0)	
			{
				System.out.println("Lost full stake");
				break;
				
			}
			
			turns=turns-1;
			count=count+1;
			
		}
		
		float totalWin=win;
		float winPercentage=(win*100)/count;
		float lossPercentage=(loss*100)/count;
		
		HashMap<String,Float> gamblingResult=new HashMap();
		gamblingResult.put("totalWins", totalWin);
		gamblingResult.put("winPercentage", winPercentage);
		gamblingResult.put("lossPercentage", lossPercentage);
		return gamblingResult;
		
		
		
		
		
	}

}


	
	

