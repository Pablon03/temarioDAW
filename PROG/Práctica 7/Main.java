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
		AeropuertoPublico apub1 = new AeropuertoPublico("AeropuertoPrivado4", "Ciudad4", "Pais4", 1500);
		AeropuertoPublico apub2 = new AeropuertoPublico("AeropuertoPrivado5", "Ciudad5", "Pais5", 2500);
		AeropuertoPublico apub3 = new AeropuertoPublico("AeropuertoPrivado6", "Ciudad6", "Pais6", 3500);

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
			tratarMenu(accion, listaAeropuertos);

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

	public static void tratarMenu(int accion, Aeropuerto[] listaAeropuertos) {

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
			
			break;
			
		case 5:
			break;
			
		case 6:
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
		for(int i=0;i<listaAeropuertos.length;i++) {
			if(listaAeropuertos[i] instanceof AeropuertoPrivado) {
				System.out.println(listaAeropuertos[i].mostrarAeropuertos());
			}	
		}
		System.out.println();
		System.out.println("Aeropuestos Publicos");
		for(int i=0;i<listaAeropuertos.length;i++) {
			if(listaAeropuertos[i] instanceof AeropuertoPublico) {
				System.out.println(listaAeropuertos[i].mostrarAeropuertos());
			}
		}
	}

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
	
	public static void listaCompañiasAeropuerto(Aeropuerto[] listaAeropuertos) {

		int numAeropuerto;

		do {

			System.out.println("¿De que aeropuerto desea mirar la compañia?");
			System.out.println("1.-Aeropuerto Privado1" + "\n2.-Aeropuerto Privado2" + "\n3.-Aeropuerto Privado3"
					+ "\n4.-Aeropuerto Publico1" + "\n5.-Aeropuerto Publico2" + "\n6.-Aeropuerto Publico3");

			System.out.println("Introduzca el numero:");
			numAeropuerto = entrada.nextInt();

		} while (numAeropuerto < 1 && numAeropuerto > 6);

		System.out.println(listaAeropuertos[numAeropuerto - 1].mostrarNombreyCompañia());

	}
	
	

}
