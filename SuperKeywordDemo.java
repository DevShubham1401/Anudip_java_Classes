// 2. Write a Java program  to invoke parent class constructor using super keyword.

// Parent class
class Person {
    protected String name;
    protected int age;

    // Parent class constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person class constructor called");
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class Employee
class Employee extends Person {
    private double salary;
    private String department;

    // Child class constructor
    public Employee(String name, int age, double salary, String department) {
        super(name, age);  // Calling parent class constructor using super
        this.salary = salary;
        this.department = department;
        System.out.println("Employee class constructor called");
    }

    // Override display method
    public void display() {
        super.display();  // Calling parent class display method
        System.out.println("Salary: $" + salary);
        System.out.println("Department: " + department);
    }
}

// Manager class extending Employee
class Manager extends Employee {
    private String teamName;

    // Manager constructor
    public Manager(String name, int age, double salary, String department, String teamName) {
        super(name, age, salary, department);  // Calling Employee class constructor
        this.teamName = teamName;
        System.out.println("Manager class constructor called");
    }

    public void display() {
        super.display();  // Calling Employee class display method
        System.out.println("Team Name: " + teamName);
    }
}

// Main class to test the code
class SuperKeywordDemo {
    public static void main(String[] args) {
        System.out.println("Creating a Manager object:");
        Manager manager = new Manager("Shubham Chavan", 35, 99000.0, "IT", "Development Team");
        System.out.println("\nDisplaying Manager Details:");
        manager.display();

        System.out.println("\nCreating an Employee object:");
        Employee employee = new Employee("Bhushi Ingle", 62, 60000.0, "HR");
        System.out.println("\nDisplaying Employee Details:");
        employee.display();
    }
}


// Output
// Creating a Manager object:
// Person class constructor called
// Employee class constructor called
// Manager class constructor called

// Displaying Manager Details:
// Name: Shubham Chavan
// Age: 35
// Salary: $99000.0
// Department: IT
// Team Name: Development Team

// Creating an Employee object:
// Person class constructor called
// Employee class constructor called

// Displaying Employee Details:
// Name: Bhushi Ingle
// Age: 62
// Salary: $60000.0
// Department: HR