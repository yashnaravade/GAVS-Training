# Servlet in Java

## What is Servlet?

Servlet is a Java program that runs inside a Java-capable HTTP server. It is used to generate dynamic web content on the server side. It is a server-side technology used for developing dynamic web applications. It is a Java class that is used to extend the capabilities of servers that host applications accessed by means of a request-response programming model. Although servlets can respond to any type of request, they are commonly used to extend the applications hosted by web servers.

## How Servlet Works?

Servlets are Java classes that are compiled to byte code that can be loaded dynamically into and run by a Java technology-enabled web server or application server. Servlets interact with web clients via a request/response paradigm implemented by the servlet container. A web client sends a request to a web server, and the servlet that can handle the request is chosen. The servlet receives the request through the HttpServletRequest interface. This interface extends the ServletRequest interface, which contains methods that allow the servlet to obtain information about the request, such as the protocol used by the client, the path to the requested file, the query string, and the content type of the request. The servlet can also obtain information about the client that sent the request, such as the IP address and hostname. The servlet can also obtain information about the client that sent the request, such as the IP address and hostname. The servlet can also obtain information about the client that sent the request, such as the IP address and hostname. The servlet can also obtain information about the client that sent the request, such as the IP address and hostname. The servlet can also obtain information about the client that sent the request, such as the IP address and hostname. The servlet can also obtain information about the client that sent the request, such as the IP address and hostname. The servlet can also obtain information about the client that sent the request, such as the IP address and hostname. The servlet can also obtain information about the client that sent the request, such as the IP address and hostname. The servlet can also obtain information about the client that sent the request, such as the IP address and hostname. The servlet can also obtain information about the client that sent the request, such as the IP address and hostname.

## Servlet Life Cycle

The servlet life cycle is the entire process from its creation till the destruction. The following are the paths of a servlet:

1. Servlet class is loaded.
2. Servlet instance is created.
3. init() method is invoked.
4. service() method is invoked.
5. destroy() method is invoked.
6. Servlet instance is garbage collected by the garbage collector.
7. Servlet class is unloaded.

# Example of Servlet

```java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    PrintWriter out = response.getWriter();
    out.println("Hello World");
  }
}
```

## Servlet API

The javax.servlet and javax.servlet.http packages provide interfaces and classes for writing our own servlets. The Servlet interface defines methods that all servlets must implement whereas the HttpServlet class provides methods, such as doGet() and doPost(), for handling HTTP-specific services.

## Servlet Interface

The javax.servlet package contains many interfaces and classes that are used by the servlet or web container. The Servlet interface provides methods that encapsulate the servlet's functionality. All servlets must implement the Servlet interface. The Servlet interface defines the three methods:

1. public void init(ServletConfig config) throws ServletException
2. public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
3. public void destroy()
4. public ServletConfig getServletConfig()
5. public String getServletInfo()
6. public String getServletName()
7. public ServletContext getServletContext()
8. public String getInitParameter(String name)
9. public Enumeration getInitParameterNames()
10. public void log(String msg)