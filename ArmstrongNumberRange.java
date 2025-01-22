// Write a java Program to print  armstrong number.

import java.util.Scanner;

public class ArmstrongNumberRange {
    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int numDigits = String.valueOf(number).length(); // Get the number of digits

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits); // Raise digit to the power of numDigits
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the range to find Armstrong numbers:");
        System.out.print("Start: ");
        int start = scanner.nextInt();

        System.out.print("End: ");
        int end = scanner.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}

// Output:
// Enter the range to find Armstrong numbers:
// Start: 1
// End: 1000
// Armstrong numbers between 1 and 1000:
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 153
// 370
// 371
// 407
