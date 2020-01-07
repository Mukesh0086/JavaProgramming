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
		
		result=QuadriaticRoots(a, b, c);
		
		for(Map.Entry hm:result.entrySet())  //foreach loop for accessing Hashmap
			{		
				System.out.println(hm.getKey()+" ="+hm.getValue());
			}
	
	}
	
	/* The below QuadriaticRoots method will take 3 integer as input and calculate
	 * the two roots of the Quadriatic equation created those 3 integers 
	 * and returns a Hashmap 	
	 */
	
	public static HashMap<String,Float> QuadriaticRoots(int a,int b,int c)
	{
		
		HashMap<String, Float> roots=new HashMap();
		float root1=0,root2=0;
		root1=(float) ((-b+Math.sqrt(b*b-4*a*c))/2*a);
		root2=(float) ((-b-Math.sqrt(b*b-4*a*c))/2*a);
		roots.put("root1", root1);
		roots.put("root2", root2);
		return roots;
	}

}

	//End of program
