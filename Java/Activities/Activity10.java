package oops;

import java.util.HashSet;

public class Activity10 {
 
	 public static void main(String[] args) {
	        
	        HashSet<String> hs = new HashSet<>();
	        
	        
	        hs.add("Apple");
	        hs.add("Banana");
	        hs.add("Cherry");
	        hs.add("Date");
	        hs.add("Elderberry");
	        hs.add("Fig");
	        
	        
	        System.out.println("Size of the HashSet: " + hs.size());
	        
	        
	        boolean isRemoved = hs.remove("Date");
	        if (isRemoved) {
	            System.out.println("'Date' was removed from the HashSet.");
	        } else {
	            System.out.println("'Date' was not found in the HashSet.");
	        }

	        
	        isRemoved = hs.remove("Grapes");
	        if (isRemoved) {
	            System.out.println("'Grapes' was removed from the HashSet.");
	        } else {
	            System.out.println("'Grapes' was not found in the HashSet.");
	        }

	        
	        boolean containsBanana = hs.contains("Banana");
	        System.out.println("\nDoes the HashSet contain 'Banana'? " + containsBanana);

	        
	        System.out.println("\nUpdated HashSet: " + hs);
	    }
}
