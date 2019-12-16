package listy.not_so_easy_but_still_izi.first;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Queueue {
	public static void main ( String[] args ) {
		Comparator<String> comparator = new StringLenghtComparator();
		PriorityQueue<String> queue = new PriorityQueue <>(comparator);

		queue.add("Miasteczko");
		queue.add("Lol");
		queue.add("Zygota");

		for( int i = 0; i <= queue.size()+1; i++ )
			System.out.println(queue.poll());




	}
}
