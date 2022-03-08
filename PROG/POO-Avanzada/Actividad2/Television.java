package Actividad2;

public class Television extends Electrodomestico {

	// Constantes
	final private static double RESOLUCIONDEF = 20;
	final private static boolean SINTONIZADORDEF = false;
	
	// Atributos
	private double resolucion;
	private boolean sintonizador;
	
	// Constructores
	public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizador) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}
	
	public Television(double precioBase, double peso) {
		this(precioBase, COLORDEF, CONSUMOENERGETICODEF, peso, RESOLUCIONDEF, SINTONIZADORDEF);
	}
	
	public Television() {
		this(PRECIODEF, COLORDEF, CONSUMOENERGETICODEF, PESODEF, RESOLUCIONDEF, SINTONIZADORDEF);
	}

	// Getters
	public double getResolucion() {
		return resolucion;
	}

	public boolean isSintonizador() {
		return sintonizador;
	}
	
	
	// Método
	public double precioFinal() {
		double plus = super.precioFinal();
		
		if (resolucion > 40) {
			plus = plus * 1.3; 
		}
		if (sintonizador == true) {
			 plus += 50;
		}
		
		return plus;
	}
	
}
