package Practica7;

import java.util.*;

public class Main {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Datos
		 */
		Aeropuerto[] listaAeropuertos = new Aeropuerto[6];
		
		AeropuertoPrivado apriv1 = new AeropuertoPrivado("AeropuertoPrivado1", "Ciudad1", "Pais1");
		AeropuertoPrivado apriv2 = new AeropuertoPrivado("AeropuertoPrivado2", "Ciudad2", "Pais2");
		AeropuertoPrivado apriv3 = new AeropuertoPrivado("AeropuertoPrivado3", "Ciudad3", "Pais3");
		AeropuertoPublico apub1 = new AeropuertoPublico("AeropuertoPrivado4", "Ciudad4", "Pais4");
		AeropuertoPublico apub2 = new AeropuertoPublico("AeropuertoPrivado5", "Ciudad5", "Pais5");
		AeropuertoPublico apub3 = new AeropuertoPublico("AeropuertoPrivado6", "Ciudad6", "Pais6");
		
		listaAeropuertos[0]=apriv1;
		listaAeropuertos[1]=apriv2;
		listaAeropuertos[2]=apriv3;
		listaAeropuertos[3]=apub1;
		listaAeropuertos[4]=apub2;
		listaAeropuertos[5]=apub3;
				

		/*
		 * Variables
		 */

		int accion;

		/*
		 * Menu
		 */

		do {

			mostrarMenu();
			accion = accionMenu();
			tratarMenu(accion);

		} while (accion != 6);

	}

	public static void mostrarMenu() {

		System.out.println();
		System.out.println(".:MENU:.");
		System.out.println("1.-Consultar aeropuertos gestionados" + "\n2.-Visualizar las empresas"
				+ "\n3.-Mostrar lista de compañias de un determinado aeropuerto"
				+ "\n4.-Mostrar aeropuerto para una determinada compañia" + "\n5.-Mostrar todos los datos posibles");

	}

	public static int accionMenu() {

		int accion;

		System.out.println("Introduce lo que deseea hacer:");
		accion = entrada.nextInt();

		return accion;

	}

	public static void tratarMenu(int accion) {

		switch (accion) {

		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;

		}

	}

	public static void consultarAeropuertos() {

	}

}

