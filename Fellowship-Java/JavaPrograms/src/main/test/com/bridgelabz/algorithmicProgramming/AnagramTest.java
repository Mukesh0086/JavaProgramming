package com.bridgelabz.algorithmicProgramming;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class AnagramTest {

	@Test
	
	
	public void isAnagramTest() {
		
		String s1="earth";
		String s2="heart";
		String s3="raghu";
		boolean actual1=Utility.isAnagram(s1, s2);
		boolean actual2=Utility.isAnagram(s1, s3);
		
		assertEquals(true, actual1);
		assertEquals(false, actual2);
		
		
	}

}
