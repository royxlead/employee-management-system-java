package employee.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {
    Connection c;
    Statement statement;

    public conn() {
        try {
            // Load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeManagement", "root", "1234");
            // Create a statement object
            statement = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
