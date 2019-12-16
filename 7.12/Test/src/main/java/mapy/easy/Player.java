package mapy.easy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Player {
	Set<Integer> numbers = new HashSet <>();
	int liczbaZgadnietych = 0;
	private Scanner sc = new Scanner(System.in);


	void setNumbers () {
		System.out.println("Wpisz 10 liczb.\n"
		                   + "Każda z zakresu od 1 do 30.");
		for( int i = 0; i < 10 ; ) {
			System.out.println("Wpisz liczbę.");
			int k = sc.nextInt();
			if( numbers.contains(k) ){
				System.out.println("Wpisałeś już tę liczbę.\n"
				                   + "Ponów wybór.");
				continue;
			}
			numbers.add(k);
			System.out.println("Dodałeś liczbę: " + k);
			i++;
		}
	}

	void guessNumbers(Set<Integer> otherPlayerSetOfNumbers){
		System.out.println("Teraz zgadujesz 10 liczb, które wpisał drugi gracz.");
		for( int i = 0; i <numbers.size() ; i++ ) {
			System.out.println("Wpisz liczbę.");
			int k = sc.nextInt();
			System.out.println("Zgadujesz liczbę: " + k);
			if( otherPlayerSetOfNumbers.contains(k) ){
				System.out.println("Zgadłeś");
				liczbaZgadnietych++;
			}
			else System.out.println("Nie zgadłeś");
		}
		System.out.println("Łącznie zgadłeś " + liczbaZgadnietych + " liczb.");
	}
}
