package br.com.servletfarmacia.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.servletfarmacia.dao.RemedioDao;
import br.com.servletfarmacia.model.Remedio;

@WebServlet("/cadastroremedio")
public class CadastroRemedio extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Remedio r = new Remedio();
		RemedioDao rDao = new RemedioDao();
		
		r.setId(2);
		r.setNome(request.getParameter("nome"));
		r.setValor(Double.parseDouble(request.getParameter("preco")));
		
		rDao.cadastroRemedio(r);
		
		RequestDispatcher rd = request.getRequestDispatcher("/cadastrofeito.jsp");
		request.setAttribute("nome", request.getParameter("nome"));
		rd.forward(request, response);
		
	}

}
