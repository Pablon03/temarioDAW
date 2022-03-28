package Practica7;


public class Aeropuerto {

	/*
	 * Atributos
	 */

	private String nombre;
	private String ciudad;
	private String pais;
	private Compañia[] listaCompañia;
	private int numeroCompañia;


	/*
	 * Constructores
	 */
	public Aeropuerto(String nombre, String ciudad, String pais) {

		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;

	}

	public Aeropuerto(String nombre, String ciudad, String pais, Compañia[] compañia) {

		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		this.listaCompañia = compañia;


	}
	
	/*
	 * Metodos
	 */
	public Compañia obtenerCompañias() {
		//Devulve compañias
		return null;
		
	}
	
	public void insertarCompañia(Compañia compañia) {
		//Inserta compañias
	}
	
	/*
	 * Getters
	 */

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
	
	public Compañia getCompañia(int numVuelo) {
		//Introduce numVuelo y devuelve vuelo
		return null;
	}
	
	public Compañia getCompañia(String nombre) {
		//Introduce nombre de la compañia y la devuelve
		return null;
	}
}
