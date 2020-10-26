package br.com.projetinhoservlet.servlets;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class myservlet implements Servlet {

	ServletConfig svC;
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return svC;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		svC = arg0;
		
		Enumeration<String> enum1 = svC.getInitParameterNames();
		
		while(enum1.hasMoreElements()) {
			String str = enum1.nextElement();
			System.out.println(str + ": " + getServletConfig().getInitParameter(str));
		}
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("SERVICE PARAMETER do web.xml: " +  getServletConfig().getServletContext().getInitParameter("parametrodaapp"));
		System.out.println("SETANDO PARAMETRO");
		getServletConfig().getServletContext().setAttribute("teste", "testado");
		
	}

}
