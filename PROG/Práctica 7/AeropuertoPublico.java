package Practica7;

import java.util.Arrays;

public class AeropuertoPublico extends Aeropuerto {

//	Atributos
	private double subvencion;

//	Constructores
	public AeropuertoPublico(String nombre, String ciudad, String pais) {
		super(nombre, ciudad, pais);

	}

	public AeropuertoPublico(String nombre, String ciudad, String pais, double subvencion) {
		super(nombre, ciudad, pais);
		this.subvencion = subvencion;
	}


//	Getters

	public double getSubvencion() {
		return subvencion;
	}

	/*
	 * Mostrar lista de compañias
	 * 
	 * Muestra el nombre y la lista de compañias del aeropuerto
	 */

	public void mostrarNombreyCompañia() {
		System.out.println(this.nombre + ": " + Arrays.toString(listaCompañia) + "]");
	}
	
	/*
	 * mostrarSubvencion
	 * 
	 * Muestra el nombre y la subvencion del aeropuerto
	 */

	public void mostrarSubvencion() {
		System.out.println(this.nombre + ": Tiene una subvención de " + subvencion + "€");
	}

}


