package libreria;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GestorBBDD extends Conector{
public void insertarLibros(Libro libro) throws SQLException {
	try {
	PreparedStatement preparedSt;
	
	preparedSt = con.prepareStatement(
	"INSERT INTO `libros`(`id`, `titulo`, `autor`, `num_pag`) VALUES (?,?,?,?)");
	
	preparedSt.setString(2, libro.getTitulo());
	preparedSt.setString(3, libro.getAutor());
	preparedSt.setInt(4, libro.getNum_pag());
	

	preparedSt.execute();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
public void eliminarLibro(int id) {
	try {
		
		Statement st = con.createStatement();
		String sentDELETE = "DELETE FROM `libros` id ='" + id + "'";
		st.executeUpdate(sentDELETE);

	} catch (SQLException e) {
		e.printStackTrace();
	}
}
public Libro getLibro(int id) throws SQLException {
	Libro libro= new Libro();
	Statement st = con.createStatement();
	String sentSELECT = "SELECT `id`, `titulo`, `autor`, `num_pag` FROM `libros` WHERE"+id;
	ResultSet resultado = st.executeQuery(sentSELECT);
	libro.setId_libro(resultado.getInt(1));
	libro.setTitulo(resultado.getString(2));
	libro.setAutor(resultado.getString(3));
	libro.setNum_pag(resultado.getInt(4));
	return libro;
}
public ArrayList<Libro> descargarlibros(){
	ArrayList<Libro> DATA=new ArrayList<Libro>();
	Statement st = con.createStatement();
	String sentSELECT = "SELECT * FROM libros WHERE 1";
	ResultSet resultado = st.executeQuery(sentSELECT);
	try {
		while (resultado.next()) {
			
			
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	return null;
	}
}
