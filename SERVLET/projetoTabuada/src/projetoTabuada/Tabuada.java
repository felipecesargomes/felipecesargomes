package projetoTabuada;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="tabuada", urlPatterns = "/tabuada")
public class Tabuada implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		
		pw.println("<h1>Seja Bem Vindo a Tabuada de " + req.getParameter("valor") + "</h1>");
		
		for(int i=0;i<=10;i++) {
			pw.println("<br>" + req.getParameter("valor") + " X " + i + " = " + (Integer.parseInt(req.getParameter("valor"))*i));
		}
		
	}

}
