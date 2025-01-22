/*
Write a Java program that updates the age and designation of an employee with the given name.
Assume that the connection to the database is established using the provided url, username, and password.
The program should update the age and designation columns for the employee specified by their name.
 */

 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.PreparedStatement;
 import java.util.Scanner;
 
 public class UpdateEmployeeData {
     public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
 
         String url = "jdbc:mysql://localhost:3306/store";
         String username = "root";
         String password = "Jun$1234";
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection(url, username, password);
 
         // Input: Employee ID, new age, and new designation
         System.out.print("Enter Employee ID to update: ");
         int empId = sc.nextInt();
         System.out.print("Enter new Age: ");
         int age = sc.nextInt();
         sc.nextLine();  // Consume the leftover newline
         System.out.print("Enter new Designation: ");
         String designation = sc.nextLine();
 
         // Prepare the SQL query
         String sql = "UPDATE employees SET age = ?, designation = ? WHERE id = ?";
         PreparedStatement stmt = con.prepareStatement(sql);
         stmt.setInt(1, age);
         stmt.setString(2, designation);
         stmt.setInt(3, empId);
 
         // Execute the update
         int rowsAffected = stmt.executeUpdate();
         if (rowsAffected > 0) {
             System.out.println("Employee details updated successfully.");
         } else {
             System.out.println("No employee found with the given ID.");
         }
 
         // Close the connection
         con.close();
         sc.close();
     }
 }