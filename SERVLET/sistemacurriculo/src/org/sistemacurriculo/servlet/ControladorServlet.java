package org.sistemacurriculo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/entrada")
public class ControladorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		
		try {
			String sClasse = "org.sistemacurriculo.controlador." + acao;
			Class classe = Class.forName(sClasse);
			//classe.newInstance();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
