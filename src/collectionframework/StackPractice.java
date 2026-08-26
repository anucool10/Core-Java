package collectionframework;

import java.util.Stack;

public class StackPractice {
	public static void main (String[] args) {
		Stack<String>history = new Stack<>();
		history.push("google.com");
		history.push("youtube.com");
		history.push("github.com");
		
		System.out.println("Current Stack: " + history);
		String removedPage = history.pop();
        System.out.println("Just left: " + removedPage);
        String view = history.peek();
        System.out.println("Top of stack: " + view);
		
		System.out.println("Stack after going back: "+history);
	}

	
	
	
}
