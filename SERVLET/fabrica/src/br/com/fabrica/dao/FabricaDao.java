package br.com.fabrica.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fabrica.model.Fabrica;

public class FabricaDao {

	private static List<Fabrica> lista = new ArrayList<Fabrica>();
	
	public void cadastrarFabrica(Fabrica e) {
		FabricaDao.lista.add(e);
	}
	
	public List<Fabrica> listarFabrica() {
		return FabricaDao.lista;
	}
	
}
