package Actividad6;

public class Actividad6 {

	public static void main(String[] args) {
		
		//Creación de la matriz
		int matriz1010[][] = new int[10][10];
		
		matriz1010 = rellenarMatriz(matriz1010);
		
		//Recorrido diagonal
		int maximo = 0;
		int minimo = 1000;
		int media = 0;
		
		for (int filaColumna = 0; filaColumna < 10; filaColumna++) {
			
			//Sumamos a la media
			media += matriz1010[filaColumna][filaColumna];
			
			// Ponemos maximo
			if (matriz1010[filaColumna][filaColumna] > maximo) {
				maximo = matriz1010[filaColumna][filaColumna];
			}
			
			// Ponemos minimo
			if (matriz1010[filaColumna][filaColumna] < minimo) {
				minimo = matriz1010[filaColumna][filaColumna];
			}
		}
		
		double mediaFinal = media / 10;
		System.out.println("Número máximo: " + maximo);
		System.out.println("Número mínimo: " + minimo);
		System.out.println("Media: " + mediaFinal);
		
	}

	public static int[][] rellenarMatriz(int[][] matriz){
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random()*(301-200)+200);
				System.out.printf("%5d", matriz[i][j]);
			}
			System.out.println("");
		}
		return matriz;
	}
	
}
