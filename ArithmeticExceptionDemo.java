// Write a program demonstrating  Exception handling using try catch for Arithmatic Exception.

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try {
            int dividend = 50;
            int divisor = 0;
            int result = dividend / divisor; // Arithmetic Exception occurs
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
            System.out.println("Exception Details: " + e.getMessage());
        }
    }
}

// Outout:
// Error: Division by zero is not allowed!
// Exception Details: / by zero