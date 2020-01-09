package com.bridgelabz.basicProgramming;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PowerOfTest {
	
	int exp=3;
	int exp1=8;
	int exp2=0;
	int result=0,result1=0;
	
	
	
	@Before
	
	
	public void checkExponent() 
	{
		result=PowerOf.power(exp);
		result1=PowerOf.power(exp2);
		assertTrue(exp>0); //checking exp Entered is positive
		assertTrue(result>0);//check the ouput is more than 0
		
	}

	@Test
	public void powerTest() {
		assertEquals(8, result, 0); //assertEquals method to check for positive integer
		assertEquals(1,result1 ,0); //assertEquals method to check for 0
	}

}
