package br.com.projetinhoservlets.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.projetinhoservlets.model.Empresa;
import br.com.projetinhoservlets.util.UtilConnection;

public class EmpresaDao {
	
	public void cadastrarEmpresa(Empresa e) {
		Connection c = null;
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/teste", "postgres","root");
			System.out.println("conexao com sucesso!");
			c.setAutoCommit(true);
		} catch (SQLException | ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			String sqlt = "INSERT INTO T_TESTE (id,nome) VALUES (?,?)";
			PreparedStatement stmt = c.prepareStatement(sqlt);
			stmt.setInt(1, (int) e.getId());
			stmt.setString(2, e.getNome());
			stmt.execute();
			System.out.println("insert ocorreu!");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}