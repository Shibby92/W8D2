public class InsertionSort {

	public static void main(String[] args) {
		int[] niz = { 3, 8, 9, 4, 5, 1, 6, 0, 7 };
		insertionSort(niz);

	}

	private static void insertionSort(int[] niz) {
		int temp;
		for (int i = 0; i < niz.length; i++) {
			for (int j = 1; j < niz.length; j++) {
				while (j > 0 && niz[j] < niz[j - 1]) {
					temp = niz[j];
					niz[j] = niz[j - 1];
					niz[j - 1] = temp;
					printArray(niz);
					j--;
				}

			}
		}
	}

	private static void printArray(int[] niz) {
		for (int num : niz)
			System.out.print(num + " ");
		System.out.println();

	}

}
