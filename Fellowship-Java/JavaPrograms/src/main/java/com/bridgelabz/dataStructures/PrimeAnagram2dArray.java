package com.bridgelabz.dataStructures;

import java.util.*;

import com.bridgelabz.utility.Utility;

public class PrimeAnagram2dArray {

	public static void main(String[] args) {
		ArrayList<Integer> primeList = Utility.printIfPrimeNumber();
		int[][] primeArray = Utility.primeRepresentation(primeList);
		int [][] primeAndAnagramArray=Utility.anagramsArray(primeArray);
		for (int[] i : primeAndAnagramArray) {
			for (int j : i) {
				if (j == 0)
					System.out.print(" ");
				else
					System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	

}
