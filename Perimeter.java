// Write a class with the name Perimeter using function overload that computes the perimeter of a square, a rectangle and a circle.
// Formula:
// Perimeter of a square = 4 * s
// Perimeter of a rectangle = 2 * (l + b)
//   Perimeter of a circle = 2 * (22/7) * r

public class Perimeter {

    public double calculate(double s) {    // Method to calculate the perimeter of a square.
        return 4 * s;
    }

    public double calculate(double l, double b) {       // Method to calculate the perimeter of a rectangle.
        return 2 * (l + b);
    }

    public double calculateCircle(double r) {      // Method to calculate the perimeter of a circle.
        return 2 * (22.0 / 7.0) * r;  // Using an approximation for π as 22/7
    }

    // Main method to test the perimeter calculations
    public static void main(String[] args) {
        Perimeter perimeter = new Perimeter();

        // Calculate and display perimeter of a square
        double squarePerimeter = perimeter.calculate(5); // Parameter s = 5
        System.out.println("Perimeter of Square: " + squarePerimeter);

        // Calculate and display perimeter of a rectangle
        double rectanglePerimeter = perimeter.calculate(10, 5); // Parameter l = 10, b = 5
        System.out.println("Perimeter of Rectangle: " + rectanglePerimeter);

        // Calculate and display perimeter of a circle
        double circlePerimeter = perimeter.calculateCircle(7); // Parameter r = 7
        System.out.println("Perimeter of Circle: " + circlePerimeter);
    }
}


// Output:-
// Perimeter of Square: 20.0
// Perimeter of Rectangle: 30.0
// Perimeter of Circle: 44.0