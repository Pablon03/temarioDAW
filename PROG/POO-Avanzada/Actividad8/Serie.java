package Actividad8;

public class Serie {

	// Constantes
	protected final static int NUMTEMP_DEF = 3;
	protected final static boolean ENTREGADO_DEF = false;
	protected final static String GENERO_DEF = "Accion";
	protected final static String TITULO_DEF = "Spider-Man";
	protected final static String CREADOR_DEF = "Juan";
	
	//Atributos
	protected String titulo, genero, creador;
	protected int numTemporada;
	protected boolean entregado;
	
	// Constructores
	public Serie(String titulo, String genero, String creador, int numTemporada) {
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.numTemporada = numTemporada;
		this.entregado = ENTREGADO_DEF;
	}
	
	public Serie(String titulo, String creador) {
		this(titulo, GENERO_DEF, creador, NUMTEMP_DEF);
		this.entregado = ENTREGADO_DEF;
	}
	
	public Serie() {
		this(TITULO_DEF, GENERO_DEF, CREADOR_DEF, NUMTEMP_DEF);
		this.entregado = ENTREGADO_DEF;
	}

	// Métodos
	protected void entregar() {
		this.entregado = true;
		System.out.println("La serie ha sido entregada");
	}

	protected void devolver() {
		this.entregado = false;
		System.out.println("La serie ha sido devuelta");
	}
	
	protected void isEntregado() {
		System.err.println("Estamos viendo nuestra base de datos");
		boolean estadoConsulta = this.entregado;
		if (estadoConsulta == true) {
			System.out.println("La serie ha sido entregada");
		} else {
			System.out.println("La serie no ha sido entregada");
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

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public int getNumTemporada() {
		return numTemporada;
	}

	public void setNumTemporada(int numTemporada) {
		this.numTemporada = numTemporada;
	}

	
	// To String
	
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", genero=" + genero + ", creador=" + creador + ", numTemporada="
				+ numTemporada + ", entregado=" + entregado + "]";
	}
	
}
