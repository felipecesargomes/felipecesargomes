package br.com.alura.gerenciador.controlador;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.model.Banco;
import br.com.alura.gerenciador.model.Empresa;

public class MostraEmpresa {

	public String executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		System.out.println(id);

		Banco banco = new Banco();

		Empresa empresa = banco.buscaEmpresaPelaId(id);

		System.out.println(empresa.getNome());

		request.setAttribute("empresa", empresa);

		return "foward:/formAlteraEmpresa.jsp";
	}
}