import java.util.Arrays;

public class Activity2 {


	    public static void main(String[] args) {
	    	int[] array = {10, 77, 10, 54, -11, 10};
	    	System.out.println("Original Array: "+Arrays.toString(array)); 
	    	int search_n = 10;
	    	int fixed_sum = 30;	
	    	System.out.println("Result: "+result(array, search_n, fixed_sum));
	    	}	  
	    	public static boolean result(int[] numbers, int search_n, int fixed_sum) {
	    	int sum = 0;
	    	for (int number : numbers) {
	    	if (number == search_n) {
	    	sum += search_n;
	    	}
	    	if (sum > fixed_sum) {
	    	break;
	    	}
	    	}
	    	return sum == fixed_sum;
	    	}
}

