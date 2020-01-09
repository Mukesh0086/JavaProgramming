package com.bridgelabz.functionalProgramming;

import static org.junit.Assert.*;

import org.junit.Test;

public class WindChillTest {

	@Test
	public void windChillTest() {
		
		double result=WindChill.windChill(32, 60);
		assertEquals(13.14,result,0.01); //AssertEquals method to check value of wind produced
	}

}
