package org.sistemacurriculo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sistemacurriculo.controlador.Acao;

@WebServlet("/entrada")
public class ControladorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		System.out.println(acao);
		String name = null;
		
		try {
			String sClasse = "org.sistemacurriculo.controlador." + acao;
			Class classe = Class.forName(sClasse);
			Acao action = (Acao) classe.newInstance();
			name = action.executar(request,response);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println(acao);
		System.out.println(name);
		String[] splitLink = name.split(":");
		if(splitLink[0].equals("redirect")) {
			response.sendRedirect(splitLink[1]);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/" + splitLink[1]);
			rd.forward(request, response);
		}
	}

}