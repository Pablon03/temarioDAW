
public class Vuelo {

	// Atributos
	private String identificador;
	private String ciudadOrigen;
	private String ciudadDestino;
	private double precio;
	private int numMaxPasajeros;
	private int numActualPasajero;
	private Pasajero[] listaPasajeros;

	// Constructos
	public Vuelo(String id, String ciudadOrigen, String ciudadDestino, double precio, int pasajerosMaximos) {
		this.identificador = id;
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.precio = precio;
		this.numMaxPasajeros = pasajerosMaximos;
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

	public int getNumMaxPasajeros() {
		return numMaxPasajeros;
	}

	public int getNumActualPasajero() {
		return numActualPasajero;
	}

	// Buscamos en el array el que coincida con el pasajero
	// con ese pasaporte
	public Pasajero[] getListaPasajeros(String pasaporte) {
		
		return listaPasajeros;
	}


	@Override
	public String toString() {
		return "Vuelo [identificador=" + identificador + ", ciudadOrigen=" + ciudadOrigen + ", ciudadDestino="
				+ ciudadDestino + ", precio=" + precio + ", numMaxPasajeros=" + numMaxPasajeros + "]";
	}
	
	
	
}
