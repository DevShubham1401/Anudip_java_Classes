// Create an interface called "Person" with a method called "speak". 
// Create two classes  called "Student" and "Teacher" that implement  the Person interface and implement the "speak" method. 
// Create objects of both the Student and  Teacher classes and call their respective "speak"  methods.


interface Person {                       // Define the Person interface with a method called "speak"
    void speak();
}

class Student implements Person {        // Define the Student class that implements the Person interface
    public void speak() {                       // Implement the speak method
        System.out.println("I am a Student.");
    }
}

class Teacher implements Person {        // Define the Teacher class that implements the Person interface
    public void speak() {                       // Implement the speak method
        System.out.println("I am a Teacher.");
    }
}

public class Main {                              // Main class to test the implementation
    public static void main(String[] args) {
        Person student = new Student();          // Create an object of Student
        Person teacher = new Teacher();         // Create an object of Teacher   
        
        // Call the speak method for both objects
        student.speak();
        teacher.speak();
    }
}


/*
Output
I am a Student.
I am a Teacher.
*/