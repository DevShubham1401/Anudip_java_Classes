// Create a Student class and create an array list to add 10 student objects and print them using a for each loop.

import java.util.ArrayList;

class Student {
    private String name;
    private int rollNumber;
    private String grade;
    
    // Constructor
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }
    
    // ToString method for easy printing
    @Override
    public String toString() {
        return "Student[name=" + name + ", rollNumber=" + rollNumber + ", grade=" + grade + "]";
    }
}

public class Array_List {
    public static void main(String[] args) {
        // Create ArrayList to store Student objects
        ArrayList<Student> students = new ArrayList<>();
        
        // Add 10 student objects
        students.add(new Student("Shubham Chavan", 1, "A"));
        students.add(new Student("Tejas Kamthe", 2, "B+"));
        students.add(new Student("Bhushan Ingle", 3, "A-"));
        students.add(new Student("Ravindra Kurhade", 4, "A"));
        students.add(new Student("Pravin Gunjal", 5, "B"));
        students.add(new Student("Atharv Patekar", 6, "A+"));
        students.add(new Student("Bhushan Sonje", 7, "B-"));
        students.add(new Student("Sambodhi Sacket", 8, "A"));
        students.add(new Student("Shriya Wankhede", 9, "B+"));
        students.add(new Student("Vaishnavi Shirsath", 10, "A-"));
        
        // Print all students using forEach loop
        System.out.println("List of Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

// Output:
//
// List of Students:
// Student[name=Shubham Chavan, rollNumber=1, grade=A]
// Student[name=Tejas Kamthe, rollNumber=2, grade=B+]
// Student[name=Bhushan Ingle, rollNumber=3, grade=A-]
// Student[name=Ravindra Kurhade, rollNumber=4, grade=A]
// Student[name=Pravin Gunjal, rollNumber=5, grade=B]
// Student[name=Atharv Patekar, rollNumber=6, grade=A+]
// Student[name=Bhushan Sonje, rollNumber=7, grade=B-]
// Student[name=Sambodhi Sacket, rollNumber=8, grade=A]
// Student[name=Shriya Wankhede, rollNumber=9, grade=B+]
// Student[name=Vaishnavi Shirsath, rollNumber=10, grade=A-]