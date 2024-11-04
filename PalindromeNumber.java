// Write a program to find given no is palindrome or not.

import java.util.Scanner;

public class PalindromeNumber {

    
    public static boolean isPalindrome(int number) {        // Method to check if a number is palindrome
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {          // Reversing the number
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        
        return originalNumber == reversedNumber;        // Checking if the reversed number is equal to the original
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");        // Input from user
        int number = scanner.nextInt();
        
        // Check and display if the number is a palindrome
        if (isPalindrome(number)) 
            System.out.println(number + " is a palindrome.");
        else 
            System.out.println(number + " is not a palindrome.");
        
        scanner.close();
    }
    
}

// Output:-
// Enter a number: 121
// 121 is a palindrome.