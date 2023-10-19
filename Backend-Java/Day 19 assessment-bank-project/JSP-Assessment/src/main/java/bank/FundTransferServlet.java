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

@WebServlet("/FundTransferServlet")
public class FundTransferServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public FundTransferServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String senderUserId = request.getParameter("senderUserId");
        String receiverUserId = request.getParameter("receiverUserId");
        double amountToTransfer = Double.parseDouble(request.getParameter("amount"));

        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "Sandeep@77");

            // Check if the sender has sufficient balance before processing the transfer
            double senderBalance = getBalance(senderUserId, con);

            if (senderBalance >= amountToTransfer) {
                // Sufficient balance, proceed with the transfer
                double receiverBalance = getBalance(receiverUserId, con);

                // Update the sender's balance after the transfer
                updateBalance(senderUserId, con, senderBalance - amountToTransfer);

                // Update the receiver's balance after the transfer
                updateBalance(receiverUserId, con, receiverBalance + amountToTransfer);

                // Set the new balance in the session for both sender and receiver
                request.getSession().setAttribute("balance", senderBalance - amountToTransfer);
                request.getSession().setAttribute("receiverBalance", receiverBalance + amountToTransfer);

                response.sendRedirect("balance.jsp");
            } else {
                // Insufficient balance, redirect to a page with an error message
                response.sendRedirect("fundTransfer.jsp?error=1");
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

    private double getBalance(String userId, Connection connection) throws SQLException {
        PreparedStatement checkBalanceStatement = connection.prepareStatement("SELECT balance FROM users WHERE userId = ?");
        checkBalanceStatement.setString(1, userId);
        ResultSet balanceResultSet = checkBalanceStatement.executeQuery();

        if (balanceResultSet.next()) {
            return balanceResultSet.getDouble("balance");
        }

        return 0; // Return a default balance if no record found (you can adjust this as needed)
    }

    private void updateBalance(String userId, Connection connection, double updatedBalance) throws SQLException {
        PreparedStatement updateBalanceStatement = connection.prepareStatement("UPDATE users SET balance = ? WHERE userId = ?");
        updateBalanceStatement.setDouble(1, updatedBalance);
        updateBalanceStatement.setString(2, userId);
        updateBalanceStatement.executeUpdate();
    }
}
