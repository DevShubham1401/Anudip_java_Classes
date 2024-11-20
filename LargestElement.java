// Create Java Program to print the largest element in an array

public class LargestElement {
    // Method to find the largest element in an array
    public static int findLargest(int[] arr) {
        // Check if array is empty
        if (arr == null || arr.length == 0) {
            System.out.println("Array cannot be empty or null");
        }
        
        // Initialize largest as first element
        int largest = arr[0];
        
        // Compare with remaining elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    
    // Method to print array
    public static void printArray(int[] arr) {
        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
    
        int[] arr1 = {10, 324, 45, 90, 98, 100};
        printArray(arr1);
        System.out.println("Largest element: " + findLargest(arr1));
        
    }
}


// Output
// Array elements: 10 324 45 90 98 100 
// Largest element: 324