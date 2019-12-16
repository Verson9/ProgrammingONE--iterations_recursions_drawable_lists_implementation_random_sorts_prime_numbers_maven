package listy.not_so_easy_but_still_izi.first;

import java.util.Comparator;

public class StringLenghtComparator  implements Comparator<String> {
	@Override
	public int compare ( String s, String t1 ) {
		if( s.length() > t1.length() )
			return 1;
		if( s.length() < t1.length() )
			return -1;
		return 0;
	}
}
