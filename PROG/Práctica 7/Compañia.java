package Practica7;

import java.util.Arrays;

public class Compañia {

	//Atributos
	private String nombre;
	private Vuelo[] listaVuelo;
	private int numVuelo;
	
	// Constructores
	public Compañia(String nombre, Vuelo[] vuelo) {
		this.nombre = nombre;
		this.listaVuelo = listaVuelo;
		this.numVuelo = 0;
	}
	
	public Compañia(String nombre) {
		this.nombre = nombre;
		this.numVuelo = 0;
	}
	
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
	
	
}
