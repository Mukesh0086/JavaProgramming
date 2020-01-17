package com.bridgelabz.algorithmicProgramming;

import com.bridgelabz.utility.Utility;

public class StringPermute {

	public static void main(String[] args) {
		System.out.println("enter the string");
		String str = Utility.readString();
		permuteIterate(str);

	}

	public static void permuteIterate(String str) {
		int length = str.length();

		char[] array = str.toCharArray();
		int fact = 1;
		while (length > 0) {
			fact = fact * length;
			length--;
		}
		length = str.length();
		fact = fact / length;

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			int size = str.length() - 1;
			for (int j = fact; j > 0; j--) {
				char temp = array[size];
				array[size] = array[size - 1];
				array[size - 1] = temp;
				size = size - 1;
				if (size == 1) {
					size = array.length - 1;
				}

				for (int k = 0; k < array.length; k++) {

					System.out.print(array[k]);
				}
				System.out.println();
			}
			count++;
			if (count != array.length) {
				char ch = array[count];
				array[count] = array[0];
				array[0] = ch;
			}

		}
	}

}
