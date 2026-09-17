package stringbuilder;

import java.util.Scanner;

public class WordReverser {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = scanner.nextLine();
		
		String[] words = sentence.split(" ");
		StringBuilder reversed = new StringBuilder();
		
		for(int i = words.length-1; i>=0; i--) {
			reversed.append(words[i]);
			if (i > 0) {
                reversed.append(" ");
            }
		}
		 System.out.println("Reversed words: " + reversed.toString());
	        
	        scanner.close();
		
	}

	

}
