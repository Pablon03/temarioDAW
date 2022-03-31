package Practica7;

import java.util.Arrays;

public class Compañia {

	//Atributos
	private String nombre;
	private Vuelo[] listaVuelo;
	private int numVuelo;
	
	// Constructores
//	public Compañia(String nombre, Vuelo[] vuelo) {
//		this.nombre = nombre;
//		this.listaVuelo = vuelo;
//		this.numVuelo = 0;
//	}
	
	public Compañia(String nombre) {
		this.nombre = nombre;
		this.listaVuelo = new Vuelo[1];
		this.numVuelo = 0;
	}
	
	/*
	 * insertarVuelo
	 * 
	 * Se le pasa por parametros un vuelo
	 * 
	 * El vuelo se añade a la lista de vuelos.
	 */
	
	public void insertarVuelo(Vuelo listaVuelo) {
		this.listaVuelo[numVuelo] = listaVuelo;
		numVuelo ++;
	}

	// Getters
	public String getNombre() {
		return nombre;
	}

	public Vuelo getListaVuelo(int i) {
		return listaVuelo[i];
	}

	public int getNumVuelo() {
		return numVuelo;
	}

	@Override
	public String toString() {
		return "Compañia [nombre=" + nombre + "]";
	}
	
	/*
	 * mostrarVuelos
	 * 
	 * Muestra la lista de vuelos de la compañia
	 */
	public void mostrarVuelos() {
		System.out.println(Arrays.toString(listaVuelo));
	}
}

