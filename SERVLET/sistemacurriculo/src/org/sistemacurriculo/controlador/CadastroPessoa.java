package org.sistemacurriculo.controlador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sistemacurriculo.model.Pessoa;

public class CadastroPessoa {
	public String executar(HttpServletRequest request, HttpServletResponse response) {
		
		String nome = request.getParameter("nome");
		String status = request.getParameter("status");
		String data = request.getParameter("data");
		Date dataNascimentoPessoa = null;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			dataNascimentoPessoa = sdf.parse(data);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setStatus(status);
		pessoa.setData(dataNascimentoPessoa);
		
		
		
	}
}
