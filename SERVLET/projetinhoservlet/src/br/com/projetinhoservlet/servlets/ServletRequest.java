package br.com.projetinhoservlet.servlets;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="servletrequest",urlPatterns = "/svtreq")
public class ServletRequest implements Servlet {

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
	public void service(javax.servlet.ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Porta: " + req.getServerPort());
		System.out.println("Nome: " + req.getServerName());
		System.out.println("Protocolo: " + req.getProtocol());
		System.out.println("Encoding: " + req.getCharacterEncoding());
		System.out.println("Content Type: " + req.getContentType());
		System.out.println("Content Length: " + req.getContentLength());
		System.out.println("Remote Address: " + req.getRemoteAddr());
		System.out.println("Remote Host: " + req.getRemoteHost());
		System.out.println("Scheme: " + req.getScheme());
		
				
		Enumeration enum1 = req.getParameterNames();
		
		while(enum1.hasMoreElements()) {
			String str = (String) enum1.nextElement();
			System.out.println(str + ": " + req.getParameter(str));
		}
	}

}
