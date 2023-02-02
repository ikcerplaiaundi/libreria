package libreria;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class FormulariosDeDatos {
	public Libro pedirDatosLibro(Scanner scan) {
		Libro libro = new Libro();
		System.out.println("inreste estos datos entre comas \",\" \r\n" + libro.toString()
				+ "\r\n (el id se corregira automaticamente)\r\n");

		String[] resultado = scan.nextLine().split(",");
		libro.setId_libro(Integer.parseInt(resultado[1]));
		libro.setTitulo(resultado[2]);
		libro.setAutor(resultado[3]);
		libro.setNum_pag(Integer.parseInt(resultado[4]));

		return libro;
	}

	public static Libro modificarDatosLibro(Libro libro, Scanner scan) {

		System.out.println("Modifique estos datos entre comas \",\" \r\n" + libro.toString());

		String[] resultado = scan.nextLine().split(",");
		libro.setId_libro(Integer.parseInt(resultado[1]));
		libro.setTitulo(resultado[2]);
		libro.setAutor(resultado[3]);
		libro.setNum_pag(Integer.parseInt(resultado[4]));
		return libro;

	}

	public static int pedirIdLibro(Scanner scan) {
		System.out.println("dame un ID ");
		int resultado = Integer.parseInt(scan.nextLine());
		return resultado;

	}

	public Socio pedirDatosSocio(Scanner scan) {
		Socio Socio = new Socio();
		System.out.println("inreste estos datos entre comas \",\" \r\n" + Socio.toString()
				+ "\r\n (el id se corregira automaticamente)\r\n");

		String[] resultado = scan.nextLine().split(",");
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

		System.out.println("Modifique estos datos entre comas \",\" \r\n" + socio.toString());

		String[] resultado = scan.nextLine().split(",");
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
		int resultado = Integer.parseInt(scan.nextLine());
		return resultado;

	}

	public Prestamo pedirDatosPrestamo(Scanner scan) {
		Prestamo prestamo = null;
		try {
			prestamo = new Prestamo();
			System.out.println("inreste estos datos entre comas \",\" \r\n" + prestamo.toString()
					+ "\r\n (el id se corregira automaticamente)\r\n");

			String[] resultado = scan.nextLine().split(",");
			prestamo.setId_libro(Integer.parseInt(resultado[0]));
			prestamo.setId_socio(Integer.parseInt(resultado[1]));
			prestamo.setFecha(prestamo.simpleDateFormat.parse(resultado[2]));
			prestamo.setDevuelto(Integer.parseInt(resultado[3]));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return prestamo;
	}

	public static Prestamo modificarDatosPrestamo(Prestamo prestamo, Scanner scan) {

		System.out.println("Modifique estos datos entre comas \",\" \r\n" + prestamo.toString());

		String[] resultado = scan.nextLine().split(",");
		prestamo.setId_libro(Integer.parseInt(resultado[0]));
		prestamo.setId_socio(Integer.parseInt(resultado[1]));
		try {
			prestamo.setFecha(prestamo.simpleDateFormat.parse(resultado[2]));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		prestamo.setDevuelto(Integer.parseInt(resultado[3]));
		return prestamo;

	}

	public static Date pedirPrestamoDate(Scanner scan ) {
		Prestamo prestamo;
		System.out.println("dame una fecha");
		Date resultado =null;
		try {
			prestamo =new Prestamo();
			resultado = (prestamo.simpleDateFormat.parse(scan.nextLine()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;

	}
}
