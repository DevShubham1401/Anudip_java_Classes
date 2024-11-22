// Write a program using exception handling to handle array index out of bounds.

public class ArrayIndexExceptionDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        try {
            // Attempting to access an index beyond array bounds
            System.out.println("Accessing element at index 10: " + numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");
            System.out.println("Array length: " + numbers.length);
            System.out.println("Exception Details: " + e.getMessage());
        }
    }
}


// Output:
// Error: Invalid array index!
// Array length: 5
// Exception Details: Index 10 out of bounds for length 5