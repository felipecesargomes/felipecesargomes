package br.com.projetinhoservlet.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "webservlet", 
		 	urlPatterns = "/configparam",
		 	initParams = {
		@WebInitParam(name = "usuario", value="felipec"), @WebInitParam(name="senha", value="123") })
public class MeuServlet implements Servlet {

	@Override
	public void destroy() {
		System.out.println("Servlet Destruído");
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
		System.out.println("Servlet Iniciado: " + config.getInitParameter("usuario") + " senha: " + config.getInitParameter("senha"));
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}