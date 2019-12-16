package listy.easy;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main ( String[] args ) {
		List < Integer > list = new ArrayList <>();
		for( int i = 1; i <= 10 ; i++ ) {
			list.add(i);
		}
		Methods.display(list);
		Methods.swap(list, 0, 9);
		Methods.swap(list, 2, 8);
		Methods.display(list);
	}
}
