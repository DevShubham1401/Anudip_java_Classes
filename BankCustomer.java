// Write a java program to create Bankcustomer class with acno,atype,amt fields using parameterized constructor

public class BankCustomer {
    private int acno; // Account number
    private String atype; // Account type
    private double amt; // Account balance

    public BankCustomer(int acno, String atype, double amt) {       // Parameterized constructor to initialize a BankCustomer object.
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
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

    // toString() method to display customer details
    @Override
    public String toString() {
        return "Account No: " + acno + ", Account Type: " + atype + ", Balance: " + amt;
    }
    
     // Main method to test the BankCustomer class
     public static void main(String[] args) {       // Creating a new BankCustomer object using the parameterized constructor
        BankCustomer customer = new BankCustomer(12345, "Savings", 9999.00);

        System.out.println(customer.toString());        // Displaying the customer details using the toString method
     }
}


// Output:- Account No: 12345, Account Type: Savings, Balance: 9999.0