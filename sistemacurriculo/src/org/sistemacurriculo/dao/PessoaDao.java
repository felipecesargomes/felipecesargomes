package org.sistemacurriculo.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.sistemacurriculo.model.Pessoa;
import org.sistemacurriculo.util.FactorySeasson;

public class PessoaDao {

	Connection conn = FactorySeasson.pegarConexao();
	
	public void cadastrarPessoa(Pessoa p) {
		try {
			String queryInserirPessoa = "INSERT INTO T_PESSOA (NOME,STATUS,DATA_NASCIMENTO) VALUES (?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(queryInserirPessoa);
			stmt.setString(1, p.getNome());
			stmt.setString(2, p.getStatus());
			stmt.setDate(3, new java.sql.Date(p.getData().getTime()));
			stmt.execute();
			conn.commit();
			System.out.println("cadastrado com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public List<Pessoa> listarPessoas() {
		List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
		try {
			String queryListarPessoa = "SELECT * FROM T_PESSOA";
			PreparedStatement stmt = conn.prepareStatement(queryListarPessoa);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Pessoa p = new Pessoa();
				p.setId(rs.getLong("id_pessoa"));
				p.setNome(rs.getString("nome"));
				p.setStatus(rs.getString("status"));
				p.setData(rs.getDate("data_nascimento"));
				System.out.println(p.getNome());
				listaPessoa.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaPessoa;
	}
}
