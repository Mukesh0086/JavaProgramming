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
		result=stopWatch();
		System.out.println("printing in HH|MM|SS format");
		System.out.print(" | ");
		for(Map.Entry<String, Long> results:result.entrySet())
		{
			System.out.print(results.getValue()+" | ");
			
		}
	}
	
	/*The below stopwatch function uses Java Instant classes to capture the start and stop time
	 * then using Duration class between method the difference between the time id found 
	 * later its added to a LinkedHashMap 
	 */
	
	public static LinkedHashMap<String, Long>stopWatch()
	{
		LinkedHashMap<String, Long> stopwatch=new LinkedHashMap<String, Long>();
		Instant time1 = null,time2 = null;
		
		System.out.println("type start to start the watch");
		String start=Utility.readString();
		if(start.equalsIgnoreCase("start"))
		{
			time1=Instant.now();
		}
		System.out.println("type stop to stop the watch");
		String stop=Utility.readString();
		if(stop.equalsIgnoreCase("stop"))
		{
			time2=Instant.now();
		}
		
		Duration diff=Duration.between(time1, time2);
		long millisecond=diff.toMillis();
		long seconds=diff.toSeconds();
		long minutes=diff.toMinutes();
		long hours=diff.toHours();
		
		stopwatch.put("diff in hours ", hours);
		stopwatch.put("diff in minutes ", minutes);
		stopwatch.put("diff in seconds", seconds);
		
		
		
		
		return stopwatch;	
		
	}

}

//End of the Program
