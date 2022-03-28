
public class AeropuertoPrivado extends Aeropuerto{

	//Atributos
	private String[] empresas;
	private int numEmpresa;
	
	//Constructor
	public AeropuertoPrivado(String nombre, String ciudad, String pais) {
		super(nombre, ciudad, pais);
	}
	
	public AeropuertoPrivado(String nombre, String ciudad, String pais, Compañia[] compañia, String[] empresa) {
		super(nombre, ciudad, pais, compañia);
		this.empresas = new String[15];
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
	
	
	
}
