package listy.not_so_easy_but_still_izi.second;

import java.util.Stack;

class DecimalToBinary {
	Stack<Integer> stack = new Stack <>();

	Stack< Integer > toBinary(int decimalNumber) {
		if( decimalNumber == 0 )
			return stack;
		toBinary(decimalNumber/2);
		stack.push(decimalNumber%2);
		return stack;
	}
}
