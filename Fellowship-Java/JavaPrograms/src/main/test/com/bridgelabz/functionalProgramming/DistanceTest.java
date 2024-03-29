package com.bridgelabz.functionalProgramming;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class DistanceTest {

	@Test
	public void euclideanDistanceTest() {
		
		double result=Utility.euclideanDistance(5, 5); // Testing for positive co ordinates
		double result1=Utility.euclideanDistance(-5, -3); //Testing for negative co ordinates
		assertEquals(7.08, result, 0.01);
		assertEquals(5.84, result1, 0.01);
		
	}

}
