package projetinhoservlet.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projetinhoservlet.dao.MedicoDao;
import projetinhoservlet.model.Medico;

/**
 * Servlet implementation class ListaMedicos
 */
@WebServlet("/listarmedico")
public class ListaMedicos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MedicoDao mDao = new MedicoDao();
		List<Medico> lista = mDao.listarMedicos();
		request.setAttribute("lista", lista);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listamedico.jsp");
		rd.forward(request, response);
		
	}

}
