package br.com.projetinhoservlets.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UtilConnection {

	private static Connection conn = null;
	
	static {
		abrirConexao();
	}

	public UtilConnection() {
		abrirConexao();
	}
	
	public static void abrirConexao() {
		try {
			if (conn == null) {
					Class.forName("org.postgresql.Driver");
					Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/teste", "postgres","root");
					System.out.println("Conexão feita com sucesso!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static Connection pegarConexao() {
		return conn;
	}

}