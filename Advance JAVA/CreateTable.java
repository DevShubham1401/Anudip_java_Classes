/*
You need to create a table named employees in the database to store employee information.
Write a Java program using JDBC to create the employees table with the following columns:

id of type INT, which is the primary key and auto-incremented.
first_name of type VARCHAR(50) to store the employee's first name.
last_name of type VARCHAR(50) to store the employee's last name.
age of type INT to store the employee's age.
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/store";
        String username="root";
        String password="root";
        Connection con=DriverManager.getConnection(url,username,password);

        // SQL query to create the employees table
        String sql_query = "CREATE TABLE employees ("
                + "id INT AUTO_INCREMENT PRIMARY KEY,"
                + "first_name VARCHAR(50) NOT NULL,"
                + "last_name VARCHAR(50) NOT NULL,"
                + "age INT NOT NULL,"
                + "designation VARCHAR(50)"
                + ");";
        Statement stmt=con.createStatement();

        stmt.executeUpdate(sql_query);
        System.out.println("Table created successfully");
        con.close();

    }
}