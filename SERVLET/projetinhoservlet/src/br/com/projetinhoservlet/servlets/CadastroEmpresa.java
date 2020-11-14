package br.com.projetinhoservlet.servlets;

import java.io.IOException;

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
		int id = Integer.parseInt(request.getParameter("id"));
		String nome = request.getParameter("nome");
		
		Empresa emp = new Empresa();
		emp.setId(id);
		emp.setNome(nome);
		EmpresaDao empDao = new EmpresaDao();
		
		empDao.cadastrarEmpresa(emp);
		
		
	}

}
