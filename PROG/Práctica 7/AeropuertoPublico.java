package Practica7;

public class AeropuertoPublico extends Aeropuerto {

	/*
	 * Atributos
	 */
	private double subvencion;

	/*
	 * Constructores
	 */
	public AeropuertoPublico(String nombre, String ciudad, String pais) {
		super(nombre, ciudad, pais);

	}

	public AeropuertoPublico(String nombre, String ciudad, String pais, double subvencion) {
		super(nombre, ciudad, pais);
		this.subvencion = subvencion;
	}

	public AeropuertoPublico(String nombre, String ciudad, String pais, Compañia[] compañia, double subvencion) {
		super(nombre, ciudad, pais, compañia);
		this.subvencion = subvencion;
	}

	/*
	 * getters
	 */

	public double getSubvencion() {
		return subvencion;
	}
}
