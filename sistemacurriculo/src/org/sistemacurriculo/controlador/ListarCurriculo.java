package org.sistemacurriculo.controlador;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sistemacurriculo.dao.PessoaDao;

public class ListarCurriculo implements Acao {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) {
		PessoaDao pDao = new PessoaDao();
		request.setAttribute("listaPessoas", pDao.listarPessoas());
		return "foward:listarpessoas.jsp";
	}

	
	
}
