package collectionframework;

import java.util.LinkedList;

public class QueuePractice {

	public static void main(String[] args) {
		LinkedList<String>ticketLine = new LinkedList<>();
		ticketLine.add("Alex");
		ticketLine.add("Bob");
		ticketLine.add("Charlie");
		ticketLine.add("Daisy");
		ticketLine.add("Elon");
		System.out.println("Current Line: " + ticketLine);
		System.out.println("Next up: " + ticketLine.peek());
		String served = ticketLine.remove();
        System.out.println("Now serving: " + served);
        System.out.println("Line after serving: " + ticketLine);
	}
	

}
