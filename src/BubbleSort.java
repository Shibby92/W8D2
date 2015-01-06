public class BubbleSort {

	public static void main(String[] args) {
		int[] niz = { 3, 8, 9, 4, 5, 1, 6, 0, 7 };
		bubbleSort(niz);

	}

	private static void bubbleSort(int[] niz) {
		int temp,length;
		length=niz.length-1;
		for (int j = 0; j < niz.length; j++) {
		for (int i = 0; i < length; i++) {
		
				if (niz[i] > niz[i+1]) {
					temp = niz[i];
					niz[i] = niz[i+1];
					niz[i+1] = temp;
				}printArray(niz);
			}
		length--;
		}
	}

	private static void printArray(int[] niz) {
		for (int num : niz)
			System.out.print(num + " ");
		System.out.println();

	}

}
