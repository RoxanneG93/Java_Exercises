import java.util.Iterator;
import java.util.Stack;

public class PlayStack {

	public static void main(String[] args) {
		
		
		Stack<Integer> integerStack = new Stack<Integer>();
		integerStack.push(1);
		integerStack.push(2);
		integerStack.push(3);
		integerStack.push(4);
		integerStack.push(5);
		
		Stack<String> stringStack = new Stack<String>();
		stringStack.push("Bilbo Baggins");
		stringStack.push("Gandalf");
		stringStack.push("Smaug");
		stringStack.push("Thorin Oakensheild");
		stringStack.push("Radagast");
		
		System.out.println(integerStack);
		System.out.printf("Integer Stack Tests: size is %d and 2nd element is %d\n", 
				integerStack.size(), integerStack.elementAt(1));
		
		Iterator<String> itr = stringStack.iterator();
		
		while(itr.hasNext()) {
			System.out.println(stringStack.pop());
		}


	}

}
