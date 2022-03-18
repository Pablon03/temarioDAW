package Actividad8;

public class Videojuego {


	// Constantes
	protected final static int HORASEST_DEF = 10;
	protected final static boolean ENTREGADO_DEF = false;
	protected final static String GENERO_DEF = "DEPORTE";
	protected final static String TITULO_DEF = "Fifa 22";
	protected final static String COMPAÑIA_DEF = "EA SPORTS";
	
	//Atributos
	protected String titulo, genero, compañia;
	protected int horasEst;
	protected boolean entregado;
	
	// Constructores
	public Videojuego(String titulo, String genero, String compañia, int horasEst) {
		this.titulo = titulo;
		this.genero = genero;
		this.compañia = compañia;
		this.horasEst = horasEst;
		this.entregado = ENTREGADO_DEF;
	}
	
	public Videojuego(String titulo, String compañia) {
		this(titulo, GENERO_DEF, compañia, HORASEST_DEF);
		this.entregado = ENTREGADO_DEF;
	}
	
	public Videojuego() {
		this(TITULO_DEF, GENERO_DEF, COMPAÑIA_DEF, HORASEST_DEF);
		this.entregado = ENTREGADO_DEF;
	}

	// Métodos
	protected void entregar() {
		this.entregado = true;
		System.out.println("El videojuego ha sido entregado");
	}

	protected void devolver() {
		this.entregado = false;
		System.out.println("El videojuego ha sido devuelto");
	}
	
	protected void isEntregado() {
		System.err.println("Estamos viendo nuestra base de datos");
		boolean estadoConsulta = this.entregado;
		if (estadoConsulta == true) {
			System.out.println("El videojuego ha sido entregado");
		} else {
			System.out.println("El videojuego está disponible");
		}
	}
	
	// Getters y Setters

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	public int getHorasEst() {
		return horasEst;
	}

	public void setHorasEst(int horasEst) {
		this.horasEst = horasEst;
	}

	
	// To String
	
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", genero=" + genero + ", compañia=" + compañia + ", horasEst="
				+ horasEst + ", entregado=" + entregado + "]";
	}
	
	
}
