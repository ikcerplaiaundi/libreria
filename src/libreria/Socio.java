package libreria;

public class Socio {
	public int id_socio;
	public String nombre;
	public String apellido;
	public String direccion;
	public String poblacion;
	public String provincia;
	public String dni;
	
	public int getId_socio() {
		return id_socio;
	}
	public void setId_socio(int id_socio) {
		this.id_socio = id_socio;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String toString() {
		return "Socio [id_socio=" + id_socio + ", nombre=" + nombre + ", direccion=" + direccion + ", poblacion="
				+ poblacion + ", provincia=" + provincia + ", dni=" + dni + "]";
	}
	
	
}
