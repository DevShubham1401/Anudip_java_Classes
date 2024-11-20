// Create Java Program to print the smallest element in an array

public class SmallestElement {
    
    // Method to find the smallest element in an array
    public static int findSmallest(int[] arr) {
        // Check if array is empty
        if (arr == null || arr.length == 0) {
            System.out.println("Array cannot be empty or null");
        }
        
        // Initialize smallest as first element
        int smallest = arr[0];
        
        // Compare with remaining elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
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
        System.out.println("Smallest element: " + findSmallest(arr1));
        
    }
}

// Output
// Array elements: 10 324 45 90 98 100 
// Smallest element: 10