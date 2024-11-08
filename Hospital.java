// Create a program in java to implement multilevel inheritance and hierarchical inheritance.
// Take classes like : Doctor , Surgeon and Nurse
// Create methods and show method overriding.


class Person {      // Base class Person
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}

class Doctor extends Person {       // Derived class Surgeon (multilevel inheritance from Person)
    protected String specialty;

    public Doctor(String name, int age, String specialty) {
        super(name, age);
        this.specialty = specialty;
    }

    public void introduce() {        // Overriding the introduce method in Doctor class
        super.introduce();
        System.out.println("I am a doctor specializing in " + specialty + ".");
    }
}

class Surgeon extends Doctor {      // Derived class Surgeon (multilevel inheritance from Doctor)
    protected int yearsOfExperience;

    public Surgeon(String name, int age, String specialty, int yearsOfExperience) {
        super(name, age, specialty);
        this.yearsOfExperience = yearsOfExperience;
    }

    public void introduce() {       // Overriding the introduce method in Surgeon class
        super.introduce();
        System.out.println("I have " + yearsOfExperience + " years of experience as a surgeon.");
    }
}

class Nurse extends Person {        // Derived class Nurse (hierarchical inheritance from Person)
    protected String department;

    public Nurse(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void introduce() {       // Overriding the introduce method in Nurse class
        super.introduce();
        System.out.println("I work in the " + department + " department.");
    }
}

public class Hospital {
    public static void main(String[] args) {
        // Multilevel inheritance
        Surgeon surgeon = new Surgeon("Dr. Shubham Chavan", 23, "Cardiology", 5);
        surgeon.introduce(); 

        // Hierarchical inheritance
        Doctor doctor = new Doctor("Dr. Tejas Kamthe", 38, "Pediatrics");
        doctor.introduce(); 

        Nurse nurse = new Nurse("Nurse Pragati Ingle", 28, "Emergency");
        nurse.introduce();
    }
}

// Output
// My name is Dr. Shubham Chavan and I am 23 years old.
// I am a doctor specializing in Cardiology.
// I have 5 years of experience as a surgeon.
// My name is Dr. Tejas Kamthe and I am 38 years old.
// I am a doctor specializing in Pediatrics.
// My name is Nurse Pragati Ingle and I am 28 years old.
// I work in the Emergency department.