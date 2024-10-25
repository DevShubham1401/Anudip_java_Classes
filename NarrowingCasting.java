// Write a program to demonstrate NarrowCasting in java.

public class NarrowingCasting {
    public static void main(String[] args) {
        // Declare a double variable
        double doubleValue = 9.78;

        // Narrowing casting from double to int
        int intValue = (int) doubleValue;

        // Display the values
        System.out.println("Original double value: " + doubleValue);
        System.out.println("Narrowed int value: " + intValue);
    }
}


// Output:
// Original double value: 9.78
// Narrowed int value: 9
