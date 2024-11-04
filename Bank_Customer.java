// Write a Java program to Create Bankcustomer class with acno,atype,amt fields using constructor overloading.

public class Bank_Customer {
    private int acno;       // Account number
    private String atype;   // Account type
    private double amt;     // Account balance

    // Constructor with all fields
    public Bank_Customer(int acno, String atype, double amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }

    // Constructor with account number and account type only
    public Bank_Customer(int acno, String atype) {
        this.acno = acno;
        this.atype = atype;
        this.amt = 0.0; // Default amount
    }

    // Constructor with account number only
    public Bank_Customer(int acno) {
        this.acno = acno;
        this.atype = "Savings"; // Default account type
        this.amt = 0.0; // Default amount
    }

    // Getters for accessing private fields
    public int getAcno() {
        return acno;
    }

    public String getAtype() {
        return atype;
    }

    public double getAmt() {
        return amt;
    }

    // toString method to display customer details
    @Override
    public String toString() {
        return "Account No: " + acno + ", Account Type: " + atype + ", Balance: " + amt;
    }

    // Main method to test the constructors
    public static void main(String[] args) {
        Bank_Customer customer1 = new Bank_Customer(12345, "Savings", 99999.0);
        Bank_Customer customer2 = new Bank_Customer(67890, "Current");
        Bank_Customer customer3 = new Bank_Customer(11223);

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
    }
}


// Output:-
// Account No: 12345, Account Type: Savings, Balance: 1000.0
// Account No: 67890, Account Type: Current, Balance: 0.0
// Account No: 11223, Account Type: Savings, Balance: 0.0