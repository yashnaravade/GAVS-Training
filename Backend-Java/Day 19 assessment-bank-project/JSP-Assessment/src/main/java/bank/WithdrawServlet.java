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

@WebServlet("/WithdrawServlet")
public class WithdrawServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public WithdrawServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userId = request.getParameter("userId");
        double amountToWithdraw = Double.parseDouble(request.getParameter("amount"));

        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "Sandeep@77");

            // Check if the user has sufficient balance before processing the withdrawal
            PreparedStatement checkBalanceStatement = con.prepareStatement("SELECT balance FROM users WHERE userId = ?");
            checkBalanceStatement.setString(1, userId);
            ResultSet balanceResultSet = checkBalanceStatement.executeQuery();

            if (balanceResultSet.next()) {
                double currentBalance = balanceResultSet.getDouble("balance");
                if (currentBalance >= amountToWithdraw) {
                    // Sufficient balance, proceed with withdrawal
                    double updatedBalance = currentBalance - amountToWithdraw;

                    // Update the user's balance after withdrawal
                    PreparedStatement updateBalanceStatement = con
                            .prepareStatement("UPDATE users SET balance = ? WHERE userId = ?");
                    updateBalanceStatement.setDouble(1, updatedBalance);
                    updateBalanceStatement.setString(2, userId);
                    updateBalanceStatement.executeUpdate();

                    // Set the new balance in the session
                    request.getSession().setAttribute("balance", updatedBalance);

                    response.sendRedirect("balance.jsp");
                } else {
                    // Insufficient balance, redirect to a page with an error message
                    response.sendRedirect("withdraw.jsp?error=1");
                }
            } else {
                // User not found, redirect to an error page
                response.sendRedirect("error.jsp");
            }
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
