package com.bridgelabz.basicProgramming;

import com.bridgelabz.utility.Utility;

public class StringReplace {
	
	//main method to call functions and input processing
	
	public static void main(String[] args) {
		String str="Hello <<username>>";
		System.out.println("Enter the string to replace <<username>>");
		String replace=Utility.readString();
		String result=replace(str,replace);
		System.out.println(result);
	}
	
	/* The below replace method takes a replace string and replaces <<username>>
	 * with replace string value 	
	 */
	
	public static String replace(String str,String replace)
	{
		return str.replaceFirst("<<username>>",replace);
	}

}

	//End of the program
