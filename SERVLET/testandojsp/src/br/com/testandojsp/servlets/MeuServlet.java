package br.com.testandojsp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.testandojsp.dao.CarroDAO;
import br.com.testandojsp.model.Carro;

@WebServlet("/meuservlet")
public class MeuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Carro car = new Carro();
		car.setId(1);
		car.setNome(request.getParameter("nome"));
		car.setMarca(request.getParameter("ferrari"));
		
		CarroDAO carDAO = new CarroDAO();
		
		carDAO.adiciona(car);
				
		RequestDispatcher rd = request.getRequestDispatcher("./servico.jsp");
		request.setAttribute("carro", car.getNome());
		rd.forward(request, response);
		
		
		
	}

}