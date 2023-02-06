package libreria;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorPrestamos {
	/*

	public static final int REALIZAR_PRESTAMOS =1;
	public static final int VER_PRESTAMOS =2;
	public static final int DEVOLVER_LIBRO =3;
	*/
	public static void run(Scanner scan)  {
		int opcion;
		GestorBBDD GBBDD=new GestorBBDD();
		FormulariosDeDatos FDatos=new FormulariosDeDatos();
		Visor visor=new Visor();
		do {
			Menu.menuPrestamos();
			opcion= Integer.parseInt(scan.nextLine());
			System.out.println("------MENU pestamos-------");
			switch (opcion) {
			case Menu.REALIZAR_PRESTAMOS:
				System.out.println("primera opcion seleccionada\n");
				
				try {
					GBBDD.insertarPrestamo(FDatos.pedirDatosPrestamo(scan));
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				break;
			case Menu.VER_PRESTAMOS:
				System.out.println("segunda opcion seleccionada\n");
				try {
					visor.mostrarPrestamos(GBBDD.descargarPrestamos());
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				break;
			case Menu.DEVOLVER_LIBRO:
				System.out.println("tercera opcion seleccionada\n");
				GBBDD.debolverPrestamo(FDatos.pedirIdLibro( scan));
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
