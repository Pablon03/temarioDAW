import java.util.Random;
import java.util.Scanner;

public class Actividad1 {
	public static final int NUMERO_ALUMNOS = 8;
	public static final int NOTA_LIMITE_APROBADO = 5;
	public static final int NOTA_MAXIMA = 10;
	public static final String[] ASIGNATURAS = { "PROGRAMACION", "BASE DE DATOS", "LENGUAJES DE MARCA" };
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int matrizNotas[][] = new int[NUMERO_ALUMNOS][ASIGNATURAS.length];
		String asignatura;

		//RELLENA LA MATRIZ PARA PONER LAS NOTAS
		cargarNotasMatriz(matrizNotas);
		
		//MUESTRA LA MATRIZ DE NOTAS
		imprimirNotas(matrizNotas);

		// MUESTRA EL NÚMERO DE SUSPENSOS POR CADA ALUMNO
		numeroDeSuspensosPorAlumno(matrizNotas);

		// MUESTRA LA NOTA MEDIA DE LA ASIGNATURA
		System.out.println("Introduce asignatura:");
		asignatura = teclado.nextLine();
		notaMediaDeAsignatura(matrizNotas, asignatura);

		//MUESTRA LAS SUSPENSAS DE CADA UNO
		alumnosConSuspensas(matrizNotas);
		
		//MEJOR NOTA DEL ALUMNO
		mejorNotaAlumno(matrizNotas);
		
	}

	/**
	 * Carga los datos de la matriz con notas aleatorias entre 0 y 10
	 * 
	 * @param matrizNotas
	 */
	private static void cargarNotasMatriz(int matrizNotas[][]) {
		int indiceAlumno, indiceAsignatura;

		Random serie = new Random();
		for (indiceAlumno = 0; indiceAlumno < matrizNotas.length; indiceAlumno++) {

			for (indiceAsignatura = 0; indiceAsignatura < matrizNotas[0].length; indiceAsignatura++) {

				matrizNotas[indiceAlumno][indiceAsignatura] = serie.nextInt(NOTA_MAXIMA + 1); // DE
																								// 0
																								// A
																								// NOTA_MAXIMA
			}
		}
	}

	/**
	 * Imprime las notas por pantalla
	 * 
	 * @param matrizNotas
	 */
	private static void imprimirNotas(int matrizNotas[][]) {
		int indiceAlumno, indiceAsignatura;

		for (int i = 0; i < ASIGNATURAS.length; i++) {
			System.out.print("\t" + ASIGNATURAS[i]);
		}

		System.out.println();
		for (indiceAlumno = 0; indiceAlumno < matrizNotas.length; indiceAlumno++) {
			System.out.print("Alumno " + (indiceAlumno + 1) + "    ");
			for (indiceAsignatura = 0; indiceAsignatura < matrizNotas[0].length; indiceAsignatura++) {
				System.out.print(matrizNotas[indiceAlumno][indiceAsignatura]);
				System.out.print("\t\t");
			}
			System.out.println();
		}

	}

	/**
	 * Realiza un listado donde aparezca para cada alumno cuantos suspensos tiene
	 */
	private static void numeroDeSuspensosPorAlumno(int matrizNotas[][]) {
		System.out.println("\tAsignaturas Suspensas");
		for (int indiceAlumno = 0; indiceAlumno < matrizNotas.length; indiceAlumno++) {
			int contador = 0;
			System.out.print("Alumno "+ (indiceAlumno + 1) + "   ");
			for (int indiceAsignatura = 0; indiceAsignatura < matrizNotas[0].length; indiceAsignatura++) {
				if (matrizNotas[indiceAlumno][indiceAsignatura] < NOTA_LIMITE_APROBADO) {
					contador ++;
				}
			}
			System.out.print(contador);
			System.out.println();
		}

	}

	/**
	 * @param matrizNotas
	 * @param asignatura
	 */
	private static void notaMediaDeAsignatura(int matrizNotas[][], String asignatura) {
		int contador = 0;
		for (int i = 0; i < ASIGNATURAS.length; i++) {
			String asignaturaComprobar = ASIGNATURAS[i];
			contador ++;
			if (asignaturaComprobar.equalsIgnoreCase(asignatura)) {
				System.out.println("La asignatura que ha escrito existe");
				break;
			} else if (contador == 3) {
				System.out.println("La asignatura que ha escrito no existe");
				contador = 15;
				break;
			}
		}
		
		if (contador >= 1 || contador <= 3) {
			double media = 0;
			int suma = 0;
			for (int indiceAlumno = 0; indiceAlumno < matrizNotas.length; indiceAlumno++) {
				int numero = matrizNotas[indiceAlumno][contador-1];
				suma += numero;
				media = (double)suma/NUMERO_ALUMNOS;
			}
			if (contador == 1) {
				System.out.println("La media de PROGRAMACION es " + media);
			} else if (contador == 2) {
				System.out.println("La nota media de BASE DE DATOS es " + media);
			} else {
				System.out.println("La nota media de LENGUAJE DE MARCAS es " + media);
			}
		}

	}
	
	private static void alumnosConSuspensas(int matrizNotas[][]) {
		//VARIABLES
		int suspCero = 0, suspUno = 0, suspDos = 0, suspTres = 0;
		
		//RASTREADOR DE SUSPENSOS
		for (int indiceAlumno = 0; indiceAlumno < matrizNotas.length; indiceAlumno++) {
			int contador = 0;
			for (int indiceAsignatura = 0; indiceAsignatura < matrizNotas[0].length; indiceAsignatura++) {
				if (matrizNotas[indiceAlumno][indiceAsignatura] < NOTA_LIMITE_APROBADO) {
					contador ++;
				}
			}
			if (contador == 0) {
				suspCero ++;
			} else if (contador == 1) {
				suspUno ++;
			} else if (contador == 2) {
				suspDos ++;
			} else if (contador == 3) {
				suspTres ++;
			}
		}
		
		//MUESTRA MENSAJE
		System.out.println();
		System.out.println("Hay " + suspCero + " con 0 asignaturas suspensas");
		System.out.println("Hay " + suspUno + " con 1 asignaturas suspensas");
		System.out.println("Hay " + suspDos + " con 2 asignaturas suspensas");
		System.out.println("Hay " + suspTres + " con 3 asignaturas suspensas");
	}
	
	private static void mejorNotaAlumno(int[][] matrizNotas) {
		
		// INDICA Y COMPRUEBA
		System.out.println("¿Qué alumno quiere comprobar?");
		int numAlumno = teclado.nextInt();
		if (numAlumno < 1 || numAlumno > 8) {
			System.out.println("Este alumno no existe");
		}
		
		//ENTRA DENTRO DEL ALUMNO
		int nota = 5, notaActualizada, posicionNota = 0, posicionNotaBuena;
		for (int i = 0; i < matrizNotas[numAlumno-1].length; i++) {
			notaActualizada = matrizNotas[numAlumno-1][i];
			posicionNotaBuena = i;
			if (nota < notaActualizada) {
				nota = notaActualizada;
				posicionNota = posicionNotaBuena;
			}
		}
		
		//MOSTRAMOS EL TEXTO
		if (posicionNota == 0) {
			System.out.println("Alumno "+numAlumno +": La mejor nota es " + nota + " en PROGRAMACION");
		} else if (posicionNota == 1) {
			System.out.println("Alumno "+numAlumno +": La mejor nota es " + nota + " en BASE DE DATOS");
		} else if (posicionNota == 2){
			System.out.println("Alumno "+numAlumno +": La mejor nota es " + nota + " en LENGUAJE DE MARCAS");
		}
		
		
	}

}
