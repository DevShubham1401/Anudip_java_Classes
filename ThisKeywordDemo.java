// 1. Write a Java Program  to pass  this keyword as argument in the constructor call.

class Student {
    String name;
    int age;
    Address address;  // Student has an address

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = new Address(this);  // Passing 'this' to Address constructor
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Address {
    String street;
    Student student;  // Reference to the student

    // Constructor accepting Student instance
    public Address(Student student) {
        this.student = student;
        this.street = "Default Street";
    }

    // Method to display student details from Address class
    public void displayStudentInfo() {
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student's Street: " + this.street);
    }
}

// Main class to test the code
class ThisKeywordDemo {
    public static void main(String[] args) {
        Student student = new Student("Shubham Chavan", 22);
        Address address = new Address(student);
        address.displayStudentInfo();
    }
}

// Output
// Student Name: Shubham Chavan
// Student Age: 22
// Student's Street: Default Street