package bank;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String userId = (String) session.getAttribute("userId");

        if (userId != null) {
            // User is logged in, you can retrieve user account details from a database or data source
            // Example: double balance = getAccountBalance(userId);

            // You can set attributes in request or session for displaying data in the JSP
            // request.setAttribute("balance", balance);
            // session.setAttribute("balance", balance);

            // Forward to the home.jsp to display user account details
            request.getRequestDispatcher("home.jsp").forward(request, response);
        } else {
            // If user is not logged in, redirect to the login page or an error page
            response.sendRedirect("login.jsp");
        }
    }
}
