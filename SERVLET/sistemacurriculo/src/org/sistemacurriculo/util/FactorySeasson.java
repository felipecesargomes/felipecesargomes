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
				conn = DriverManager.getConnection(url, user, password);
				System.out.println("Conexão realizada com sucesso!");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;
	}
	
}
