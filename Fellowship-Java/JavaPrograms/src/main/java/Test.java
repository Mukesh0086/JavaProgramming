class Test {

	public static void main(String[] args) {
		int[] array = { 1, 5, 9, 74, 556 };
		boolean result = binarySearch(array, 74);
		System.out.println(result);
	}

	public static boolean binarySearch(int[] array, int value) {
		int start = 0;
		int end = array.length - 1;

		for (int i = 0; i < array.length; i++) {
			int middle = (end - start) / 2;
			if (array[i] == value) {
				return true;
			} else if (array[middle] > value) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
		}
		return false;
	}
}
