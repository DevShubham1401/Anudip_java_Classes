// Write  a java program for Autoboxing.

public class AutoboxingExample {
    public static void main(String[] args) {
        // Autoboxing: Primitive to Wrapper conversion
        int num = 6604;  // primitive int
        Integer numObj = num;  // Autoboxing: int to Integer

        // Displaying the values
        System.out.println("Primitive int value: " + num);
        System.out.println("Wrapper Integer value: " + numObj);
    }
}

// Output:-
// Primitive int value: 6604
// Wrapper Integer value: 6604