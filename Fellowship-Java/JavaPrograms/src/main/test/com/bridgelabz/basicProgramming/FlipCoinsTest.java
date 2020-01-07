package com.bridgelabz.basicProgramming;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FlipCoinsTest {

	int flips=22;
	
	@Before
	public void checkTurnsPositive()
	{
		assertTrue(flips>0);
		
	}
	
	@Test
	public void test() {
		
		int test=FlipCoins.flipsCoin(flips);
		assertTrue("head tail percentage should greater than or equal to 0",test>=0);
		
		
		
	}

}