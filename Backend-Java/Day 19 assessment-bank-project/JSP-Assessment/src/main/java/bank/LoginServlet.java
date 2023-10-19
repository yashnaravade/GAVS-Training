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

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Bank";
            String dbUser = "root";
            String dbPassword = "Sandeep@77";

            try (Connection con = DriverManager.getConnection(url, dbUser, dbPassword)) {
                System.out.println("Connection Established...");

                String sql = "SELECT * FROM users WHERE userId = ? AND password = ?";
                try (PreparedStatement statement = con.prepareStatement(sql)) {
                    statement.setString(1, userId);
                    statement.setString(2, password);

                    try (ResultSet resultSet = statement.executeQuery()) {
                        if (resultSet.next()) {
                            
                            request.getSession().setAttribute("userId", userId);
                            response.sendRedirect("home.jsp");
                        } else {
                          
                            response.sendRedirect("login.jsp?error=1");
                        }
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
           
            e.printStackTrace(); 
            response.sendRedirect("error.jsp");
        }
    }
}
