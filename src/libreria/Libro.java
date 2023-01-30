package libreria;

public class Libro {
 public int id_libro;
 public String titulo;
 public String autor;
 public int num_pag;
public int getId_libro() {
	return id_libro;
}
public void setId_libro(int id_libro) {
	this.id_libro = id_libro;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public int getNum_pag() {
	return num_pag;
}
public void setNum_pag(int num_pag) {
	this.num_pag = num_pag;
}
@Override
public String toString() {
	return "Libro [id_libro=" + id_libro + ", titulo=" + titulo + ", autor=" + autor + ", num_pag=" + num_pag + "]";
}

}
