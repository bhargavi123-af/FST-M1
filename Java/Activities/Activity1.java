
public class Activity1 {
	
	public void main(String[] args) {
		int[] arr = {10, 5, 10, 7, 10, 3};
		
		if (isSumOfTens30(arr)) {
            System.out.println("The sum of all 10's is exactly 30.");
        } else {
            System.out.println("The sum of all 10's is not exactly 30.");}
        }
		
		 public static boolean isSumOfTens30(int[] arr) {
		        int sum = 0;
		        
		        for (int num : arr) {
		            if (num == 10) {
		                sum += num;
		            }
		        }

		        
		        return sum == 30;

	}

}
