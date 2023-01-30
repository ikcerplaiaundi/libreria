package libreria;

import java.util.Scanner;

public class FormulariosDeDatos {
public Libro pedirDatosLibro(Scanner scan) {
	Libro libro=new Libro();
	System.out.println("inreste estos datos entre comas \",\" \r\n"+libro.toString());
	
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
}