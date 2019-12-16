package mapy.easy;

public class Game {
	private Player p1 = new Player();
	private Player p2 = new Player();

	void start(){
		System.out.println("Gracz pierwszy wybiera liczby.");
		p1.setNumbers();
		System.out.println("Gracz drugi wybiera liczby.");
		p2.setNumbers();
		System.out.println("Teraz zgadujemy!!!\n"
		                   + "Pierwszy gracz.");
		p1.guessNumbers(p2.numbers);
		p2.guessNumbers(p1.numbers);
		System.out.println();
		compareZgadniecia(p1.liczbaZgadnietych, p2.liczbaZgadnietych);
		System.exit(0);
	}

	private void compareZgadniecia ( int liczbaZgadniecP1, int liczbaZgadniecP2 ){
		if( liczbaZgadniecP1 > liczbaZgadniecP2) System.out.println("Wygrał Player1");
		if( liczbaZgadniecP1< liczbaZgadniecP2 ) System.out.println("Wygrał Player2");
		else System.out.println("REMISSSS!!!");
	}

	public static void main ( String[] args ) {
		Game game = new Game();
		game.start();
	}
}
