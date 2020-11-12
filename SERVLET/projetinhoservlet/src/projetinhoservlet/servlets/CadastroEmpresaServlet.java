package projetinhoservlet.servlets;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import projetinhoservlet.dao.EmpresaDao;
import projetinhoservlet.model.Empresa;

@WebServlet("/cadastroempresa")
public class CadastroEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Empresa e = new Empresa();
		EmpresaDao eDao = new EmpresaDao();
		
		e.setId((int)Math.random());
		e.setNome(request.getParameter("nome"));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			e.setDataAbertura(sdf.parse(request.getParameter("dataAbertura")));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			throw new ServletException();
		}
		
		
		
		eDao.cadastrarEmpresa(e);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaempresas");
		request.setAttribute("nome", e.getNome());
		rd.forward(request, response);
		
	}

}
