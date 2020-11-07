package br.com.fabrica.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fabrica.dao.FabricaDao;

@WebServlet("/listarfabricas")
public class ListarFabricas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FabricaDao fDao = new FabricaDao();
		
		RequestDispatcher rd = request.getRequestDispatcher("/listarfabricas.jsp");
		request.setAttribute("lista", fDao.listarFabrica());
		rd.forward(request, response);
		
	}

}
