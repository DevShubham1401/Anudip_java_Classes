// Write a program to find weather given no is Armstrong or not.

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        // Create a Scanner object to take input from the user

        System.out.print("Enter a number to check if it is an Armstrong number: ");     // Prompt the user to enter a number to check
        int num = scanner.nextInt();

        int originalNum = num;      // Store the original number for comparison later
        int result = 0;        // Variable to store the sum of the cubes of each digit

        // Loop through each digit of the number
        while (originalNum != 0) {
            int digit = originalNum % 10;       // Get the last digit
            result += Math.pow(digit, 3);       // Add the cube of the digit to the result
            originalNum /= 10;           // Remove the last digit from the number
        }

        // Check if the result matches the original number
        if (result == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        scanner.close();         // Close the scanner
    }
}


// Output:
// Enter a number to check if it is an Armstrong number: 1234
// 1234 is not an Armstrong number.