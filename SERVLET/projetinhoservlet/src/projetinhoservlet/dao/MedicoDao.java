package projetinhoservlet.dao;

import java.util.ArrayList;
import java.util.List;

import projetinhoservlet.model.Medico;

public class MedicoDao {

	private static List<Medico> lista = new ArrayList<Medico>();
	
	public void cadastroMedico(Medico m) {
		lista.add(m);
	}
	
	public List<Medico> listarMedicos() {
		return MedicoDao.lista;
	}
	
	public List<Medico> listarMedicoPorNome(String nome) {	
		List<Medico> listNome = new ArrayList<Medico>();
		for(Medico m : MedicoDao.lista) {
			if(m.getNome().equals(nome)) {
				listNome.add(m);
				System.out.println("Igual");
			}else {
				System.out.println("Diferente");
			}
		}
		return listNome;
	}
}
