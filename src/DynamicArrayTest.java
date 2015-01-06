public class DynamicArrayTest {

	public static void main(String[] args) {
		DynamicArray test = new DynamicArray(2);
		test.add(10);
		test.add(15);
		test.add(20);
		System.out.println(test.getAt(2));
		System.out.println(test.getAt(1));
		int[] niz = test.toArray();
		for (int meh : niz)
			System.out.println(meh);
		test.removeAt(2);
		niz = test.toArray();
		for (int meh : niz)
			System.out.println(meh);

	}

}
