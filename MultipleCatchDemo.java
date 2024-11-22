// Write a program demonstrating multiple catch statements and finally block.

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int[] arr = {10, 20, 30};
            System.out.println("Array element: " + arr[5]); // ArrayIndexOutOfBoundsException
            int result = 10 / 0; // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        } finally {
            System.out.println("Execution completed. Resources cleaned.");
        }
    }
}

// Output:
// Array Index Error: Index 5 out of bounds for length 3
// Execution completed. Resources cleaned.