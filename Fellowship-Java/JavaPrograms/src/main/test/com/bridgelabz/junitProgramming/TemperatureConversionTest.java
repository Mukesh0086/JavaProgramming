package com.bridgelabz.junitProgramming;

import static org.junit.Assert.*;

import org.junit.Test;

public class TemperatureConversionTest {

	@Test
	
	
	public static void temperartureConversionTest()
	{
	double resultFar=TemperatureConversion.temperatureConversion("cel", 60);
	double resultCel=TemperatureConversion.temperatureConversion("cel", 60);
	
	assertEquals(140.0, resultFar, 0.0);
	assertEquals(15, resultCel, 0.9);
	}
	
}