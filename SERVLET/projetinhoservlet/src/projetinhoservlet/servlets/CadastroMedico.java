package projetinhoservlet.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projetinhoservlet.dao.MedicoDao;
import projetinhoservlet.model.Medico;

@WebServlet("/cadastromedico")
public class CadastroMedico extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Medico m = new Medico();
		MedicoDao mDao = new MedicoDao();

		m.setId((int) Math.random());
		m.setNome(request.getParameter("nome"));
		m.setIdade(Integer.parseInt(request.getParameter("idade")));
		
		mDao.cadastroMedico(m);
		
		RequestDispatcher rd = request.getRequestDispatcher("/cadastrado.jsp");
		request.setAttribute("nome", m.getNome());
		rd.forward(request, response);

	}

}
