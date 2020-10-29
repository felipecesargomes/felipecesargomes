package calculoipi.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ipiservlet")
public class IpiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		double porcentagem = Double.parseDouble(request.getParameter("porcentagem"));
		double vlr1 = Double.parseDouble(request.getParameter("valor1").replace(",", "."));
		double vlr2 = Double.parseDouble(request.getParameter("valor2").replace(",", "."));
		double qtd1 = Double.parseDouble(request.getParameter("qtd1"));
		double qtd2 = Double.parseDouble(request.getParameter("qtd2"));
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("O Resultado é: " + (vlr1*qtd1 + vlr2*qtd2)*(porcentagem/100+1));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double porcentagem = Double.parseDouble(request.getParameter("porcentagem"));
		int cod1 = Integer.parseInt(request.getParameter("cod1"));
		int cod2 = Integer.parseInt(request.getParameter("cod2"));
		double vlr1 = Double.parseDouble(request.getParameter("vlr1"));
		double vlr2 = Double.parseDouble(request.getParameter("vlr2"));
		double qtd1 = Double.parseDouble(request.getParameter("qtd1"));
		double qtd2 = Double.parseDouble(request.getParameter("qtd2"));
		double valorTotal = (vlr1*qtd1 + vlr2*qtd2)*(porcentagem/100+1);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("O Resultado é: " + valorTotal);
	}

}