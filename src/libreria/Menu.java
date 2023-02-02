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
	
public static final int GESTIONAR_LIBRO =1;
public static final int GESTIONAR_SOCIO =2;
public static final int GESTIONAR_PRESTAMOS =3;	
public static final int SALIR =4;
public static void menuprincipal(){
	System.out.println(" Gestionar Libros\r\n"
			+ GESTIONAR_LIBRO+" Gestionar Socios\r\n"
			+ GESTIONAR_SOCIO+" Gestionar Prestamos\r\n"
			+ SALIR+" SALIR\r\n");
}


public static final int INSERTAR_LIBRO =1;
public static final int ELIMINAR_LIBRO =2;
public static final int VER_LIBROS =3;
public static void menuLibros(){
	System.out.println("  "+INSERTAR_LIBRO+" Insertar libro\r\n"
			+ "  "+ELIMINAR_LIBRO+" Eliminar libro\r\n"
			+ "  "+VER_LIBROS+" Ver libros\r\n"
			+ "  "+SALIR+" SALIR\r\n");
}
public static final int INSERTAR_SOCIOS =1;
public static final int ELIMINAR_SOCIOS =2;
public static final int VER_SOCIOS =3;
public static void menuSocios(){
	System.out.println("  "+INSERTAR_SOCIOS+" Insertar socio\r\n"
			+ "  "+ELIMINAR_SOCIOS+" Eliminar socio\r\n"
			+ "  "+VER_SOCIOS+" Ver socios\r\n"
			+ "  "+SALIR+" SALIR\r\n");
}
public static final int REALIZAR_PRESTAMOS =1;
public static final int ELIMINAR_PRESTAMOS =2;
public static final int VER_PRESTAMOS =3;
public static final int DEVOLVER_LIBRO =5;
public static void menuPrestamos(){
	System.out.println("  "+REALIZAR_PRESTAMOS+" Realizar préstamo\r\n"
			+ "  "+ELIMINAR_PRESTAMOS+" Eliminar socio\r\n"
			+ "  "+VER_SOCIOS+" Ver socios\r\n"
			+ "  "+SALIR+" SALIR\r\n"
			+ "  "+DEVOLVER_LIBRO+" devolver libro\r\n");
}
	
	
}
