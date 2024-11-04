// Create the bean class using Employee details(EmpId,EmpName,EmpAge,Empsalary)
import java.io.Serializable;

// Employee Bean Class
public class EmployeeBeans implements Serializable {      
    // Fields for employee details
    private int empId, empAge;
    private String empName;
    private float empSalary;

    // Default constructor
    public EmployeeBeans() {}

    
    // Getter and Setter for empId
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // Getter and Setter for empAge
    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int empAge){
        this.empAge = empAge;
    }

    // Getter and Setter for empName
    public String getEmpName(){
        return empName;
    }

    public void setEmpName(String empName){
        this.empName = empName;
    }

    // Getter and Setter for empSalary
    public float getEmpSalary(){
        return empSalary;
    }

    public void setEmpSalary(float empSalary){
        this.empSalary = empSalary;
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Creating an Employee object using the parameterized constructor
        EmployeeBeans employee = new EmployeeBeans();

        // Modify details using setter methods
        employee.setEmpId(2202305);
        employee.setEmpName("Shubham Chavan");
        employee.setEmpAge(22);
        employee.setEmpSalary(999999);
   

        // Display updated details
        System.out.println("\nUpdated Employee Details using setters:");
        System.out.println("ID: " + employee.getEmpId());
        System.out.println("Name: " + employee.getEmpName());
        System.out.println("Age: " + employee.getEmpAge());
        System.out.println("Salary: " + employee.getEmpSalary());


    }
}


// Output:-
// Updated Employee Details using setters:
// ID: 2202305
// Name: Shubham Chavan
// Age: 22
// Salary: 999999.0