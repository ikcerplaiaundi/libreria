package libreria;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorLibros {
public static void run(Scanner scan) throws SQLException {
	int opcion;
	GestorBBDD GBBDD=new GestorBBDD();
	FormulariosDeDatos FDatos=new FormulariosDeDatos();
	Visor visor=new Visor();
	do {
		Menu.menuLibros();
		opcion= Integer.parseInt(scan.nextLine());
		
		System.out.println("------MENU-------");
		switch (opcion) {
		case Menu.INSERTAR_LIBRO:
			System.out.println("primera opcion seleccionada\n");
			
			GBBDD.insertarLibros(FDatos.pedirDatosLibro(scan));
			break;
		case Menu.ELIMINAR_LIBRO:
			System.out.println("segunda opcion seleccionada\n");
			GBBDD.eliminarLibro(FDatos.pedirIdLibro(scan));
			break;
		case Menu.VER_LIBROS:
			System.out.println("tercera opcion seleccionada\n");
			visor.mostrarLibros(null);
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
