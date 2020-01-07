package com.bridgelabz.basicProgramming;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bridgelabz.basicProgramming.LeapYear;

public class LeapYearTest {

	int year=2000;
	
	@Before
	
	public void checkYear()
	{
		assertTrue(year>0);
		assertTrue(year/1000>=1);
		assertTrue(year<3000);
		
		
	}
	@Test
	
	public void test() {
		
		
		assertTrue(year>1984);
		assertEquals(false, LeapYear.isLeapYear(year));
		assertEquals(true, LeapYear.isLeapYear(2016));
	}

}
