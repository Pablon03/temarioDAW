
import java.util.Arrays;

public abstract class Aeropuerto {

	/*
	 * Atributos
	 */

	private String nombre;
	private String ciudad;
	private String pais;
	protected Compañia[] listaCompañia = new Compañia[2];
	private int numeroCompañia;

	/*
	 * Constructores
	 */
	public Aeropuerto(String nombre, String ciudad, String pais) {

		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		this.numeroCompañia = 0;

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

		return null;

	}

	public void insertarCompañia(Compañia compañia) {

		listaCompañia[numeroCompañia] = compañia;
		numeroCompañia++;
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

	public void setListaCompañia(Compañia[] listaCompañia) {
		this.listaCompañia = listaCompañia;
	}

	public Compañia getCompañia(String nombre) {
		// Introduce nombre de la compañia y la devuelve
		return null;
	}

	@Override
	public String toString() {
		return "Aeropuerto [listaCompañia=" + Arrays.toString(listaCompañia) + "]";
	}

	
	public String mostrarAeropuertos() {
		return "Aeropuerto" + this.nombre + "[Ciudad donde se sitúa: " + this.ciudad +" , país al que pertenece: " + this.pais + " ]";
	}
	/*
	 * Metodo Abstracto, mostrará la lista compañias
	 * 
	 * En cada clase se implementará de una forma
	 */

	protected abstract String mostrarNombreyCompañia();

}
