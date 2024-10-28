// Write a program for even odd by using conditional  operators.

import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to check whether it is Even or Odd: ");
        int num = sc.nextInt();

        String Result = (num % 2 ==0 )?"Even" : "Odd";  // Using conditional (ternary) operator to check even or odd

        System.out.println("The number "+num+" is: "+Result);  // Displaying the result

        sc.close();
    }
}
