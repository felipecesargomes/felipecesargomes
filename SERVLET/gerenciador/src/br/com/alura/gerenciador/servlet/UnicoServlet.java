package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		if(acao.equals("novaEmpresa")) {
			NovaEmpresa novaEmpresa = new NovaEmpresa();
			novaEmpresa.executa(request, response);
		}else if(acao.equals("alteraEmpresa")) {
			AlteraEmpresa alteraEmpresa = new AlteraEmpresa();
			alteraEmpresa.executar(response, request);
		}else if(acao.equals("removeEmpresa")) {
			RemoveEmpresa removeEmpresa = new RemoveEmpresa();
			removeEmpresa.executar(request, response);
		}else if(acao.equals("exibeEmpresa")) {
			System.out.println("Alterando Empresa");
			MostraEmpresa mostraEmpresa = new MostraEmpresa();
			mostraEmpresa.executar(request, response);
		}else if(acao.equals("listaEmpresa")) {
			ListaEmpresas listaEmpresas = new ListaEmpresas();
			listaEmpresas.executar(request, response);
		}
		
	}

}
