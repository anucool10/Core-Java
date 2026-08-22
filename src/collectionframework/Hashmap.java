package collectionframework;

import java.util.HashMap;

public class Hashmap {
	public static void main(String[] args) {
		HashMap<String, Integer>studentGrades = new HashMap<>();
		studentGrades.put("Alice", 85);
		studentGrades.put("Bob", 92);
		studentGrades.put("Charlie", 85);
		
		String lookupString = "Bob";
		if(studentGrades.containsKey(lookupString)) {
			System.out.println(studentGrades.get(lookupString));
		}
	
		
		
	}

	

}
