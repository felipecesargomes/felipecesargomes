package projetinhoservlet.dao;
import java.util.ArrayList;
import java.util.List;

import projetinhoservlet.model.Empresa;

public class EmpresaDao {

	private static List<Empresa> lista = new ArrayList<Empresa>();
	
	public void cadastrarEmpresa(Empresa e) {
		EmpresaDao.lista.add(e);
	}
	
	public List<Empresa> listarEmpresa() {
		return EmpresaDao.lista;
	}
	
}