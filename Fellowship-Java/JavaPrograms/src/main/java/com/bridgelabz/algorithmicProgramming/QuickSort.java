package com.bridgelabz.algorithmicProgramming;

import com.bridgelabz.utility.Utility;

public class QuickSort {

	


	// main method to call functions and input processing
	public static void main(String args[]) {
		int arr[] = { 11,4,5,9,23,1,89,46};
		int n = arr.length;

		QuickSort ob = new QuickSort();
		Utility.sort(arr, 0, n - 1);

		System.out.println("sorted array");
		Utility.printArray(arr);
	}
}
