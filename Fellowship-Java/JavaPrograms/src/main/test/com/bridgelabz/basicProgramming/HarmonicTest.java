package com.bridgelabz.basicProgramming;

import static org.junit.Assert.*;

import org.junit.Test;

public class HarmonicTest {
	
	
	
	@Test
	public void test() {
		double result=Harmonic.harmonicMean(5);
		assertTrue(result>0);
		assertTrue(result>1);
	}

}
