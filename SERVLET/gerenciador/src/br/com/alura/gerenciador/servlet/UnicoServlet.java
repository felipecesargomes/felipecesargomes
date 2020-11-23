package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.controlador.Acao;
import br.com.alura.gerenciador.controlador.AlteraEmpresa;
import br.com.alura.gerenciador.controlador.ListaEmpresas;
import br.com.alura.gerenciador.controlador.MostraEmpresa;
import br.com.alura.gerenciador.controlador.NovaEmpresa;
import br.com.alura.gerenciador.controlador.RemoveEmpresa;

@WebServlet("/entrada")
public class UnicoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		String nome = null;
		
		try {
			String paramAcao = "br.com.alura.gerenciador.controlador." + acao;
			Class classe = Class.forName(paramAcao);
			Acao action = (Acao) classe.newInstance();
			nome = action.executar(request, response);
		} catch (Exception e) {
			throw new ServletException(e);
		}
		
		
//		if(acao.equals("novaEmpresa")) {
//			NovaEmpresa novaEmpresa = new NovaEmpresa();
//			nome = novaEmpresa.executa(request, response);
//		}else if(acao.equals("alteraEmpresa")) {
//			AlteraEmpresa alteraEmpresa = new AlteraEmpresa();
//			nome = alteraEmpresa.executar(response, request);
//		}else if(acao.equals("removeEmpresa")) {
//			RemoveEmpresa removeEmpresa = new RemoveEmpresa();
//			nome = removeEmpresa.executar(request, response);
//		}else if(acao.equals("exibeEmpresa")) {
//			System.out.println("Alterando Empresa");
//			MostraEmpresa mostraEmpresa = new MostraEmpresa();
//			nome = mostraEmpresa.executar(request, response);
//		}else if(acao.equals("listaEmpresas")) {
//			ListaEmpresas listaEmpresas = new ListaEmpresas();
//			nome = listaEmpresas.executar(request, response);
//		}
//		
		String[] tipoEndereco = nome.split(":");
		
		if(tipoEndereco[0].equals("redirect")) {
			response.sendRedirect(tipoEndereco[1]);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views" + tipoEndereco[1]);
			rd.forward(request, response);
		}
		
	}

}
