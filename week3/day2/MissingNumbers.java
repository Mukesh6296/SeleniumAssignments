package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNumbers {
	 public static void main(String[] args) {
	        // Initialize the list with the given numbers
	        List<Integer> numbers = new ArrayList<>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(10);
	        numbers.add(6);
	        numbers.add(8);

	        // Sort the list in ascending order
	        Collections.sort(numbers);

	        System.out.println("Sorted list: " + numbers);

	        // Loop through the list and check for gaps
	        for (int i = 0; i < numbers.size() - 1; i++) {
	            int current = numbers.get(i);
	            int next = numbers.get(i + 1);

	            // Check if current + 1 != next to detect a gap
	            if (current + 1 != next) {
	                // Print all missing numbers between current and next
	                for (int missing = current + 1; missing < next; missing++) {
	                    System.out.println("Missing number: " + missing);
	                }
	            }
	        }

	 }
	 }
