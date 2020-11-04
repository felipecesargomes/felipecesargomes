package br.com.servletfazenda.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.servletfazenda.model.Fazenda;

public class FazendaDao {

	private static List<Fazenda> lista = new ArrayList<Fazenda>();
	
	public void cadastrarFazenda(Fazenda f) {
		FazendaDao.lista.add(f);
	}
	
	public List<Fazenda> listarFazendas() {
		return FazendaDao.lista;
	}
	
}
