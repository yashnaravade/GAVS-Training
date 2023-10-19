package bank;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BalanceServlet")
public class BalanceServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public BalanceServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the user ID from the session to identify the currently logged-in user
        String userId = (String) request.getSession().getAttribute("userId");

        if (userId == null) {
            // If the user is not logged in, redirect them to the login page
            response.sendRedirect("login.jsp");
            return;
        }

        // Database connection parameters
        String jdbcURL = "jdbc:mysql://localhost:3306/Bank";
        String dbUser = "root";
        String dbPassword = "Sandeep@77";

        try {
            // Establish a database connection
            Connection con = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            // Prepare and execute a query to retrieve the user's balance
            String query = "SELECT balance FROM users WHERE userId = ?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, userId);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                double balance = resultSet.getDouble("balance");
                request.setAttribute("balance", balance);
            }

            resultSet.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle database errors appropriately, e.g., log them or display an error page.
            response.sendRedirect("error.jsp");
            return;
        }

        // Forward the request to the balance page
        request.getRequestDispatcher("balance.jsp").forward(request, response);
    }
}
