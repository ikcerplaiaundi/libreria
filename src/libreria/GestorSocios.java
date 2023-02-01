package libreria;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorSocios {
	public static void run(Scanner scan) throws SQLException {
		int opcion;
		GestorBBDD GBBDD=new GestorBBDD();
		FormulariosDeDatos FDatos=new FormulariosDeDatos();
		Visor visor=new Visor();
		do {
			Menu.menuSocios();
			opcion= Integer.parseInt(scan.nextLine());
			
			System.out.println("------MENU socios-------");
			switch (opcion) {
			case Menu.INSERTAR_SOCIOS:
				System.out.println("primera opcion seleccionada\n");
				
				GBBDD.insertarSocio(FDatos.pedirDatosSocio(scan));
				break;
			case Menu.ELIMINAR_SOCIOS:
				System.out.println("segunda opcion seleccionada\n");
				GBBDD.eliminarSocio(FDatos.pedirIdSocio(scan));
				break;
			case Menu.VER_SOCIOS:
				System.out.println("tercera opcion seleccionada\n");
				visor.mostrarSocios(GBBDD.descargarSocios());
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
