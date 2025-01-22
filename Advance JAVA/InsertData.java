/*
The employees table in the database has the following columns: id, first_name, last_name, and age.
Write a Java program using JDBC to insert a new employee record into the table.
The employee's first name is "John," last name is "Doe," and age is 30.
 */

 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 
 public class InsertData {
     public static void main(String[] args) throws Exception {
         Class.forName("com.mysql.cj.jdbc.Driver");
         String url="jdbc:mysql://localhost:3306/store";
         String username="root";
         String password="root";
         Connection con=DriverManager.getConnection(url,username,password);
 
         String sql = "INSERT INTO employees (first_name, last_name, age, designation) VALUES ('John', 'Doe', 30,'Manager'),('Shubham','Chavan',33, 'Developer');";
 
         Statement stmt=con.createStatement();
         int updatedCount=stmt.executeUpdate(sql);
 
         System.out.println("Number of rows inserted : "+updatedCount);
         con.close();
     }
 }