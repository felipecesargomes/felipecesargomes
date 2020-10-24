package aula27.servlets;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="sv",urlPatterns = "/p", initParams = {@WebInitParam(name="usuario",value="teste"),@WebInitParam(name="senha",value="123")})
public class servve implements Servlet {

	ServletConfig clf;
	
	@Override
	public void destroy() {
		System.out.println("Destruíndo Servlet");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Iniciando Servlet");
		
		clf = config;
		
		Enumeration<String> so = config.getInitParameterNames();
		
		while(so.hasMoreElements()) {
			String str = so.nextElement();
			System.out.println(str + ": " + config.getInitParameter(str));
		}
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		ServletContext svContext = clf.getServletContext();
		
		System.out.println("SERVICE: " + clf.getInitParameter("usuario"));
		System.out.println("Servlet 2: " + clf.getServletContext().getInitParameter("userPadrao"));
		
		svContext.setAttribute("usuariomassa", "orbe");
		
	}

}