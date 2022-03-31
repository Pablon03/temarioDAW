package Practica7;

import java.util.Arrays;

public class AeropuertoPrivado extends Aeropuerto {

	// Atributos
	private String[] empresas;
	private int numEmpresa;

	// Constructor
	public AeropuertoPrivado(String nombre, String ciudad, String pais) {
		super(nombre, ciudad, pais);
		this.empresas = new String[2];
	}

//	public AeropuertoPrivado(String nombre, String ciudad, String pais, Compañia[] compañia) {
//		super(nombre, ciudad, pais, compañia);
//		this.empresas = new String[2];
//		numEmpresa = 0;
//	}

	/*
	 * insertarEmpresa
	 * 
	 *  Se le pasa por parametros un string, que se el nombre de la empresa
	 *  
	 *  Añade una nueva empresa a la array de empresas.
	 */
	
	public void insertarEmpresa(String empresa) {
		this.empresas[numEmpresa] = empresa;
		numEmpresa++;
	}

	// Getters
	public String[] getEmpresas() {
		return empresas;
	}

//	@Override
//	public String toString() {
//		return "AeropuertoPrivado [empresas=" + Arrays.toString(empresas) + "]";
//	}
	
	/*
	 * mostrarEmpresas
	 * 
	 * Mostrará el nombre y las empresas del aeropuerto
	 */

	public String mostrarEmpresas() {
		return this.nombre + ": Empresas=" + Arrays.toString(empresas) + "";
	}
	
	/*
	 * Mostrar lista de compañias
	 * 
	 * Muestra el nombre del aeropuerto y su lista de compañias.
	 */

	public void mostrarNombreyCompañia() {
		System.out.println(this.nombre + ": " + Arrays.toString(listaCompañia));
	}


}

