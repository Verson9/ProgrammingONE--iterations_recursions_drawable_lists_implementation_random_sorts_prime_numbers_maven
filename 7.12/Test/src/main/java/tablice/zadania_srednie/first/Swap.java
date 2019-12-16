package tablice.zadania_srednie.first;

class Swap {
	static void swapE(Object[] tab, int i1, int i2){
		Object[] tmp = tab;
		Object tmpValue = tab[i1];
		tmp[i1] = tab[i2];
		tmp[i2] = tmpValue;
		for( Object element:tmp) {
			System.out.println(element.toString());
		}
	}
}
