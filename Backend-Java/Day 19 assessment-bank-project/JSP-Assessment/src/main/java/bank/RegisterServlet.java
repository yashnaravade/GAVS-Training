package bank;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public RegisterServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        String initialBalanceStr = request.getParameter("initialBalance");

        double initialBalance = 0.0; // Default initial balance

        if (initialBalanceStr != null && !initialBalanceStr.isEmpty()) {
            try {
                initialBalance = Double.parseDouble(initialBalanceStr);
            } catch (NumberFormatException e) {
                // Handle the case where initialBalance is not a valid number
                response.sendRedirect("registration_error.jsp");
                return;
            }
        }

        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "Sandeep@77");

            // Insert a new user into the database
            PreparedStatement insertUserStatement = con.prepareStatement("INSERT INTO users (userId, password, balance) VALUES (?, ?, ?)");
            insertUserStatement.setString(1, userId);
            insertUserStatement.setString(2, password);
            insertUserStatement.setDouble(3, initialBalance);
            insertUserStatement.executeUpdate();

            // Redirect to a registration success page
            response.sendRedirect("registration_success.jsp");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
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
