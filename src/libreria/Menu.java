package libreria;

public class Menu {
/*En la Fase1 el menu principal apareceran las opciones:
   Gestionar Libros
   Gestionar Socios
   Gestionar Prestamos
  En el menu libros:
   Insertar libro
   Eliminar libro
   Ver libros
  Menu socios:
   Ver socios
  Menu prestamos:
   Realizar préstamo
*/
public static void menuprincipal(){
	System.out.println("  1 Gestionar Libros\r\n"
			+ "  2 Gestionar Socios\r\n"
			+ "  3 Gestionar Prestamos\r\n"
			+ "  4 SALIR\r\n");
}

public static void menuLibros(){
	System.out.println("  1 Insertar libro\r\n"
			+ "  2 Eliminar libro\r\n"
			+ "  3 Ver libros\r\n"
			+ "  4 SALIR");
}
public static void menuSocios(){
	System.out.println("  1 Ver socios\r\n" 
				     + "  4 SALIR");
}
public static void menuPrestamos(){
	System.out.println("  1 Realizar préstamo"
					 + "  4 SALIR");
}
	
	
}
