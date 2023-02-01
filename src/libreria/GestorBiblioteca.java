package libreria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GestorBiblioteca {
	private static final String HOST = "localhost";
	private static final String BBDD = "primera";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
public static void run() throws ClassNotFoundException, SQLException {
	Conector con = new Conector();
	PreparedStatement preparedSt;
	Statement st = con.createStatement();
	Scanner scan = new Scanner(System.in);
	
	int opcion;
	do {
		Menu.menuprincipal();
		 opcion = Integer.parseInt(scan.nextLine());
		
		System.out.println("------MENU socios-------");
		switch (opcion) {
		case Menu.GESTIONAR_LIBRO:
			System.out.println("primera opcion seleccionada\n");
			GestorLibros.run(scan);
			
			break;
		case Menu.GESTIONAR_SOCIO:
			System.out.println("segunda opcion seleccionada\n");
			GestorSocios.run(scan);
			break;
		case Menu.GESTIONAR_PRESTAMOS:
			System.out.println("tercera opcion seleccionada\n");
			Menu.menuPrestamos();
			System.out.println("NO AVILITADA\n");
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
