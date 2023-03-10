package libreria;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;

public class GestorBBDD extends Conector{
	//libro
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
		String sentDELETE = "DELETE FROM `libros` WHERE id_libro ='" + id + "'";
		st.executeUpdate(sentDELETE);

	} catch (SQLException e) {
		e.printStackTrace();
	}
}
public Libro getLibro(int id) throws SQLException {
	Libro libro= new Libro();
	Statement st = con.createStatement();
	String sentSELECT = "SELECT `id`, `titulo`, `autor`, `num_pag` FROM `libros` WHERE id_libro="+id;
	ResultSet resultado = st.executeQuery(sentSELECT);
	libro.setId_libro(resultado.getInt(1));
	libro.setTitulo(resultado.getString(2));
	libro.setAutor(resultado.getString(3));
	libro.setNum_pag(resultado.getInt(4));
	return libro;
}
public ArrayList<Libro> descargarlibros() throws SQLException{
	ArrayList<Libro> DATA=new ArrayList<Libro>();
	try {
	
	Statement st = con.createStatement();
	String sentSELECT = "SELECT * FROM libros WHERE 1";
	ResultSet resultado = st.executeQuery(sentSELECT);
	
		while (resultado.next()) {
			Libro libro = new Libro();
			libro.setId_libro(resultado.getInt(1));
			libro.setTitulo(resultado.getString(2));
			libro.setAutor(resultado.getString(3));
			libro.setNum_pag(resultado.getInt(4));
			DATA.add(libro);
		}
	} catch (Exception e) {
		System.out.println("descarga fallida");
	}
	
	return DATA;
	}
	//socios
public void insertarSocio(Socio socio) throws SQLException {
	try {
	PreparedStatement preparedSt;
	
	preparedSt = con.prepareStatement(
	"INSERT INTO `socios`( `nombre`, `apellido`, `direccion`, `poblacion`, `provincia`, `dni`) VALUES (?,?,?,?,?,?)");
	
	preparedSt.setString(1, socio.getNombre());
	preparedSt.setString(2, socio.getApellido());
	preparedSt.setString(3, socio.getDireccion());
	preparedSt.setString(4, socio.getPoblacion());
	preparedSt.setString(5, socio.getProvincia());
	preparedSt.setString(6, socio.getDni());
	
	

	preparedSt.execute();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
public void eliminarSocio(int id) {
	try {
		
		Statement st = con.createStatement();
		String sentDELETE = "DELETE FROM `socios` WHERE id_socio ='" + id + "'";
		st.executeUpdate(sentDELETE);

	} catch (SQLException e) {
		e.printStackTrace();
	}
}
public Socio getSocio(int id) throws SQLException {
	Socio socio= new Socio();
	Statement st = con.createStatement();
	String sentSELECT = "SELECT `id`, `nombre`, `apellido`, `direccion`, `poblacion`, `provincia`, `dni` FROM `socios` WHERE id_socio="+id;
	ResultSet resultado = st.executeQuery(sentSELECT);
	socio.setId_socio(resultado.getInt(1));
	socio.setNombre(resultado.getString(2));
	socio.setApellido(resultado.getString(3));
	socio.setDireccion(resultado.getString(4));
	socio.setPoblacion(resultado.getString(5));
	socio.setProvincia(resultado.getString(6));
	socio.setDni(resultado.getString(6));
	return socio;
}
public ArrayList<Socio> descargarSocios() throws SQLException{
	ArrayList<Socio> DATA=new ArrayList<Socio>();
	try {
	
	Statement st = con.createStatement();
	String sentSELECT = "SELECT * FROM socios WHERE 1";
	ResultSet resultado = st.executeQuery(sentSELECT);
	
		while (resultado.next()) {
			Socio socio = new Socio();
			socio.setId_socio(resultado.getInt(1));
			socio.setNombre(resultado.getString(2));
			socio.setApellido(resultado.getString(3));
			socio.setDireccion(resultado.getString(4));
			socio.setPoblacion(resultado.getString(5));
			socio.setProvincia(resultado.getString(6));
			socio.setDni(resultado.getString(6));
			DATA.add(socio);
		}
	} catch (Exception e) {
		System.out.println("descarga fallida");
	}
	
	return DATA;
	}
//Prestamos

public void insertarPrestamo(Prestamo prestamo) throws SQLException {
	try {
	PreparedStatement preparedSt;
	
	preparedSt = con.prepareStatement(
	"INSERT INTO prestamos(id_libro, id_socio, fecha, devuelto) VALUES  (?,?,?,?)");
	preparedSt.setInt(1, prestamo.getId_libro());
	preparedSt.setInt(2, prestamo.getId_socio());
	preparedSt.setString(3,  prestamo.getFechaString());
	preparedSt.setInt(4, prestamo.getDevuelto());
	preparedSt.execute();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
public void eliminarPrestamo(int id) {
	try {
		
		Statement st = con.createStatement();
		String sentDELETE = "DELETE FROM `prestamo` WHERE id_libro ='" + id + "'";
		st.executeUpdate(sentDELETE);

	} catch (SQLException e) {
		e.printStackTrace();
	}
}
public Prestamo getPrestamo(int id) throws SQLException{
	Prestamo prestamo=null;
	try {
		prestamo = new Prestamo();
		Statement st = con.createStatement();
		String sentSELECT = "SELECT `id_libro`, `id_socio`, `fecha`, `devuelto` FROM `prestamos` WHERE id_libro="+id;
		ResultSet resultado = st.executeQuery(sentSELECT);
		prestamo.setId_libro(resultado.getInt(1));
		prestamo.setId_socio(resultado.getInt(2));
		prestamo.setFecha(resultado.getDate(3));
		prestamo.setDevuelto(resultado.getInt(4));
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return prestamo;
}
public ArrayList<Prestamo> descargarPrestamos() throws SQLException{
	ArrayList<Prestamo> DATA=new ArrayList<Prestamo>();
	try {
	
	Statement st = con.createStatement();
	String sentSELECT = "SELECT * FROM socios WHERE 1";
	ResultSet resultado = st.executeQuery(sentSELECT);
	
		while (resultado.next()) {
			Prestamo prestamo = new Prestamo();
			prestamo.setId_libro(resultado.getInt(1));
			prestamo.setId_socio(resultado.getInt(2));
			prestamo.setFecha(resultado.getDate(3));
			prestamo.setDevuelto(resultado.getInt(4));
			DATA.add(prestamo);
		}
	} catch (Exception e) {
		System.out.println("descarga fallida");
	}
	
	return DATA;
	}
public void debolverPrestamo(int id) {
	
	try {
		Statement st = con.createStatement();
		String sentUPDATE = "UPDATE prestamos SET devuelto= 1 WHERE  id_libro =" + id ;
		st.executeUpdate(sentUPDATE);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
