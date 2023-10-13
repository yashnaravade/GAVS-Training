package jdbcDemos;

import java.sql.*;

public class JDBCDemo2 {
    public static void main(String args[]) {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "Sandeep@77");
            System.out.println("Connection Established...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Statement s;
        try {
            s = con.createStatement();
            ResultSet rs = s.executeQuery("select employee_id, first_name, hire_date from employees where employee_id = 135");
            while (rs.next()) {
                System.out.println("Employee Id " + rs.getInt("employee_id"));
                System.out.println("Name " + rs.getString("first_name"));
                System.out.println("Date of Joining " + rs.getDate("hire_date"));
                System.out.println("-----------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
