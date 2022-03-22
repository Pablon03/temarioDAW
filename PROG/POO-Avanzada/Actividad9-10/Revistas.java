package Actividad9Estudiando;

public class Revistas extends Publicaciones {

	// Atributos
	private int numero;

	// Constructor
	public Revistas(String codigo, String titulo, int anioPublicacion, int numero) {
		super(codigo, titulo, anioPublicacion);
		this.numero = numero;
	}

	
	@Override
	public String toString() {
		return "Revistas [numero=" + numero + ", toString()=" + super.toString() + "]";
	}

}
