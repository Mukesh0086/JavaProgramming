
public class Try {

	

	public static String[] iterateWords(String word) {
		char a[] = word.toCharArray();
		int fact = 1, val = 1;
		while (fact <= a.length) {
			val = val * fact;
			fact++;
		}
		fact = val / a.length;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			int size = a.length - 1;
			for (int j = fact; j > 0; j--) {
				char ch = a[size];
				a[size] = a[size - 1];
				a[size - 1] = ch;
				--size;
				if (size == 1)
					size = a.length - 1;
				for (int k = 0; k < a.length; k++) {
					System.out.print(a[k]);
				}
				System.out.println();
			}
			count++;
			if (count != a.length) {
				char ch = a[count];
				a[count] = a[0];
				a[0] = ch;
			}

		}
		return null;
}
}