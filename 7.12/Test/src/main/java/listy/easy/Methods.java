package listy.easy;

import java.util.List;

public class Methods {
	static void swap( List <Integer> listToSwap, int i1, int i2 ){
		int tmp1 = listToSwap.get(i1);
		listToSwap.set(i1, listToSwap.get(i2));
		listToSwap.set(i2, tmp1);

	}

	static void display(List<Integer> listToDisplay){
		System.out.println();
		for( Integer element:listToDisplay) {
			System.out.print(element + " ");
		}
	}
}
