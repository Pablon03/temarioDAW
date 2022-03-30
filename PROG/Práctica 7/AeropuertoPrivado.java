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

	public AeropuertoPrivado(String nombre, String ciudad, String pais, Compañia[] compañia) {
		super(nombre, ciudad, pais, compañia);
		this.empresas = new String[2];
		numEmpresa = 0;
	}

	public void insertarEmpresa(String empresa) {
		this.empresas[numEmpresa] = empresa;
		numEmpresa++;
	}

	// Getters
	public String[] getEmpresas() {
		return empresas;
	}

	@Override
	public String toString() {
		return "AeropuertoPrivado [empresas=" + Arrays.toString(empresas) + "]";
	}

	public String mostrarEmpresas() {
		return "AeropuertoPrivado [empresas=" + Arrays.toString(empresas) + "]";
	}
	/*
	 * Mostrar lista de compañias
	 */

	public void mostrarNombreyCompañia() {
		System.out.println("AeropuertoPrivado " + Arrays.toString(listaCompañia) + "]");
	}


}
