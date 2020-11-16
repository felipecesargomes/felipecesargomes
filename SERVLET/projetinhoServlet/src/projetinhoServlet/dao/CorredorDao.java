package projetinhoServlet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import projetinhoServlet.model.Corredor;
import projetinhoServlet.util.ConexaoUtil;

public class CorredorDao {

	private Connection conexao;
	
	public CorredorDao() {
		conexao = ConexaoUtil.pegarConexao();
	}
	
	public void cadastrarCorredor(Corredor c) {
		try {
			String inserirCorredor = "INSERT INTO T_CORREDOR (nome,distancia) VALUES (?,?)";
			PreparedStatement stmt = conexao.prepareStatement(inserirCorredor);
			stmt.setString(1, c.getNome());
			stmt.setDouble(2, c.getDistancia());
			stmt.execute();
			conexao.commit();
			System.out.println("adicionado");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public List<Corredor> listarCorredor() {
		List<Corredor> corredorLista = new ArrayList<Corredor>();
		String listarCorredores = "SELECT * FROM T_CORREDOR";
		try {
			PreparedStatement stmt = conexao.prepareStatement(listarCorredores);
			ResultSet rs = stmt.executeQuery();
			while(rs.next() == true) {
				Corredor cr = new Corredor();
				cr.setId(rs.getLong("id"));
				cr.setNome(rs.getString("nome"));
				cr.setDistancia(rs.getDouble("distancia"));
				corredorLista.add(cr);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return corredorLista;
	}

}
