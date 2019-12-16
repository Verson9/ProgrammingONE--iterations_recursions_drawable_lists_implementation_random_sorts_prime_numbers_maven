package tablice.zadania_srednie.first;

public class Pierwsze {
	public static void main ( String[] args ) {
		Object[] tab = {1, "bob", "4.11f", false, 'x'};
		for( Object element: tab) {
			System.out.println(element.toString());
		}
		System.out.println();
		Swap.swapE(tab, 2, 3);
	}
}
