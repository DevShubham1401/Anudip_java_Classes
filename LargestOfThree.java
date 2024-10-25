// Write a program to find largest among three nos.

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       // Create a Scanner object to take input from the user

        // Prompt the user to enter the three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int largest = num1;         // Initialize the largest number as the first number

        // Compare with the second number
        if (num2 > largest) {
            largest = num2;
        }
         // Compare with the third number
        if (num3 > largest) {
            largest = num3;
        }

        System.out.println("The largest number is: " + largest);        // Display the largest number
        scanner.close();         // Close the scanner
    }
}


// Output:
// Enter the third number: 123
// Enter the first number: 456
// Enter the second number: 789
// The largest number is: 789