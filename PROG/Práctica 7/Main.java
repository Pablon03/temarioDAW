package Practica7;

import java.util.*;

public class Main {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

//		Datos

		/* Creación de aeropuertos y creación de empresas */
		Aeropuerto[] listaAeropuertos = new Aeropuerto[6];

		AeropuertoPrivado apriv1 = new AeropuertoPrivado("AeropuertoPrivado1", "Ciudad1", "Pais1");
		AeropuertoPrivado apriv2 = new AeropuertoPrivado("AeropuertoPrivado2", "Ciudad2", "Pais2");
		AeropuertoPrivado apriv3 = new AeropuertoPrivado("AeropuertoPrivado3", "Ciudad3", "Pais3");
		AeropuertoPublico apub1 = new AeropuertoPublico("AeropuertoPublico4", "Ciudad4", "Pais4", 1500);
		AeropuertoPublico apub2 = new AeropuertoPublico("AeropuertoPublico5", "Ciudad5", "Pais5", 2500);
		AeropuertoPublico apub3 = new AeropuertoPublico("AeropuertoPublico6", "Ciudad6", "Pais6", 3500);

		listaAeropuertos[0] = apriv1;
		listaAeropuertos[1] = apriv2;
		listaAeropuertos[2] = apriv3;
		listaAeropuertos[3] = apub1;
		listaAeropuertos[4] = apub2;
		listaAeropuertos[5] = apub3;

		apriv1.insertarEmpresa("Microsoft");
		apriv1.insertarEmpresa("Apple");
		apriv2.insertarEmpresa("Samsung");
		apriv2.insertarEmpresa("Oppo");
		apriv3.insertarEmpresa("Medion");
		apriv3.insertarEmpresa("Xiaomi");

		/* Creación de compañías y asociación de vuelos */
		Compañia[] listaCompañias = new Compañia[6];

		Compañia com1 = new Compañia("Compañia1");
		Compañia com2 = new Compañia("Compañia2");
		Compañia com3 = new Compañia("Compañia3");
		Compañia com4 = new Compañia("Compañia4");
		Compañia com5 = new Compañia("Compañia5");
		Compañia com6 = new Compañia("Compañia6");

		listaCompañias[0] = com1;
		listaCompañias[1] = com2;
		listaCompañias[2] = com3;
		listaCompañias[3] = com4;
		listaCompañias[4] = com5;
		listaCompañias[5] = com6;

		apriv1.insertarCompañia(com1);
		apriv2.insertarCompañia(com2);
		apriv3.insertarCompañia(com3);
		apub1.insertarCompañia(com4);
		apub2.insertarCompañia(com5);
		apub3.insertarCompañia(com6);

		/* Creamos vuelos y los insertamos en las compañias */
		Vuelo v1 = new Vuelo("1", "Ciudad1", "Ciudad2", 100.0, 1000);
		Vuelo v2 = new Vuelo("2", "Ciudad3", "Ciudad4", 100.0, 1000);
		Vuelo v3 = new Vuelo("3", "Ciudad5", "Ciudad9", 100.0, 1000);
		Vuelo v4 = new Vuelo("3", "Ciudad6", "Ciudad10", 100.0, 1000);
		Vuelo v5 = new Vuelo("3", "Ciudad7", "Ciudad11", 100.0, 1000);
		Vuelo v6 = new Vuelo("3", "Ciudad8", "Ciudad12", 100.0, 1000);

		com1.insertarVuelo(v1);
		com2.insertarVuelo(v2);
		com3.insertarVuelo(v3);
		com4.insertarVuelo(v4);
		com5.insertarVuelo(v5);
		com6.insertarVuelo(v6);

//		Variables

		int accion;

//		Menu

		do {

			mostrarMenu();
			accion = accionMenu();
			tratarMenu(accion, listaAeropuertos, listaCompañias);

		} while (accion != 6);

	}

	/* Los siguientes 3 metetodos son los responsables del menu */

	public static void mostrarMenu() {

		System.out.println();
		System.out.println(".:MENU:.");
		System.out.println("1.-Consultar aeropuertos gestionados" + "\n2.-Visualizar las empresas"
				+ "\n3.-Mostrar lista de compañias de un determinado aeropuerto"
				+ "\n4.-Mostrar aeropuerto para una determinada compañia" + "\n5.-Mostrar todos los datos posibles"
				+ "\n6.-Salir");

	}

	public static int accionMenu() {

		int accion;

		System.out.println("Introduce lo que deseea hacer:");
		accion = entrada.nextInt();

		return accion;

	}

	public static void tratarMenu(int accion, Aeropuerto[] listaAeropuertos, Compañia[] listaCompañias) {

		switch (accion) {

		case 1:
			consultarAeropuertos(listaAeropuertos);
			break;

		case 2:
			metodoDos(listaAeropuertos);
			break;

		case 3:
			listaCompañiasAeropuerto(listaAeropuertos);
			break;

		case 4:
			vuelosCompañiasAeropuerto(listaAeropuertos, listaCompañias);
			break;

		case 5:
			break;

		case 6:
			System.out.println("Saliendo...");
			break;

		}

	}

	/*
	 * ConsultarAeropuertos
	 * 
	 * Se introduce una array de Aeropuertos
	 * 
	 * Se muestran los aeropuetos publicos y privados por separado
	 */

	public static void consultarAeropuertos(Aeropuerto[] listaAeropuertos) {
		System.out.println("Aeropuertos Privados");
		for (int i = 0; i < listaAeropuertos.length; i++) {
			if (listaAeropuertos[i] instanceof AeropuertoPrivado) {
				System.out.println(listaAeropuertos[i].mostrarAeropuertos());
			}
		}
		System.out.println();
		System.out.println("Aeropuestos Publicos");
		for (int i = 0; i < listaAeropuertos.length; i++) {
			if (listaAeropuertos[i] instanceof AeropuertoPublico) {
				System.out.println(listaAeropuertos[i].mostrarAeropuertos());
			}
		}
	}

	/*
	 * MetodoDos
	 * 
	 * Se le pasa por parametros una array de Aeropuertos
	 * 
	 * Muestra las empresas de los auropuertos privados y las subvenciones de los
	 * aeropuertos publicos
	 * 
	 */

	public static void metodoDos(Aeropuerto[] listaAeropuertos) {

		System.out.println("//Aeropuertos Privados//");
		for (int i = 0; i < listaAeropuertos.length; i++) {
			if (listaAeropuertos[i] instanceof AeropuertoPrivado) {
				System.out.println(((AeropuertoPrivado) listaAeropuertos[i]).mostrarEmpresas());
			}
		}
		System.out.println("");
		System.out.println("//Aeropuertos Públicos//");
		for (int i = 0; i < listaAeropuertos.length; i++) {
			if (listaAeropuertos[i] instanceof AeropuertoPublico) {
				((AeropuertoPublico) listaAeropuertos[i]).mostrarSubvencion();
			}
		}
	}

	/*
	 * listaCompañiasAeropuerto
	 * 
	 * Se le pasa por parametros una array de aeropuertos
	 * 
	 * Muestra el nombre y la compañia del aeropuerto elegido
	 */

	public static void listaCompañiasAeropuerto(Aeropuerto[] listaAeropuertos) {

		int numAeropuerto;

		do {

			System.out.println("¿De que aeropuerto desea mirar la compañia?");
			System.out.println("1.-Aeropuerto Privado1" + "\n2.-Aeropuerto Privado2" + "\n3.-Aeropuerto Privado3"
					+ "\n4.-Aeropuerto Publico1" + "\n5.-Aeropuerto Publico2" + "\n6.-Aeropuerto Publico3");

			System.out.println("Introduzca el numero:");
			numAeropuerto = entrada.nextInt();

		} while (numAeropuerto < 1 && numAeropuerto > 6);

		listaAeropuertos[numAeropuerto - 1].mostrarNombreyCompañia();

	}

	/*
	 * VuelosCompañiasAeropuertos
	 * 
	 * Se le pasa por parametros un array de aeropuertos y una array de compañias
	 * 
	 * Se elige aeropuerto y compañia y muestra los vuelos existentes para ello.
	 */

	public static void vuelosCompañiasAeropuerto(Aeropuerto[] listaAeropuertos, Compañia[] listaCompañias) {

		int numAeropuerto;
		int numCompañia;

		do {

			System.out.println("Elige aeropuerto disponible:");
			System.out.println("1.-Aeropuerto Privado1" + "\n2.-Aeropuerto Privado2" + "\n3.-Aeropuerto Privado3"
					+ "\n4.-Aeropuerto Publico1" + "\n5.-Aeropuerto Publico2" + "\n6.-Aeropuerto Publico3");

			System.out.println("Introduzca el numero:");
			numAeropuerto = entrada.nextInt();

		} while (numAeropuerto < 1 && numAeropuerto > 6);

		listaAeropuertos[numAeropuerto - 1].mostrarNombreyCompañia();

		System.out.println();
		System.out.println("Elige la compañia disponible:");
		numCompañia = entrada.nextInt();

		listaCompañias[numCompañia - 1].mostrarVuelos();

	}

}

