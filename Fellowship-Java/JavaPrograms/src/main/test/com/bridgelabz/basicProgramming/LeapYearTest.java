package com.bridgelabz.basicProgramming;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bridgelabz.basicProgramming.LeapYear;
import com.bridgelabz.utility.Utility;

public class LeapYearTest {

	int year=2000;
	
	@Before
	
	public void checkYear()
	{
	
		assertTrue(year/1000>=1); // checking entered year is 4 digit positive number
		
		
		
	}
	@Test
	
	public void isLeapYearTest() {
		
		
		assertTrue(year>1984);
		assertEquals(false, Utility.isLeapYear(year)); //Testing for multiple of 100 and false condition
		assertEquals(true, Utility.isLeapYear(2016)); //Testing for true condition
	}

}
