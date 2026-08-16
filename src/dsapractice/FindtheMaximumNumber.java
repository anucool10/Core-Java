package dsapractice;

import java.util.ArrayList;

public class FindtheMaximumNumber {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(42);
        numbers.add(5);
        numbers.add(99);
        numbers.add(23);

  
        
        int max = numbers.get(0);      
        for(int i = 0; i<numbers.size();i++) {
        	if(max<numbers.get(i)) {
        		max = numbers.get(i);
        	}
        }
        
        System.out.println("The maximum number is: " + max);
    }
}