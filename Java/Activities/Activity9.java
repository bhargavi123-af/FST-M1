package oops;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
        
        ArrayList<String> myList = new ArrayList<>();
        
        
        myList.add("Alice");
        myList.add("Bob");
        myList.add("Charlie");
        myList.add("David");
        myList.add("Eve");
        
        
        System.out.println("Names in the list:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        
        
        String thirdName = myList.get(2);
        System.out.println("\nThe 3rd name is: " + thirdName);
        
        
        boolean containsBob = myList.contains("Bob");
        System.out.println("\nDoes the list contain 'Bob'? " + containsBob);
        
        
        System.out.println("\nThe number of names in the list: " + myList.size());
        
        
        myList.remove("David");
        System.out.println("\nAfter removing 'David', the number of names in the list: " + myList.size());
        
        
        System.out.println("\nUpdated list of names:");
        for (String name : myList) {
            System.out.println(name);
        }
    }
}
