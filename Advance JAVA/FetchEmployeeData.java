// Write Java program fetching data from emp table query using jdbc with mysql.


import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchEmployeeData {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/store";
        String username = "root";
        String password = "root";
        Connection con = DriverManager.getConnection(url, username, password);

        Statement stmt = con.createStatement();

        String sql = "SELECT * FROM employees;";
        ResultSet rs = stmt.executeQuery(sql);

        StringBuilder data = new StringBuilder();

        data.append("<html><body><center><table border='1' bgcolor='lightblue'>");
        data.append("<tr><th>ID</th><th>First Name</th><th>Last Name</th><th>Age</th><th>Designation</th></tr>");

        while (rs.next()) {
            // Corrected to ensure the entire row is within <tr>
            data.append("<tr><td>").append(rs.getInt("id")).append("</td>")
                    .append("<td>").append(rs.getString("first_name")).append("</td>")
                    .append("<td>").append(rs.getString("last_name")).append("</td>")
                    .append("<td>").append(rs.getInt("age")).append("</td>")
                    .append("<td>").append(rs.getString("designation")).append("</td></tr>");
        }

        data.append("</table></center></body></html>");

        // Write the HTML content to a file
        try (FileOutputStream stream = new FileOutputStream("EmployeeDetails.html")) {
            stream.write(data.toString().getBytes());
            stream.flush();
        }

        System.out.println("Open EmployeeDetails.html file");

        // Close the connection
        con.close();
    }
}