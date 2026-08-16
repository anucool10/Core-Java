package dsapractice;

import java.util.ArrayList;


public class FindtheSecondMaxNumber {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(42);
        numbers.add(5);
        numbers.add(99);
        numbers.add(23);

        int max = numbers.get(0);
        int secondMax = Integer.MIN_VALUE; 

        // TODO: Write a loop to update 'max' and 'secondMax'
        for (int i = 1; i < numbers.size(); i++) {
            int current = numbers.get(i);
            if(current > max) { //Check if current is greater than max first.
            	secondMax = max;  // If it is, update secondMax to old max, then update max to current.
            	max = current;
            }else {   // Otherwise, check if current is greater than secondMax (and not equal to max).
            	if(current > secondMax && current!=max) {
            		secondMax=current;
            	}
            }         
             
        }

        System.out.println("The maximum number is: " + max);
        System.out.println("The second maximum number is: " + secondMax);
    }
}