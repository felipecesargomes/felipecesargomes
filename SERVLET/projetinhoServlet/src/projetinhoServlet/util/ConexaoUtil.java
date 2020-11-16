package projetinhoServlet.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoUtil {

	private static Connection conn = null;
	private static String url = "jdbc:postgresql://localhost:5432/base_teste?autoReconnect=true";
	private static String user = "postgres";
	private static String password = "root";

	static {
		abrirConexao();
	}

	public ConexaoUtil() {
		abrirConexao();
	}

	private static void abrirConexao() {
		if (conn == null) {
			try {
				Class.forName("org.postgresql.Driver");
				conn = DriverManager.getConnection(url, user, password);
				System.out.println("conexao criada!");
				conn.setAutoCommit(false);
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static Connection pegarConexao() {
		return conn;
	}

}
