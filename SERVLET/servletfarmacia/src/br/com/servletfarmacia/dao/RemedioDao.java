package br.com.servletfarmacia.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.servletfarmacia.model.Remedio;

public class RemedioDao {

	private static ArrayList<Remedio> listaRemedio = new ArrayList<Remedio>();
	
	public void cadastroRemedio(Remedio r) {
		System.out.println("adicionado: " + r.getNome());
		RemedioDao.listaRemedio.add(r);
	}
	
	public List<Remedio> listarRemedio() {
		return RemedioDao.listaRemedio;
	}
	
}
