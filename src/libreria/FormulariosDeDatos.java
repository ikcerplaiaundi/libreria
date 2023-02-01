package libreria;

import java.util.Scanner;

public class FormulariosDeDatos {
public Libro pedirDatosLibro(Scanner scan) {
	Libro libro=new Libro();
	System.out.println("inreste estos datos entre comas \",\" \r\n"+libro.toString()
	+ "\r\n (el id se corregira automaticamente)\r\n");
	
	String[] resultado= scan.nextLine().split(",");
	libro.setId_libro(Integer.parseInt(resultado[1]));
	libro.setTitulo(resultado[2]);
	libro.setAutor(resultado[3]);
	libro.setNum_pag(Integer.parseInt(resultado[4]));

	return libro;
}
public static Libro modificarDatosLibro(Libro libro, Scanner scan) {
	
System.out.println("Modifique estos datos entre comas \",\" \r\n"+libro.toString());
	
	
	String[] resultado= scan.nextLine().split(",");
	libro.setId_libro(Integer.parseInt(resultado[1]));
	libro.setTitulo(resultado[2]);
	libro.setAutor(resultado[3]);
	libro.setNum_pag(Integer.parseInt(resultado[4]));
	return libro;
	
} 
public static int pedirIdLibro(Scanner scan) {
	System.out.println("dame un ID ");
	int resultado= Integer.parseInt(scan.nextLine());
	return resultado;
	
}


public Socio pedirDatosSocio(Scanner scan) {
	Socio Socio=new Socio();
	System.out.println("inreste estos datos entre comas \",\" \r\n"+Socio.toString()
	+ "\r\n (el id se corregira automaticamente)\r\n");
	
	String[] resultado= scan.nextLine().split(",");
	Socio socio = new Socio();
	socio.setId_socio(Integer.parseInt(resultado[1]));
	socio.setNombre(resultado[2]);
	socio.setApellido(resultado[3]);
	socio.setDireccion(resultado[4]);
	socio.setPoblacion(resultado[5]);
	socio.setProvincia(resultado[6]);
	socio.setDni(resultado[7]);
	

	return Socio;
}
public static Socio modificarDatosSocio(Socio socio, Scanner scan) {
	
System.out.println("Modifique estos datos entre comas \",\" \r\n"+socio.toString());
	
	
	String[] resultado= scan.nextLine().split(",");
	socio.setId_socio(Integer.parseInt(resultado[1]));
	socio.setNombre(resultado[2]);
	socio.setApellido(resultado[3]);
	socio.setDireccion(resultado[4]);
	socio.setPoblacion(resultado[5]);
	socio.setProvincia(resultado[6]);
	socio.setDni(resultado[7]);
	return socio;
	
} 
public static int pedirIdSocio(Scanner scan) {
	System.out.println("dame un ID ");
	int resultado= Integer.parseInt(scan.nextLine());
	return resultado;
	
}
}
