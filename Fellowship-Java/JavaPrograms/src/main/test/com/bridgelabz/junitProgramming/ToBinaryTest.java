package com.bridgelabz.junitProgramming;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class ToBinaryTest {
	
	ArrayList<Integer> expected=new ArrayList<Integer>();
	int decimalNumber=43;
	
	
	@Before
	
	public void checkDecimalPositive(int decimalNumber)
	{
		assertTrue(decimalNumber>0);
	}

	@Test
	
	public void decimalToBinaryTest() {
		expected.add(1);
		expected.add(1);
		expected.add(0);
		expected.add(1);
		expected.add(0);
		expected.add(1);
		ArrayList<Integer> binaryList=Utility.decimalToBinary(decimalNumber);
		assertEquals(expected, binaryList);
	}

}
