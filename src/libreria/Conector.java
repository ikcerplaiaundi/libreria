package libreria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
	protected Connection con;
	public void Conectar() {
		try {
			Class.forName("con.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/biblioteca";
			con = (Connection) DriverManager.getConnection(url,"root","");
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
	
}