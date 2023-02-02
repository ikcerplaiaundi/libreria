package libreria;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestamo {
	public int id_libro;
	public int id_socio;
	public Date fecha;
	public String pattern = "yyyy-MM-dd";
	public SimpleDateFormat simpleDateFormat; 
	public int devuelto;
	
	Prestamo() throws ParseException {
		fecha = new Date();
		devuelto = 0;
		simpleDateFormat = new SimpleDateFormat(pattern);
	}

	public int getId_libro() {
		return id_libro;
	}

	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}

	public int getId_socio() {
		return id_socio;
	}

	public void setId_socio(int id_socio) {
		this.id_socio = id_socio;
	}

	public java.sql.Date getFecha() {
		return (java.sql.Date) fecha;
	}
	public String getFechaString() {
		return ""+fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
		simpleDateFormat = new SimpleDateFormat(this.pattern);
	}

	public int getDevuelto() {
		return devuelto;
	}

	public void setDevuelto(int devuelto) {
		this.devuelto = devuelto;
	}


	public String toString() {
		return "Prestamo [id_libro=" + id_libro + ", id_socio=" + id_socio + ", fecha=" + fecha + ", pattern=" + pattern
				+ ", devuelto=" + devuelto + "]";
	}

}
