package com.bridgelabz.logicalProgramming;

import java.util.HashMap;
import java.util.Map;

import com.bridgelabz.utility.Utility;

public class Gambler {
	
	//main method to call functions and input processing	
	
	public static void main(String[] args) {
		
		HashMap<String, Float> gamblerResult=new HashMap();
		System.out.println("Enter stake,goal,turns");
		int stake=Utility.readInteger();
		int goal=Utility.readInteger();
		int turns=Utility.readInteger();
		gamblerResult=Utility.gambling(stake, goal, turns);
		for(Map.Entry<String, Float> map: gamblerResult.entrySet())
		{
			System.out.println(map.getKey()+"="+map.getValue());
		}
		
	}
	
	

}


	
	

