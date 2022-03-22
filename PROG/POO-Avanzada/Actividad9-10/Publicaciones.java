package Actividad9;

public class Publicaciones {

	
	//Atributos
	private String codigo;
	private String titulo;
	private int anioPublicacion;
	
	//Constructor
	public Publicaciones(String codigo, String titulo, int anioPublicacion) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.anioPublicacion = anioPublicacion;
	}

	@Override
	public String toString() {
		return "Publicaciones [codigo=" + codigo + ", titulo=" + titulo + ", anioPublicacion=" + anioPublicacion
				+ "]";
	}

	public String getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}
	
	
	
}
