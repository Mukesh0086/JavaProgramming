package com.bridgelabz.functionalProgramming;

import java.util.HashMap;
import java.util.Map;

import com.bridgelabz.utility.Utility;

public class Quadriatic {
	
	//main method to call functions and input processing
	
	public static void main(String[] args) {
		
		System.out.println("Enter the value of a ,b ,c");
		int a=Utility.readInteger();
		int b=Utility.readInteger();
		int c=Utility.readInteger();
		
		HashMap<String, Float> result=new HashMap();
		
		result=Utility.QuadriaticRoots(a, b, c);
		
		for(Map.Entry hm:result.entrySet())  //foreach loop for accessing Hashmap
			{		
				System.out.println(hm.getKey()+" ="+hm.getValue());
			}
	
	}
	
	

}

	//End of program
