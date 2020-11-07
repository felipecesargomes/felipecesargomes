package br.com.fabrica.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fabrica.dao.FabricaDao;
import br.com.fabrica.model.Fabrica;

@WebServlet("/fabricaservlet")
public class FabricaServlet extends HttpServlet {
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Fabrica f = new Fabrica();
		f.setId((int)Math.random());
		f.setNome(req.getParameter("nome"));
		f.setLocal(req.getParameter("local"));
		FabricaDao fDao = new FabricaDao();
		fDao.cadastrarFabrica(f);
		
		RequestDispatcher rd = req.getRequestDispatcher("/cadastrado.jsp");
		req.setAttribute("nome", f.getNome());
		rd.forward(req, resp);
		
	}
}
