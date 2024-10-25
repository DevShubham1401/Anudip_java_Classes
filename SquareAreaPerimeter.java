import java.util.Scanner;

public class SquareAreaPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input side length of the square
        System.out.print("Enter the length of the side of the square: ");
        double side = scanner.nextDouble();

        // Calculate area
        double area = side * side;

        // Calculate perimeter
        double perimeter = 4 * side;

        // Display results
        System.out.println("Area of the square: " + area);
        System.out.println("Perimeter of the square: " + perimeter);

        scanner.close();
    }
}


// Output:-
// Enter the length of the side of the square: 10
// Area of the square: 100.0
// Perimeter of the square: 40.0