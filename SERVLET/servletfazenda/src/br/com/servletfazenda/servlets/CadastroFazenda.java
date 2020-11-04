package br.com.servletfazenda.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.servletfazenda.dao.FazendaDao;
import br.com.servletfazenda.model.Fazenda;

/**
 * Servlet implementation class CadastroFazenda
 */
@WebServlet("/cadastrofazenda")
public class CadastroFazenda extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Fazenda f = new Fazenda();
		FazendaDao fDao = new FazendaDao();
		
		f.setId((int)Math.random());
		f.setNome(request.getParameter("nome"));
		f.setHectares(Double.parseDouble(request.getParameter("hectares")));
		
		fDao.cadastrarFazenda(f);
		
		RequestDispatcher rd = request.getRequestDispatcher("/cadastrado.jsp");
		request.setAttribute("nome", request.getParameter("nome"));
		rd.forward(request, response);
	}

}
