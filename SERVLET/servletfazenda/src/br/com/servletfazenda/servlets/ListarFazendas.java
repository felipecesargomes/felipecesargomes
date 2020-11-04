package br.com.servletfazenda.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.servletfazenda.dao.FazendaDao;
import br.com.servletfazenda.model.Fazenda;

/**
 * Servlet implementation class ListarFazendas
 */
@WebServlet("/listarfazendas")
public class ListarFazendas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FazendaDao fDao = new FazendaDao();
		List<Fazenda> lista = fDao.listarFazendas();
		
		RequestDispatcher rd = request.getRequestDispatcher("/listarfazendas.jsp");
		request.setAttribute("listaF", lista);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
