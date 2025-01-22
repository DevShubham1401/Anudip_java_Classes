// Write Java program for deleting  data from emp table using jdbc with mysql.
 

import java.sql.*;

public class DeleteEmployeeData {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/store";
        String username = "root";
        String password = "root";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);

        String sqlQuery = "DELETE FROM employees WHERE id = ?"; // Delete a record based on ID
        PreparedStatement stmt = con.prepareStatement(sqlQuery);

        // Set the ID of the employee to delete
        int employeeIdToDelete = 1; // Example: Delete employee with ID 1
        stmt.setInt(1, employeeIdToDelete);

        // Execute the delete query
        int rowsAffected = stmt.executeUpdate();

        if (rowsAffected > 0) {
            System.out.println("Employee with ID " + employeeIdToDelete + " deleted successfully.");
        } else {
            System.out.println("No employee found with ID " + employeeIdToDelete);
        }

        // Close the connection
        con.close();
    }
}

