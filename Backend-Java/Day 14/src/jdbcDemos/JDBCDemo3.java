package jdbcDemos;

import java.sql.*;
import java.util.Scanner;

public class JDBCDemo3 {
    public static void main(String[] args) {
        Connection con = null;
        Scanner sc = new Scanner(System.in);

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            // Establish a database connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "Sandeep@77");
            System.out.println("Connection Established...");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        PreparedStatement s;

        try {
            System.out.println("Enter the employee id to search for the employee");
            int empid = sc.nextInt();

            // Prepare and execute a SQL query
            s = con.prepareStatement("SELECT employee_id, first_name, hire_date FROM employees WHERE employee_id = ?");
            s.setInt(1, empid);
            ResultSet rs = s.executeQuery();

            while (rs.next()) {
                System.out.println("Employee Id " + rs.getInt("employee_id"));
                System.out.println("Name " + rs.getString(2));
                System.out.println("Date of Joining " + rs.getDate(3));
                System.out.println("-----------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
