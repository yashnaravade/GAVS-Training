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

@WebServlet("/DepositServlet")
public class DepositServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public DepositServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("userId");
        double amountToDeposit = Double.parseDouble(request.getParameter("amount"));

        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "Sandeep@77");

            // Update the user's balance after deposit
            PreparedStatement updateBalanceStatement = con.prepareStatement("UPDATE users SET balance = balance + ? WHERE userId = ?");
            updateBalanceStatement.setDouble(1, amountToDeposit);
            updateBalanceStatement.setString(2, userId);
            updateBalanceStatement.executeUpdate();

            // Set the new balance in the session
            request.getSession().setAttribute("balance", getUpdatedBalance(userId, con));

            response.sendRedirect("balance.jsp");
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

    private double getUpdatedBalance(String userId, Connection connection) throws SQLException {
        PreparedStatement checkBalanceStatement = connection.prepareStatement("SELECT balance FROM users WHERE userId = ?");
        checkBalanceStatement.setString(1, userId);
        ResultSet balanceResultSet = checkBalanceStatement.executeQuery();

        if (balanceResultSet.next()) {
            return balanceResultSet.getDouble("balance");
        }

        return 0; // Return a default balance if no record found (you can adjust this as needed)
    }
}
