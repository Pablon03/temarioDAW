
package Practica7;

import java.util.Arrays;

public abstract class Aeropuerto {

//	Atributos

	protected String nombre;
	private String ciudad;
	private String pais;
	protected Compañia[] listaCompañia;
	private int numeroCompañia;

//	Constructor
	public Aeropuerto(String nombre, String ciudad, String pais) {

		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		this.listaCompañia = new Compañia[1];
		this.numeroCompañia = 0;

	}

//	public Aeropuerto(String nombre, String ciudad, String pais, Compañia[] compañia) {
//
//		this.nombre = nombre;
//		this.ciudad = ciudad;
//		this.pais = pais;
//		this.listaCompañia = compañia;
//		this.listaCompañia = new Compañia[1];
//
//	}


	/*
	 * insertarCompañia
	 * 
	 * Se le pasa por parametros una compañia
	 * 
	 * Añade una compañia a la array de compañia 
	 */

	public void insertarCompañia(Compañia compañia) {

		listaCompañia[numeroCompañia] = compañia;
		numeroCompañia++;
	}

//	Getters

	public String getNombre() {
		return nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getPais() {
		return pais;
	}

	public int getNumeroCompañia() {
		return numeroCompañia;
	}

	public void setListaCompañia(Compañia[] listaCompañia) {
		this.listaCompañia = listaCompañia;
	}

	public Compañia getCompañia(String nombre) {
		// Introduce nombre de la compañia y la devuelve
		return null;
	}

	/*
	 * mostrarAeropuertos
	 * 
	 * Mostrará el nombre, la ciudad y el pais al que pertenece el aeropuerto
	 */
	
	public String mostrarAeropuertos() {
		return this.nombre + "[Ciudad donde se sitúa: " + this.ciudad +" , país al que pertenece: " + this.pais + " ]";
	}
	
	/*
	 * Metodo Abstracto, mostrará la lista compañias
	 * 
	 * En cada clase se implementará de una forma
	 */

	protected abstract void mostrarNombreyCompañia();

}
