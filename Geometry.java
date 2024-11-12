// Write a Java program to create an interface Shape with the getArea() method. 
// Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.
// Implement the getArea() method for each of the three classes.


import java.util.Scanner;

// Define the Shape interface with the getArea method
interface Shape {
    double getArea(); // Method to calculate the area of the shape
}

// Rectangle class implementing Shape interface
class Rectangle implements Shape {
    double length, width;

    // Constructor to initialize length and width of the rectangle
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement getArea() for Rectangle
    public double getArea() {
        return length * width;
    }
}

// Circle class implementing Shape interface
class Circle implements Shape {
    double radius;

    // Constructor to initialize radius of the circle
    Circle(double radius) {
        this.radius = radius;
    }

    // Implement getArea() for Circle
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Triangle class implementing Shape interface
class Triangle implements Shape {
    double base, height;

    // Constructor to initialize base and height of the triangle
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implement getArea() for Triangle
    public double getArea() {
        return 0.5 * base * height;
    }
}

// Main class to execute and test the implementation
public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Rectangle input and area calculation
        System.out.print("Enter length of Rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of Rectangle: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);

        // Circle input and area calculation
        System.out.print("Enter radius of the Circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);

        // Triangle input and area calculation
        System.out.print("Enter base of Triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of Triangle: ");
        double height = scanner.nextDouble();
        Triangle triangle = new Triangle(base, height);

        System.out.println("\n-------------------- RESULT --------------------");
        System.out.println("Total area of Rectangle: " + rectangle.getArea());
        System.out.println("Total area of Circle: " + circle.getArea());
        System.out.println("Total area of Triangle: " + triangle.getArea());

        scanner.close();
    }
}

// Output:
// Enter length of Rectangle: 5
// Enter width of Rectangle: 4
// Enter radius of the Circle: 3
// Enter base of Triangle: 4
// Enter height of Triangle: 5

// -------------------- RESULT --------------------
// Total area of Rectangle: 20.0
// Total area of Circle: 28.274333882308138
// Total area of Triangle: 10.0
