
public class Vuelo {

	// Atributos
	private String identificador;
	private String ciudadOrigen;
	private String ciudadDestino;
	private double precio;
	private int numMaxPasarejos;
	private int numActualPasajero;
	private Pasajero[] listaPasajeros;

	// Constructos
	public void vuelo(String id, String ciudadOrigen, String ciudadDestino, double precio, int pasajerosMaximos) {
		this.identificador = id;
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.precio = precio;
		this.numMaxPasarejos = pasajerosMaximos;
	}


	// Getters

	public String getIdentificador() {
		return identificador;
	}

	public String getCiudadOrigen() {
		return ciudadOrigen;
	}

	public String getCiudadDestino() {
		return ciudadDestino;
	}

	public double getPrecio() {
		return precio;
	}

	public int getNumMaxPasarejos() {
		return numMaxPasarejos;
	}

	public int getNumActualPasajero() {
		return numActualPasajero;
	}

	// Buscamos en el array el que coincida con el pasajero
	// con ese pasaporte
	public Pasajero[] getListaPasajeros(String pasaporte) {
		
		return listaPasajeros;
	}
	
	
	
}
