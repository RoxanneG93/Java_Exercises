import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlayList {

	public static void main(String[] args) {
		
		
		
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(Integer.valueOf(10));
		integerList.add(Integer.valueOf(11));
		integerList.add(Integer.valueOf(12));
		integerList.add(Integer.valueOf(13));
		integerList.add(Integer.valueOf(14));
		
		List<String> stringList = new ArrayList<String>();
		stringList.add("Hello World");
		stringList.add("Bonjour le monde");
		stringList.add("Hola Mundo");
		stringList.add("annyeong sesang");
		stringList.add("Kon'nichiwa sekai");
		
		for(Integer data: integerList) {
			System.out.printf("Integer Value :%d\n", data);
		}
		
		Iterator<String> stringIterator = stringList.iterator();
		while(stringIterator.hasNext()) {
			System.out.printf("String Value :%s\n", stringIterator.next());
		}
		
		

	}

}
