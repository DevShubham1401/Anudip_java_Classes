// Write a program to reverse a  number.  

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // Create a Scanner object to take input from the user
        System.out.print("Enter a number to reverse: ");    // Prompt the user to enter a number to reverse
        int num = scanner.nextInt();
        int reversed = 0;       // Initialize variable to store the reversed number

        while (num != 0) {      // Loop until all digits are processed
            int digit = num % 10;       // Get the last digit of the current number
            reversed = reversed * 10 + digit;        // Append the digit to the reversed number
            num /= 10;      // Remove the last digit from the original number
        }

        System.out.println("Reversed number is: " + reversed);      // Display the reversed number
        scanner.close();        // Close the scanner
    }
}


// Output:
// Enter a number to reverse: 123
// Reversed number is: 321