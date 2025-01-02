package oops;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
	
	public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        
        ArrayList<Integer> list = new ArrayList<>();
        
        
        Random indexGen = new Random();
        
        
        System.out.print("Enter the number of elements you want to add to the list: ");
        int numberOfElements = scan.nextInt();
        
        
        System.out.println("Enter " + numberOfElements + " numbers:");
        for (int i = 0; i < numberOfElements; i++) {
            int number = scan.nextInt();
            list.add(number);
        }
        
        
        int randomIndex = indexGen.nextInt(list.size());  
        
       
        System.out.println("\nValue at the random index " + randomIndex + ": " + list.get(randomIndex));
        
        
        scan.close();
    }

}
