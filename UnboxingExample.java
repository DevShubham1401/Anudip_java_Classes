public class UnboxingExample {
    public static void main(String[] args) {
        // Unboxing: Wrapper to Primitive conversion
        Integer numObj = 6604;  // Wrapper Integer
        int num = numObj;  // Unboxing: Integer to int

        // Displaying the values
        System.out.println("Wrapper Integer value: " + numObj);
        System.out.println("Primitive int value: " + num);
    }
}

// Output:-
// Wrapper Integer value: 6604
// Primitive int value: 6604
