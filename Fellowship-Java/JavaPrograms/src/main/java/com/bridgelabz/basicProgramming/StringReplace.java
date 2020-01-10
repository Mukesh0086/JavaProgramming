package com.bridgelabz.basicProgramming;

import com.bridgelabz.utility.Utility;

public class StringReplace {
	
	//main method to call functions and input processing
	
	public static void main(String[] args) {
		String str="Hello <<username>>";
		System.out.println("Enter the string to replace <<username>>");
		String replace=Utility.readString();
		String result=Utility.replace(str,replace);
		System.out.println(result);
	}
	
	

}

	//End of the program
