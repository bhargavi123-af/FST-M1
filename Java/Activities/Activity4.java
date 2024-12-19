import java.util.Arrays;

public class Activity4 {
	
	public static void main(String[] args) {
        
        int[] array = {12, 11, 13, 5, 6};
        
        
        System.out.println("Array before sorting: " + Arrays.toString(array));
        
        
        insertionSort(array);
        
        
        System.out.println("Array after sorting: " + Arrays.toString(array));
    }

    
    public static void insertionSort(int[] array) {
        int n = array.length;
        
        
        for (int i = 1; i < n; i++) {
            int key = array[i];  
            int j = i - 1;
            
            
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            
           
            array[j + 1] = key;
        }
    }

}
