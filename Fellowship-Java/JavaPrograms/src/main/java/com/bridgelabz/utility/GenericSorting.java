package com.bridgelabz.utility;

public class GenericSorting {

	
	public static <T extends Comparable<? super T>> T[] Mysortgeneric(T s[]) {
		T tmp;
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if (s[i].compareTo(s[j]) < 1) {
					tmp = s[i];
					s[i] = s[j];
					s[j] = tmp;
				}
			}
		}
		return s;
	}
	
	

	public static String[] insertionSort(String arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			String temp = arr[i];
			int j = i - 1;
			while (j >= 0 && (arr[j].compareToIgnoreCase(temp) > 0)) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = temp;
		}
		return arr;
	}
	
	

	public static int[] insertion(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return arr;
	}
	
	

	public static String[] bubbleSort(String arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	
	public static char[] charsort(char arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (Character.compare(arr[i], arr[j]) > 0) {
					char temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;
	}
	
	

	public static <T extends Comparable<? super T>> void selectionSortgeneric(T[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j].compareTo(arr[min]) < 0) {
					min = j;
				}
			}
			T temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
	
	

	public static <T extends Comparable<? super T>> int binarySearchgeneric(T arr[], int beg, int end, T str) {
		while (beg <= end) {
			int mid = (beg + end) / 2;
			if (arr[mid].compareTo(str) < 0) {
				beg = mid + 1;
			} else if (arr[mid].compareTo(str) > 0) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		System.out.println("Item not found!!");
		return -1;
	}
	
	

	public static <T extends Comparable<? super T>> T[] insertionSortgeneric(T[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			T temp = arr[i];
			int j = i - 1;
			while (j >= 0 && (arr[j].compareTo(temp) > 0)) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = temp;
		}
		return arr;
	}

}
