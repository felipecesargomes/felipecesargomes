package org.sistemacurriculo.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;

import org.sistemacurriculo.model.Pessoa;
import org.sistemacurriculo.util.FactorySeasson;

public class PessoaDao {

	Connection conn = FactorySeasson.pegarConexao();
	
	public void cadastrarPessoa(Pessoa p) {
		try {
			System.out.println(p.getData());
			String inserirPessoa = "INSERT INTO T_PESSOA (NOME,STATUS,DATA_NASCIMENTO) VALUES (?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(inserirPessoa);
			stmt.setString(1, p.getNome());
			stmt.setString(2, p.getStatus());
			System.out.println(java.sql.Date.valueOf(p.getData().toString()));
			stmt.setDate(3, java.sql.Date.valueOf(p.getData().toString()));
			stmt.execute();
			conn.commit();
			System.out.println("cadastrado com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
