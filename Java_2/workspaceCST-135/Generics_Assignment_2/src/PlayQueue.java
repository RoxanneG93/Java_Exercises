import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class PlayQueue {

	public static void main(String[] args) {
		
		
		Queue<Integer> integerQueue = new LinkedList<Integer>();
		integerQueue.add(1);
		integerQueue.add(2);
		integerQueue.add(3);
		integerQueue.add(4);
		integerQueue.add(5);
		
		Queue<String> stringQueue = new LinkedList<String>();
		stringQueue.add("Harry Potter");
		stringQueue.add("Hermione Granger");
		stringQueue.add("Ron Weasley");
		stringQueue.add("Draco Malfoy");
		stringQueue.add("Rubeaus Hagrid");
		
		System.out.println(integerQueue);
		System.out.printf("Integer Queue Tests: size is %d and head element is %d\n", integerQueue.size(), integerQueue.peek());
		
		Iterator<String> itr = stringQueue.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
