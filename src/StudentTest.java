public class StudentTest {

	public static void main(String[] args) {
		Student prvi = new Student("Haris", 120010, 5.56);
		Student drugi = new Student("Mukelefa", 120010, 5.56);
		Student treci = new Student("Mezit", 120011, 5.56);
		Student cetvrti = new Student("Hurija", 45687, 8);
		Student peti = new Student("Haris", 120010, 5.56);
		System.out.println(prvi.compareTo(drugi));
		System.out.println(prvi.compareTo(treci));
		System.out.println(prvi.compareTo(peti));
		System.out.println(prvi.compareTo(cetvrti));
		// pravimo i unosimo studente u niz studenata
		Student[] niz = new Student[5];
		niz[0] = prvi;
		niz[1] = drugi;
		niz[2] = treci;
		niz[3] = cetvrti;
		niz[4] = peti;
		// ispisuje promjene prije i poslije sortiranja
		for (Student meh : niz) {
			System.out.println(meh.toString());
		}
		System.out.println();
		sort(niz);
		for (Student meh : niz) {
			System.out.println(meh.toString());
		}
	}

	/**
	 * Sortira ninz po prioritetima iz metode compareTo
	 * 
	 * @param niz
	 *            Niz koji se sortira
	 */
	private static void sort(Student[] niz) {
		Student temp;
		for (int i = 0; i < niz.length; i++) {
			for (int j = 1; j < niz.length; j++) {
				while (j > 0 && niz[j].compareTo(niz[j - 1]) < 0) {
					temp = niz[j];
					niz[j] = niz[j - 1];
					niz[j - 1] = temp;
					j--;
				}

			}
		}

	}

}
