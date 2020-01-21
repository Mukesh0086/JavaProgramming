package com.bridgelabz.dataStructures;

import java.util.ArrayList;

import com.bridgelabz.utility.Utility;

public class PrimeAnagramQueue {

	public static void main(String[] args) {
		ArrayList<Integer> primeList = Utility.printIfPrimeNumber();
		int[][] primeArray = Utility.primeRepresentation(primeList);
		int[][] primeAndAnagramArray = Utility.anagramsArray(primeArray);
		Node result = Utility.storeAnagramsIntoQueue(primeAndAnagramArray);
		while (result != null) {
			System.out.println(result.data);
			result = result.next;
		}

	}

	

}
