package Actividad2;

public class Lavadora extends Electrodomestico{

	// Constante
	final private static double CARGADEF = 5;
	
	//Atributos
	private double carga;
	
	//Constructor
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}
	
	public Lavadora(double precioBase, double peso) {
		this(precioBase, COLORDEF, CONSUMOENERGETICODEF, peso, CARGADEF);
	}
	
	public Lavadora(double carga) {
		this(PRECIODEF, COLORDEF, CONSUMOENERGETICODEF, PESODEF, CARGADEF);
	}
	
	public double precioFinal() {
		double plus = super.precioFinal();
		
		if (carga > 30) {
			plus += 50;
		}
		
		return plus;
	}

	public double getCarga() {
		return carga;
	}

	
}
