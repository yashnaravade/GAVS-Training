package Johny;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Home")
public class Home extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Home() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set the content type before writing to the response.
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Check if the request parameters are null to avoid NullPointerException.
        String user = request.getParameter("uname");
        String password = request.getParameter("pass");

        if (user != null && password != null && user.equals("root") && password.equals("Sandeep@77")) {
            out.println("Welcome " + user);
            Cookie cookie = new Cookie("user", user);
            response.addCookie(cookie);
            out.println("<a href='/SessionDemo/home.html'>Click to home page</a>");
        } else {
            // Handle the case when the user is not authenticated.
            out.println("Invalid credentials");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response); // Delegate POST requests to doGet
    }
}
