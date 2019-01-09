// Student - Roxanne Garcia
// This is my attempt at  the PigLatin converter

import java.util.Scanner;
import java.io.*;


public class PigLatin {

	public static void main(String[] args) throws FileNotFoundException {
	
		Scanner input = new Scanner(new File("test.txt"));
		
		while (input.hasNextLine()) {
		
		// storing text from file into variable
		String text = input.nextLine();
		

		Scanner words = new Scanner(text);
		
			while (words.hasNext()) {
			
				String word = words.next().toUpperCase();
	//			System.out.println(word);
				
				String pigWord = pigLatin(word).toUpperCase();
				
//				running display method
				printRowOutlined(word, pigWord);
				
			
			}
			
		}
		
	}
		
	// method to convert regular word into pig latin
	public static String pigLatin(String word) {
		
		String pigWord;
		
		// checks if the first letter is a vowel, if so apply PL rule
		if (isVowel(word.charAt(0))) {
			pigWord = word + "-way";
		
		// check to see if words starts with TH if so apply rule
		} else if (word.startsWith("th") || (word.toUpperCase().startsWith("TH"))) {
		
			// switches the letter at index 2 to the first index.
			pigWord = word.substring(2) + "-" + word.substring(0,2) + "ay";
		
		} else {
			pigWord = word.substring(1, word.length()) + "-" + word.charAt(0) + "ay";
		}
		return pigWord;
	}
		
		
	// method to check vowels 
	public static boolean isVowel(char c) {
			
		String vowels = "aeiouAEIOU";
			
		return (vowels.indexOf(c) >= 0); // when index of c in vowels is not -1, c is a vowel
		
	}
		
	// method to convert answer into tablular format
	private static void printRowOutlined(String left, String right) {
		
		System.out.printf("%s %15s\n", left, right);
		
	}

}