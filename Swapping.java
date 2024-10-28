// Suppose the values of variables 'a' and 'b' are 6 and 8 respectively, write two programs to swap the values of the two variables.

// 1 - first program by using a third variable
// 2 - second program without using any third variable
// ( Swapping means interchanging the values of the two variables E.g.- If entered value of x is 5 and y is 10 then after swapping the value of x and y should become 10 and 5 respectively.)

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\t ------------ Swapping without Temprory variable ------------");
        System.out.print("\n\t Enter first number: ");
        int a = sc.nextInt();

        System.out.print("\n\t Enter second number: ");
        int b = sc.nextInt();

        System.out.println("\n Before swapping first number is: "+a+", & second number is: "+b);

        // Swapping without a third variable using arithmetic operations
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.print(" After swapping first number is: "+a+", & second number is: "+b);
        System.out.println("\n\t\t -------------------------------------------------");


        System.out.println("\n\t\t ------------ Swapping with Temprory variable ------------");

        System.out.print("\n\t Enter first number: ");
        int x = sc.nextInt();

        System.out.print("\n\t Enter second number: ");
        int y = sc.nextInt();

        System.out.println("\n Before swapping first number is: "+x+", & second number is: "+y);

        // Using a third variable to swap
        int temp = x;
        x = y;
        y = temp;

        System.out.print(" After swapping first number is: "+x+", & second number is: "+y);
        System.out.println("\n\t\t -------------------------------------------------");

        sc.close();
    }
}