package Actividad7;

import java.util.Iterator;

/*
 * 
 * Realiza un programa que muestre por pantalla una matriz de 9 filas por 9 columnas
 * rellena con números aleatorios entre 500 y 900. A continuación, el programa debe
 * mostrar los números de la diagonal que va desde la esquina inferior izquierda a la
 * esquina superior derecha, así como el máximo, el mínimo y la media de los números que
 * hay en esa diagonal.
 * Programado por instagram.com/Pablon03_
 * 
 */

public class Actividad7 {

	public static void main(String[] args) {
		
		//Creamos matriz
		int matriz99[][] = new int[9][9];
		
		//Rellenamos Matriz
		matriz99 = rellenarMatriz(matriz99);
		
		int media = 0;
		int maximo = 0;
		int minimo = 1000;
		int contador = 0;
		
		//Recorremos la diagonal y comprobamos
		for (int i = 8; i > 0; i--) {
			
			//Cogemos el numero
			int numero = matriz99[i][contador];
			
			//Comprobamos los maximos
			if (numero > maximo) {
				maximo = numero;
			}
			
			//Comprobamos los minimos
			if (numero < minimo) {
				minimo = numero;
			}
			
			//Sumamos a la media
			media += numero;
			
			//Actualizamos contador
			contador ++;
		}
		
		double mediaFinal = media / 9;
		System.out.println("Número máximo: " + maximo);
		System.out.println("Número mínimo: " + minimo);
		System.out.println("Media: " + mediaFinal);

		

	}
	
	public static int[][] rellenarMatriz(int[][] matriz99){
		
		for (int fila = 0; fila < matriz99.length; fila++) {
			for (int columna = 0; columna < matriz99.length; columna++) {
				matriz99[fila][columna] = (int) (Math.random()*(901-500)+500);
				System.out.printf("%5d", matriz99[fila][columna]);
			}
			System.out.println("");
		}
		
		return matriz99;
	}

}
