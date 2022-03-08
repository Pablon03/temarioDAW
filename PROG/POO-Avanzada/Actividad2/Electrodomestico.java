package Actividad2;

public class Electrodomestico {

	// Constantes
	final protected static double PRECIODEF = 100;
	final protected static String COLORDEF = "Blanco";
	final protected static char CONSUMOENERGETICODEF = 'F';
	final protected static double PESODEF = 5;
	
	//Atributos
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	//Constructores
	
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}
	
	public Electrodomestico(double precioBase, double peso) {
		this(precioBase, COLORDEF, CONSUMOENERGETICODEF, peso);
	}
	
	public Electrodomestico() {
		this(PRECIODEF, COLORDEF, CONSUMOENERGETICODEF, PESODEF);
	}
	
	private char comprobarConsumoEnergetico(char letra) {
		boolean letraCorrecta = false;
		
		if (letra >= 'A' && letra<= 'F') {
			letraCorrecta = true;
		}
		
		if (letraCorrecta == true) {
			return letra;
		} else {
			return CONSUMOENERGETICODEF;
		}
	}

	private String comprobarColor(String color) {
		color.toLowerCase();
		boolean colorIgual = false;
		String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
		
		for (int i = 0; i < colores.length; i++) {
			if (colores[i].equals(color)) {
				colorIgual = true;
				i = 15;
			}
		}
		if (colorIgual == true) {
			return color;
		} else {
			return COLORDEF;
		}
		
	}

	public double precioFinal() {
		double plus = 0;
		
		switch (consumoEnergetico) {
		case 'A':
			plus += 100;
			break;
		case 'B':
			plus += 80;
			break;
		case 'C':
			plus += 60;
			break;
		case 'D':
			plus += 50;
			break;
		case 'E':
			plus += 30;
			break;
		case 'F':
			plus += 10;
			break;
		}
		
		if (peso >= 0 && peso <= 19) {
			plus += 10;
		} else if (peso >= 20 && peso <= 49) {
			plus += 50;
		} else if (peso >= 50 && peso <= 79) {
			plus += 80;
		} else {
			plus += 100;
		}
		
		return (precioBase + plus);
	}
	
	// Getters

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}
	
	
}
