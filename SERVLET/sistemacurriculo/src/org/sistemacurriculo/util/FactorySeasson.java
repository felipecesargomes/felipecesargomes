package org.sistemacurriculo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactorySeasson {

	static String user = "postgres";
	static String password = "root";
	static String url = "jdbc:postgresql://localhost:5432/curriculo_base";
	static Connection conn = null;
	
	FactorySeasson() {
		pegarConexao();
	}
	
	public static Connection pegarConexao() {
		if(conn==null) {
			try {
				Class.forName("org.postgresql.Driver");
				conn = DriverManager.getConnection(url, user, password);
				System.out.println("Conexão realizada com sucesso!");
				conn.setAutoCommit(false);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;
	}
	
}
