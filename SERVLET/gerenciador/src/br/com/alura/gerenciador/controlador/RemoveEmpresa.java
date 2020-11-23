package br.com.alura.gerenciador.controlador;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.model.Banco;

public class RemoveEmpresa implements Acao {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		System.out.println(id);

		Banco banco = new Banco();
		banco.removeEmpresa(id);

		return "redirect:entrada?acao=ListaEmpresas";
	}

}
