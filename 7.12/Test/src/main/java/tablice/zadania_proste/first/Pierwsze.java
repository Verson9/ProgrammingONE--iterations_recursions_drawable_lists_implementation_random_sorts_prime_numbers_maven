package tablice.zadania_proste.first;

public class Pierwsze {
	public static void main ( String[] args ) {
		int[] tab = { 14, 40, 23, 974, 13, 102, 3001, 2014, 997, 86};
		for( int i = 0; i < tab.length; i++ ) {
			if( tab[i] < 9 ) continue;
			int jednosci = tab[i] % 10;
			int dziesiatki =( tab[i] % 100 - jednosci) / 10;
			int setki = (tab[i] % 1000 - tab[i] % 100) /100;
			int tysiące = (tab[i] % 10000 - tab[i] % 1000) /1000;
			if( jednosci + dziesiatki + setki + tysiące == 4 ) System.out.println(tab[i]);
		}
	}
}
