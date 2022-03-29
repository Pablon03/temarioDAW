import java.util.Arrays;

public class AeropuertoPrivado extends Aeropuerto{

	//Atributos
	private String[] empresas = new String[2];
	private int numEmpresa;
	
	//Constructor
	public AeropuertoPrivado(String nombre, String ciudad, String pais) {
		super(nombre, ciudad, pais);
	}
	
	public AeropuertoPrivado(String nombre, String ciudad, String pais, Compañia[] compañia) {
		super(nombre, ciudad, pais, compañia);
		this.empresas = new String[2];
		numEmpresa = 0;
	}
	
	public void insertarEmpresa(String empresa) {
		this.empresas[numEmpresa] = empresa;
		numEmpresa ++;
	}

	// Getters
	public String[] getEmpresas() {
		return empresas;
	}

	@Override
	public String toString() {
		return "AeropuertoPrivado [empresas=" + Arrays.toString(empresas) + "]";
	}
	
	
	
}

