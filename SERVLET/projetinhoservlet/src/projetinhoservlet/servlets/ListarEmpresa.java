package projetinhoservlet.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projetinhoservlet.dao.EmpresaDao;
import projetinhoservlet.model.Empresa;

@WebServlet("/listaempresas")
public class ListarEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpresaDao eDao = new EmpresaDao();
		List<Empresa> lista = eDao.listarEmpresa();
		request.setAttribute("list", lista);
		RequestDispatcher rd = request.getRequestDispatcher("/listarempresas.jsp");
		rd.forward(request, response);
	}

}
