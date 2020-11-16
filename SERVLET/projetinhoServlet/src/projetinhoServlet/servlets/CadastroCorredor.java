package projetinhoServlet.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projetinhoServlet.dao.CorredorDao;
import projetinhoServlet.model.Corredor;

@WebServlet("/cadastrocorredor")
public class CadastroCorredor extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		double distancia = Double.parseDouble(request.getParameter("distancia"));
		
		Corredor c = new Corredor();
		CorredorDao cDao = new CorredorDao();
				
		c.setId(1L);
		c.setNome(nome);
		c.setDistancia(distancia);
		
		cDao.cadastrarCorredor(c);
		
		request.setAttribute("nome", nome);
		response.sendRedirect("cadastrado.jsp");
	}

}