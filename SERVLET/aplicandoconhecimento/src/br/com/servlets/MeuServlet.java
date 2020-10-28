package br.com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/meuservlet")
public class MeuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		Enumeration<String> cabecalhos = request.getHeaderNames();
		
		out.println("<h1>CABEÇALHO</h1>");
		
		while(cabecalhos.hasMoreElements()) {
			String str = cabecalhos.nextElement();
			out.println(str + ": " + request.getHeader(str) + "<br/><br/>");
		}
		
		String[] str = request.getParameterValues("linguagem");
		
		System.out.println(str.length);
		
		for (String string : str) {
			System.out.println(string);
			out.println("Teste" + string);
		}
		
		
	}

}