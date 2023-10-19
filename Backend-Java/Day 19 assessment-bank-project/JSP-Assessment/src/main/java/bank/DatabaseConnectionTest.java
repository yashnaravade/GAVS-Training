package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnectionTest {
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/Bank";
        String username = "root";
        String password = "Sandeep@77";

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database.");

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute a simple query (for example, fetching version information)
            ResultSet resultSet = statement.executeQuery("SELECT VERSION()");

            // Process the result
            if (resultSet.next()) {
                System.out.println("Database version: " + resultSet.getString(1));
            }

  
            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
