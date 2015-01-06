/**
 * Klasa koja kreira dinamicki niz
 * 
 * @author harisarifovic
 *
 */
public class DynamicArray {
	private int[] array;
	private int count = 0;
	final int INIT_SIZE = 5;

	public DynamicArray(int size) {
		this.array = new int[size];

	}

	public DynamicArray() {
		this.array = new int[INIT_SIZE];
	}

	public int getSize() {
		return count;
	}

	/**
	 * Dodaje novi element u niz. Ako je niz ispunjen, prosiruje ga sa resize()
	 * 
	 * @param newElement
	 */
	public void add(int newElement) {
		if (count == array.length - 1)
			resize();
		array[count] = newElement;
		count++;
	}

	/**
	 * Prosiruje niz za dvostruku velicinu
	 */
	private void resize() {
		int[] tmp = new int[this.array.length * 2];
		for (int i = 0; i < array.length; i++) {
			tmp[i] = array[i];
		}
		array = tmp;

	}

	/**
	 * Vraca clan niza ukoliko je index validan, ukoliko ne baca exception
	 * 
	 * @param index
	 *            Index clana tog niza
	 * @return Broj koji se nalazi na tom indeksu
	 */
	public int getAt(int index) {
		if (index >= 0 && index < count) {
			return array[index];
		} else {
			throw new IndexOutOfBoundsException("Nije validan broj indexa!");
		}
	}

	/**
	 * Brise clan niza
	 * 
	 * @param index
	 *            Indeks clana niza koji se brise
	 */
	public void removeAt(int index) {
		if (index >= 0 && index < count) {
			for (int i = index; i < count; i++) {
				array[i] = array[i + 1];
			}
			count--;
		} else {
			throw new IndexOutOfBoundsException("Nije validan broj indexa!");
		}
	}

	/**
	 * Vraca niz sa elementima array niza, bez praznih elemenata
	 * 
	 * @return Niz koji sadrzi samo elemente array-a
	 */
	public int[] toArray() {
		int[] temp = new int[count];
		for (int i = 0; i < count; i++) {
			temp[i] = this.array[i];
		}
		return temp;
	}

}
