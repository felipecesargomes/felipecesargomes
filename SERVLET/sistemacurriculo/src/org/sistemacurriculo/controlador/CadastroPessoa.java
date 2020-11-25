package org.sistemacurriculo.controlador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sistemacurriculo.dao.PessoaDao;
import org.sistemacurriculo.model.Pessoa;

public class CadastroPessoa implements Acao {
	public String executar(HttpServletRequest request, HttpServletResponse response) {
		
		
		String nome = request.getParameter("nome");
		String status = request.getParameter("status");
		String data = request.getParameter("data");
		Date dataNascimentoPessoa = null;
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataNascimentoPessoa = sdf.parse(data).getTime();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		Pessoa pessoa = new Pessoa();
		PessoaDao pDao = new PessoaDao();
		pessoa.setNome(nome);
		pessoa.setStatus(status);
		pessoa.setData(dataNascimentoPessoa);
		pDao.cadastrarPessoa(pessoa);
		
		return "redirect:entrada?acao=teste";
		
	}
}
