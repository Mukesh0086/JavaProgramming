package com.bridgelabz.algorithmicProgramming;

import com.bridgelabz.utility.Utility;

public class RegexPassage {
	
	//main method to call functions and input processing
	
	
	public static void main(String[] args) {
		
		
		String str=" Hello <<name>>, We have your "
				+ "full name as <<full name>> in our system. your contact number is"
				+ " 91-xxxxxxxxxx. Please,let us know in case of any clarification "
				+ "Thank you BridgeLabz 01/01/2016. Use Regex to replace name,"
				+ " full name, Mobile#, and Date with proper value.";
		
		System.out.println("Enter the Name");
		String name=Utility.readString();
		System.out.println("Enter the Full Name");
		String fullName=Utility.readString();
		System.out.println("Enter the Phone Number");
		String phNumber=Utility.readString();
		System.out.println("Enter the Date");
		String date=Utility.readString();
		String replacedStr=Utility.regexPassageReplace(str, name, fullName, phNumber, date);
		System.out.println(replacedStr);
		
	}
	
	
}
//End of the Program
