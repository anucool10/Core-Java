package exceptionhandling;

public class ParseTestException {
	public static void main(String args[]) {
		String input = "12345s";
		try {
			int number = Integer.parseInt(input);
			System.out.println("Parsed number: " + number);
		} catch (NumberFormatException e) {
			System.out.println("Invalid number format! you cannot convert text letters to numbers.");
		}
				
	}

	

}
