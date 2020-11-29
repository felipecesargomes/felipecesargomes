package org.sistemacurriculo.controlador;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CriarPessoa implements Acao {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) {
		return "foward:criarpessoa.jsp";
	}

}
