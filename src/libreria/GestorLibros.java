package libreria;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorLibros {
public static void run(Scanner scan) throws SQLException {
	int opcion;
	GestorBBDD GBBDD=new GestorBBDD();
	FormulariosDeDatos FDatos=new FormulariosDeDatos();
	do {
		Menu.menuLibros();
		opcion= Integer.parseInt(scan.nextLine());
		
		System.out.println("------MENU-------");
		switch (opcion) {
		case Menu.INSERTAR_LIBRO:
			System.out.println("primera opcion seleccionada\n");
			Libro libro = FDatos.pedirDatosLibro(scan);
			GBBDD.insertarLibros(libro);
			break;
		case Menu.ELIMINAR_LIBRO:
			System.out.println("segunda opcion seleccionada\n");
			break;
		case Menu.VER_LIBROS:
			System.out.println("tercera opcion seleccionada\n");
			break;
		case Menu.SALIR:
			System.out.println("ADIOS");
			break;
		default:
			System.out.println("Opcion incorrecta!");
		}

		
		
	}while(opcion!=Menu.SALIR);
}
}
