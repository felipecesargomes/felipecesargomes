package aula27.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="sver",urlPatterns = "/sv", initParams = {@WebInitParam(name="user",value="felipe"),@WebInitParam(name="senha",value="123")})
public class servlet12 implements Servlet {

	ServletConfig svlConfig;
	
	@Override
	public void destroy() {
		System.out.println("Destruíndo Servlet");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return svlConfig;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Iniciando Servlet");
		svlConfig = config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println(svlConfig.getServletContext().getInitParameter("userPadrao"));
		
		ServletContext sv1 = getServletConfig().getServletContext();
		
		System.out.println("Usuário massa 2: " + sv1.getAttribute("usuariomassa"));
	}

}
