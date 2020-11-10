package br.com.projetinhoservlet.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projetinhoservlets.dao.EmpresaDao;
import br.com.projetinhoservlets.model.Empresa;

@WebServlet("/cadastroempresa")
public class CadastroEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeEmpresa = request.getParameter("nome");
		String dataAbertura = request.getParameter("data");
		
		Empresa e = new Empresa();
		EmpresaDao eDao = new EmpresaDao();
			
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			e.setId((int)Math.random());
			e.setNome(nomeEmpresa);
			e.setDataAbertura(sdf.parse(dataAbertura));
			eDao.cadastroEmpresa(e);
			RequestDispatcher rd = request.getRequestDispatcher("/cadastrado.jsp");
			request.setAttribute("nome", nomeEmpresa);
			rd.forward(request, response);
		} catch (ParseException err) {
			// TODO Auto-generated catch block
			throw new ServletException();
		}
		
		
		
	}

}
