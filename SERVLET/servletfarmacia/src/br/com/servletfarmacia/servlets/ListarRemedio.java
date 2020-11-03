package br.com.servletfarmacia.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.servletfarmacia.dao.RemedioDao;
import br.com.servletfarmacia.model.Remedio;

@WebServlet("/listaremedio")
public class ListarRemedio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RemedioDao rDao = new RemedioDao();
		
		List<Remedio> lista = rDao.listarRemedio();
		
		request.setAttribute("listaR", lista);
		RequestDispatcher rd = request.getRequestDispatcher("/listaremedios.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}

}
