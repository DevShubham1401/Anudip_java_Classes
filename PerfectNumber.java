// Write a java program to check given number is perfect number or not

import java.util.Scanner;

public class PerfectNumber {
    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = 0;

        // Find divisors and sum them up
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's a perfect number: ");
        int number = scanner.nextInt();

        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        scanner.close();
    }
}


// Output:
// Enter a number to check if it's a perfect number: 6
// 6 is a perfect number.
