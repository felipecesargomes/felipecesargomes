package br.com.svlt.sevlets;
import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="svt",urlPatterns ="/se",initParams = {@WebInitParam(name="user",value = "felipec"),@WebInitParam(name="senha",value="123"),@WebInitParam(name="localizacao",value="21312.231")})
public class mysvlt implements Servlet {

	@Override
	public void destroy() {
		System.out.println("Servlet destruído");
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
		System.out.println("Servlet iniciado");
		
		Enumeration<String> enumlist = config.getInitParameterNames();
		
		while(enumlist.hasMoreElements()) {
			String p = enumlist.nextElement();
			System.out.println(p + ": " + config.getInitParameter(p));
		}
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
