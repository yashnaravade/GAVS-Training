# Here is a simple servlet project

## 1. Create a new project

- File -> New -> Dynamic Web Project -> Next
- Project name: `simple-servlet-project`
- Target runtime: `Apache Tomcat v9.0`
- Dynamic web module version: `4.0`
- Configuration: `Default configuration`
- Content directory: `WebContent`
- Generate web.xml deployment descriptor: `unchecked`
- Finish
- Right click on the project -> Properties -> Project Facets -> Java: `1.8`
- Apply and Close
- Right click on the project -> Properties -> Java Build Path -> Libraries -> Add Library -> Server Runtime -> Apache Tomcat v9.0 -> Finish -> Apply and Close
- Right click on the project -> Properties -> Java Build Path -> Libraries -> Add Library -> JRE System Library -> Alternate JRE: `JavaSE-1.8` -> Finish -> Apply and Close
- Right click on the project -> Properties -> Java Compiler -> JDK Compliance -> Compiler compliance level: `1.8` -> Apply and Close
- Right click on the project -> Properties -> Java Compiler -> Errors/Warnings -> Deprecated and restricted API -> Forbidden reference (access rules): `Warning` -> Apply and Close

## 2. Create a new servlet

- Right click on the project -> New -> Servlet -> Next
- Class name: `HelloWorld`
- Package: `com.example`
- Superclass: `javax.servlet.http.HttpServlet`
- Finish

## 3. Add the servlet to the deployment descriptor

- Open `WebContent/WEB-INF/web.xml`
- Add the following code to the `web.xml` file

```xml

<?xml version="1.0" encoding="UTF-8"?>

```

- Add the following code to the `web.xml` file
- The `<servlet>` tag defines the servlet name and the servlet class
- The `<servlet-mapping>` tag defines the servlet name and the URL pattern

```xml

<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns="http://xmlns.jcp.org/xml/ns/javaee"
    xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
    http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
    id="WebApp_ID" version="4.0">

    <servlet>
        <servlet-name>HelloWorld</servlet-name>
        <servlet-class>com.example.HelloWorld</servlet-class>
    </servlet>

    <servlet-mapping>
        <servlet-name>HelloWorld</servlet-name>
        <url-pattern>/hello</url-pattern>
    </servlet-mapping>

</web-app>

```

## 4. Add the servlet code

- Open `src/com/example/HelloWorld.java`
- Add the following code to the `HelloWorld.java` file
- The `doGet()` method is called when a GET request is sent to the servlet
- The `doPost()` method is called when a POST request is sent to the servlet

```java

package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public HelloWorld() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Hello World");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}

```

## 5. Run the project

- Right click on the project -> Run As -> Run on Server -> Next
- Select `Tomcat v9.0 Server at localhost`
- Check `Always use this server when running this project`
- Finish
- The project will be opened in the browser

## 6. Test the servlet

- Open `http://localhost:8080/simple-servlet-project/hello` in the browser
- `http://localhost:8080` is the default URL for Tomcat
- `simple-servlet-project` is the project name
- `hello` is the URL pattern defined in the `web.xml` file
- The servlet will be executed and the output will be displayed in the browser
- The output will be `Hello World`
- The output will be displayed in the console
- The output will be displayed in the `catalina.out` file
- The `catalina.out` file is located in the `logs` directory of the Tomcat installation directory.

## 7. Stop the server

- Right click on the server -> Stop
- The server will be stopped

## 8. Restart the server

- Right click on the server -> Start
- The server will be started
- The project will be opened in the browser

## Conclusion

In this tutorial, we have learned how to create a simple servlet project in Eclipse IDE. We have also learned how to run the project on the Tomcat server and how to test the servlet. 

## Source Files

The source files for the examples in this tutorial are available at [

## References

- [https://www.javatpoint.com/servlet-tutorial](https://www.javatpoint.com/servlet-tutorial)
- [https://www.tutorialspoint.com/servlets/index.htm](https://www.tutorialspoint.com/servlets/index.htm)
- [https://www.javatpoint.com/servlet-http-session-tracking-example](https://www.javatpoint.com/servlet-http-session-tracking-example)
- [https://www.javatpoint.com/servlet-http-session-listener-example](https://www.javatpoint.com/servlet-http-session-listener-example)