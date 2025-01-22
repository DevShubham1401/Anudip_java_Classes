// Write a program to print palindrome number.

import java.util.Scanner;

public class PalindromeNumberRange {
    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
            number /= 10; // Remove the last digit
        }

        return originalNumber == reversedNumber; // Compare original and reversed numbers
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        System.out.println("Palindrome numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}


// Output:
// Enter the start of the range: 100
// Enter the end of the range: 200
// Palindrome numbers between 100 and 200:
// 101 111 121 131 141 151 161 171 181 191
