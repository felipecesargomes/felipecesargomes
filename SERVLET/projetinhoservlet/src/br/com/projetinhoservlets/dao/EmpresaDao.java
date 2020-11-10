package br.com.projetinhoservlets.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.projetinhoservlets.model.Empresa;

public class EmpresaDao {

	private static List<Empresa> lista = new ArrayList<Empresa>();
	
	public void cadastroEmpresa(Empresa e) {
		EmpresaDao.lista.add(e);
	}
	
	public List<Empresa> listaEmpresa() {
		return EmpresaDao.lista;
	}
	
	
}
