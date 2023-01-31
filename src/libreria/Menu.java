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
public static final int SALIR =4;
public static void menuprincipal(){
	System.out.println("  1 Gestionar Libros\r\n"
			+ "  2 Gestionar Socios\r\n"
			+ "  3 Gestionar Prestamos\r\n"
			+ "  "+SALIR+" SALIR");
}


public static final int INSERTAR_LIBRO =1;
public static final int ELIMINAR_LIBRO =2;
public static final int VER_LIBROS =3;
public static void menuLibros(){
	System.out.println("  1 Insertar libro\r\n"
			+ "  2 Eliminar libro\r\n"
			+ "  3 Ver libros\r\n"
			+ "  "+SALIR+" SALIR");
}
public static void menuSocios(){
	System.out.println("  1 Ver socios\r\n" 
			+ "  "+SALIR+" SALIR");
}
public static void menuPrestamos(){
	System.out.println("  1 Realizar préstamo"
			+ "  "+SALIR+" SALIR");
}
	
	
}
