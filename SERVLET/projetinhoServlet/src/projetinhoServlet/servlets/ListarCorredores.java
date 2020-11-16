package projetinhoServlet.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projetinhoServlet.dao.CorredorDao;
import projetinhoServlet.model.Corredor;

@WebServlet("/listarcorredores")
public class ListarCorredores extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CorredorDao cDao = new CorredorDao();
		
		List<Corredor> lista = cDao.listarCorredor();
		
		request.setAttribute("lista", lista);
		RequestDispatcher rd = request.getRequestDispatcher("listarcorredores.jsp");
		rd.forward(request, response);
		
	}

}