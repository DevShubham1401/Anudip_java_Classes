// Write a program to print prime number  series.

import java.util.Scanner;

public class PrimeNumberSeries {
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Not a prime number
            }
        }

        return true; // Prime number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}


// Outout:
// Enter the start of the range: 10
// Enter the end of the range: 50
// Prime numbers between 10 and 50:
// 11 13 17 19 23 29 31 37 41 43 47
