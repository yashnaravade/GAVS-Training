package webmvcdemo;
 
import org.apache.catalina.core.ApplicationServletRegistration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
 
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
 
@Configuration
public class DispatcherConfiguration implements WebApplicationInitializer{
 
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext ctx=new AnnotationConfigWebApplicationContext();
		ctx.register(SpringConfiguration.class);
		ServletRegistration.Dynamic register=servletContext.addServlet("ds",  new DispatcherServlet(ctx));
		register.setLoadOnStartup(1);
		register.addMapping("/");
		
	}
 
}