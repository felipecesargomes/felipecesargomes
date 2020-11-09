package projetinhoservlet.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projetinhoservlet.dao.MedicoDao;
import projetinhoservlet.model.Medico;

@WebServlet("/listmednome")
public class ListaMedicosNome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MedicoDao mDao = new MedicoDao();
		request.setAttribute("list", mDao.listarMedicoPorNome(request.getParameter("nome")));
		
		List<Medico> lista = mDao.listarMedicoPorNome(request.getParameter("nome"));
		
		for(Medico m : lista) {
			System.out.println(m.getNome());
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/listado.jsp");
		rd.forward(request, response);
	}


}
