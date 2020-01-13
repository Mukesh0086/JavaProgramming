package com.bridgelabz.junitProgramming;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class ToDecimalTest {
	double expected1=15.0;
	double expected2=31.0;
	
	@Test
	
	public void toDecimalTest() {
		double actual1=Utility.toDecimal(1111);
		double actual2=Utility.toDecimal(11111);
		assertTrue(actual1==expected1);
		assertTrue(actual2==expected2);
		
	}

}
