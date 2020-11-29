package org.sistemacurriculo.controlador;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Acao {

	String executar(HttpServletRequest request, HttpServletResponse response);
	
}
