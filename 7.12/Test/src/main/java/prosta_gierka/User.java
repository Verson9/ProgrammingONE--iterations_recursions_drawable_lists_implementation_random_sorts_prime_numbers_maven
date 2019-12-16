package prosta_gierka;

import java.util.Scanner;

public class User implements Player {
	Scanner sc =new Scanner(System.in);

	String name;
	public Field myField = new Field();
	Field enemyField = new Field();
	Field shootingField = new Field();

	public void display (){
		myField.display();
	}

	@Override
	public void setName ( String name ) {
	this.name = name;
	myField.display();
	}

	@Override
	public String getName () {
		return name;
	}


}
