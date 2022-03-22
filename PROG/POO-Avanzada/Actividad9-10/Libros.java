package Actividad9;

public class Libros extends Publicaciones implements Prestable {

	//Constantes
	private final static boolean NOPRESTADO = false;
	
	//Atributos
	private boolean prestado;
	
	//Constructor
	public Libros(String codigo, String titulo, int anioPublicacion) {
		super(codigo, titulo, anioPublicacion);
		this.prestado = NOPRESTADO;
	}
	
	//Métodos de la interfaz
	@Override
	public void prestar() {
		prestado = true;
		
	}

	@Override
	public void devolver() {
		prestado = false;
		
	}

	@Override
	public boolean prestado() {
		return prestado;
	}


	@Override
	public String toString() {
		return "Libros [prestado=" + prestado + ", toString()=" + super.toString() + "]";
	}

	
}
