package com.bridgelabz.logicalProgramming;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.bridgelabz.utility.Utility;

public class StopWatch {
	
	//main method to call functions and input processing	
	
	
	public static void main(String[] args) {
		
		LinkedHashMap<String, Long>result= new LinkedHashMap<String, Long>();
		result=Utility.stopWatch();
		System.out.println("printing in HH|MM|SS format");
		System.out.print(" | ");
		for(Map.Entry<String, Long> results:result.entrySet())
		{
			System.out.print(results.getValue()+" | ");
			
		}
	}
	
}

//End of the Program
