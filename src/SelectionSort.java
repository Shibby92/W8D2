public class SelectionSort {

	public static void main(String[] args) {
		int[] niz = { 3, 8, 9, 4, 5, 1, 6, 0, 7 };
		selectionSort(niz);

	}

	private static void selectionSort(int[] niz) {
		int min,temp;
		for (int i = 0; i < niz.length; i++) {
			min=i;
			for (int j = i+1; j < niz.length; j++) {
				if (niz[j] < niz[min]) {
					min = j;
				}
				printArray(niz);
			}
			temp=niz[i];
			niz[i]=niz[min];
			niz[min]=temp;			
			
		}
		printArray(niz);

	}
	private static void printArray(int[] niz) {
		for (int num : niz)
			System.out.print(num + " ");
		System.out.println();

	}


}
