package prosta_gierka;

import java.util.Scanner;

public class Game {
	Scanner sc = new Scanner( System.in );
	Player user1;
	Player user2;



	void start(){
		System.out.println("Witaj w grze w statki.");
		chooseGameType();
		user1.getName();
		System.exit(0);
	}

	void chooseGameType(){
		System.out.println(  "Wybierz system gry:\n"
		                   + "-Player vs Player 'PvP'\n"
		                   + "-Player vs Computer 'PvC'");
		String gametype = sc.nextLine().toLowerCase().replace("'", "");
		switch( gametype ){
			case "pvp" :
				pvpMode();
				return;

			case "pvc" :
				pvcMode();
			default:
				System.out.println("Wpisz poprawnie tryb rozgrywki.");
				chooseGameType();
		}
	}

	void pvpMode(){
		user1 = new User();
		System.out.println("Wybrałeś opcję Player vs Player.\n"
		                   + "Tworzysz gracza 1.");
		user1Creator();
		System.out.println("Torzysz gracza 2.");
		user2Creator();
	}

	void user1Creator(){
		System.out.println("Wpisz imię gracza:");
		String user1Name = sc.nextLine();
		user1.setName(user1Name);
		System.out.println(user1.getName() + " Ustaw swoje statki.");

	}

	void user2Creator(){

		System.out.print("Wpisz imię gracza:");
		String user2Name = sc.nextLine();
		user2.setName(user2Name);
		System.out.println(user2.getName() + " Ustaw swoje statki.");

	}

	void pvcMode(){
		System.out.println("Wybrałeś opcję Player vs Computer.");
		user1Creator();
		user2 = new Computer();
	}

}
