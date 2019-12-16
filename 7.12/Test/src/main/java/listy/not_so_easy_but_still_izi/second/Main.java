package listy.not_so_easy_but_still_izi.second;

import java.util.Stack;

public class Main {
	public static void main ( String[] args ) {
		DecimalToBinary d2b = new DecimalToBinary();
		Stack<Integer> stack = d2b.toBinary(10);

		int[] odwróconeNaPoprawne = new int[stack.size()];
		int i = stack.size()-1;
		while(!stack.isEmpty()){
			odwróconeNaPoprawne[i] = stack.pop();
			i--;
		} for( Integer el:odwróconeNaPoprawne) {
			System.out.print(el);
		}
	}
}
