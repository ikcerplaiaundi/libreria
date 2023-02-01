package libreria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Conector {
	private static final String HOST = "localhost";
	private static final String BBDD = "primera";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	protected Connection con;
	public void Conectar() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://" + HOST + "/" + BBDD;
			con = DriverManager.getConnection(url, USERNAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void Cerrar() throws SQLException {
		con.close();
	}
	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}
	public Statement createStatement() throws SQLException {
		PreparedStatement preparedSt;
		preparedSt = con.prepareStatement("");
		return preparedSt;
	}
	
}
