package dsapractice;

import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(42);
        numbers.add(5);
        numbers.add(99);
        numbers.add(23);

        System.out.println("Original: " + numbers);
        
        int left = 0;       
        int right = numbers.size()-1;
        
        while(left<right) {        
        	 int temp = numbers.get(left);
        	 numbers.set(left, numbers.get(right));
        	 numbers.set(right, temp);       	 
        	 left++;
        	 right --;

         }
        

        System.out.println("Reversed: " + numbers);
    }
}