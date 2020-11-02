package br.com.calculadorasalario.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculosalario")
public class CalculadoraSalario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double salarioMinimo = Double.parseDouble(request.getParameter("salariominimo"));
		double salarioTotal = Double.parseDouble(request.getParameter("salariototal"));
		
		request.setAttribute("calc", new Integer((int) (salarioTotal/salarioMinimo)));
		System.out.println("teste");
		RequestDispatcher rd = request.getRequestDispatcher("./calculo.jsp");
		rd.forward(request, response);
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double salarioMinimo = Double.parseDouble(request.getParameter("salariominimo"));
		double salarioTotal = Double.parseDouble(request.getParameter("salariototal"));
		
		request.setAttribute("calc", (salarioTotal/salarioMinimo));
		
		RequestDispatcher rd = request.getRequestDispatcher("/calculo.jsp");
		rd.forward(request, response);
	}

}
