
public class Pasajero {

	// Atributos
	private String nombre;
	private String pasaporte;
	private String nacionalidad;
	
	//Constructor
	public void Pasajero(String nombre, String pasaporte, String nacionalidad) {
		this.nombre = nombre;
		this.pasaporte = pasaporte;
		this.nacionalidad = nacionalidad;
	}

	
	// Getters 
	
	public String getNombre() {
		return nombre;
	}

	public String getPasaporte() {
		return pasaporte;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}
	
	
}
