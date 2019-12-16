package prosta_gierka;

public class Field {
	Object[][] field = new String[10][10];

	Ship uniflag1;
	Ship uniflag2;
	Ship uniflag3;
	Ship uniflag4;
	Ship uniflag5;

	Ship multiflag2to1 ;
	Ship multiflag2to2 ;
	Ship multiflag2to3 ;
	Ship multiflag2to4;

	Ship multiflag3to1 ;
	Ship multiflag3to2 ;
	Ship multiflag3to3 ;

	Ship multiflag4to1 ;
	Ship multiflag4to2 ;

	Ship multiflag5 ;

	public Field ( ) {
		for( int i = 0; i < field.length; i++ ) {
			for( int j = 0; j < field.length; j++ ) {
				field[i][j] = "☐";
			}
		}
	}

	void display(){
		for( Object[] objects : field ) {
			for( int j = 0; j < field.length; j++ ) {
				System.out.print(objects[j] + "  ");
			}
			System.out.println();
		}
	}
}
