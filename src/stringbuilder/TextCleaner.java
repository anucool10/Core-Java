package stringbuilder;

import java.util.Scanner;

public class TextCleaner {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter text here: ");
		String userInput = input.nextLine();
		StringBuilder clean = new StringBuilder();
		for(int i = 0; i<userInput.length();i++) {
			char c = userInput.charAt(i);
			if(Character.isLetterOrDigit(c)) {
				clean.append(c);
			}
		}
	


		System.out.println("Cleaned text: " + clean.toString());
        
        input.close();

}
}
