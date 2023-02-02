package libreria;

import java.util.ArrayList;

public class Visor {
public static void mostrarLibros(ArrayList<Libro> libros) {
	for (Libro libro : libros) {
		System.out.println(libro.toString());
	}
}
public static void mostrarLibro(Libro libro) {
	System.out.println(libro.toString());
}
public static void mostrarSocios(ArrayList<Socio> socios) {
	for (Socio socio : socios) {
		System.out.println(socio.toString());
	}
}
public static void mostrarSocio(Socio socio) {
	System.out.println(socio.toString());
}
public static void mostrarPrestamos(ArrayList<Prestamo> Prestamos) {
	for (Prestamo Prestamo : Prestamos) {
		System.out.println(Prestamo.toString());
	}
}
public static void mostrarPrestamo(Prestamo Prestamo) {
	System.out.println(Prestamo.toString());
}
public static void mostrarMensaje(String Prestamo) {
	System.out.println(Prestamo);
}
}
