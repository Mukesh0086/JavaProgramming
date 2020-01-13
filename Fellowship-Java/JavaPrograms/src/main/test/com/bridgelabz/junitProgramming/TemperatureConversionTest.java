package com.bridgelabz.junitProgramming;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class TemperatureConversionTest {

	@Test
	
	
	public static void temperartureConversionTest()
	{
	double resultFar=Utility.temperatureConversion("cel", 60);
	double resultCel=Utility.temperatureConversion("cel", 60);
	
	assertEquals(140.0, resultFar, 0.0);
	assertEquals(15, resultCel, 0.9);
	}
	
}
