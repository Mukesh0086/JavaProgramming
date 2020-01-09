package com.bridgelabz.functionalProgramming;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class QuadriaticTest {

	@Test
	public void QuadriaticRootsTest() {
		
		HashMap<String, Float> roots=new HashMap<String, Float>();
		HashMap<String, Float> result=new HashMap<String, Float>();
		roots.put("root1", (float) -1.0);
		roots.put("root2", (float) -1.0);
		result=Quadriatic.QuadriaticRoots(1, 2, 1); //AssertEquals methodcamparing hashmap 
														//for the Quadriatic roots
		assertEquals(roots, result);
	}

}
