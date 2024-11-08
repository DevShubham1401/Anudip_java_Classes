// Define a class Address representing an address with attributes such as street, city, state, and zip code. Provide constructors to initialize these attributes.

public class Address {      // Class Address representing an address
    
    // Attributes of the address
    String street;
    String city;
    String state;
    String zipCode;
    
    public Address() {      // Default constructor (no arguments)
        // Initialize attributes with default values
        this.street = "";
        this.city = "";
        this.state = "";
        this.zipCode = "";
    }
    
    public Address(String street, String city, String state, String zipCode) {      // Parameterized constructor (with arguments to initialize attributes)
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    
    // Getter methods to retrieve the values of the attributes
    public String getStreet() {
        return street;
    }
    
    public String getCity() {
        return city;
    }
    
    public String getState() {
        return state;
    }
    
    public String getZipCode() {
        return zipCode;
    }
    
    // Setter methods to update the values of the attributes
    public void setStreet(String street) {
        this.street = street;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    public void displayAddress() {      // Method to display the address in a formatted manner
        System.out.println("Address: " + street + ", " + city + ", " + state + " - " + zipCode);
    }
    
    public static void main(String[] args) {        // Main method to test the Address class
        // Create an object using the default constructor
        Address address1 = new Address();
        address1.displayAddress();
        
        // Create an object using the parameterized constructor
        Address address2 = new Address("DRPM Road", "Gadhinglaj", "Maharashtra", "416502");
        address2.displayAddress();
    }
}


// Output:
// Address: , ,  - 
// Address: DRPM Road, Gadhinglaj, Maharashtra - 416502