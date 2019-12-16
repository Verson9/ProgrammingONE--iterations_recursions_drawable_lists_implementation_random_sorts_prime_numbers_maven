package tablice.zadania_proste.second;

public class Drugie {
	public static void main ( String[] args ) {
		int [] tabOfInts = new int[101];
		for( int i = 0; i < tabOfInts.length ; i++ ) {
			tabOfInts[i] = i;
		}

		for( int i = 0; i < Math.sqrt(tabOfInts.length); i++) {
			System.out.println(tabOfInts[i*i]);
		}
	}
}
