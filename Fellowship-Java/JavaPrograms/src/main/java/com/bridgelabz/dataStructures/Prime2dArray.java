package com.bridgelabz.dataStructures;

import java.util.ArrayList;

import com.bridgelabz.utility.Utility;

public class Prime2dArray {
	public static void main(String[] args) {

		ArrayList<Integer> primeList = Utility.printIfPrimeNumber();
		int [][] primeArray=Utility.primeRepresentation(primeList);
		for (int[] i : primeArray) {
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