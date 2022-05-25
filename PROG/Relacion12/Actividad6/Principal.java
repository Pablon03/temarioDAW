package Actividad6;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Principal {

	static Scanner sc = new Scanner(System.in);
	private static final String PATRON = "([A-Z]{2}.* |[A-Z]{2}.* [A-Z]{2}.*)[A-Z]{2}.* [A-Z]{2}.* [1-2][A-Z]{3}";
	public static void main(String[] args) {
		
		System.out.println("Indica el nombre de un archivo (Sin extensión)");
		String nombre = sc.nextLine();
		
		crearCarpetas(nombre);
	}
	
	private static void crearCarpetas(String nombre) {
		
		try(FileReader fr = new FileReader(nombre+".txt");
				BufferedReader br = new BufferedReader(fr)){
			
			String linea;
			linea = br.readLine();
			String[] arrayLineas;
			
			while(linea != null) {
				if (linea.matches(PATRON)) {
					System.out.println(linea + " : Coincide con el patrón");
					
					/*Creamos carpeta del curso*/
					arrayLineas = linea.split(" ");
					File comprobamosCurso = new File(arrayLineas[arrayLineas.length-1]);
					
					if (!comprobamosCurso.exists()) {
						comprobamosCurso.mkdir();
						File fichero = new File(arrayLineas[arrayLineas.length-1]+"\\"+arrayLineas[arrayLineas.length-1]+".txt");
						fichero.createNewFile();
					}
					
					/*Creamos carpetas de los alumnos*/
					String nombreCarpetaAlumno = arrayLineas[1]+arrayLineas[2]+arrayLineas[0];
					File comprobamosNombreAlumno = new File(arrayLineas[arrayLineas.length-1]+"\\"+nombreCarpetaAlumno);
					if (!comprobamosNombreAlumno.exists()) {
						comprobamosNombreAlumno.mkdir();
						
					}
					
				} else {
					System.out.println(linea + " : No coincide con el patrón");
				}
				linea = br.readLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
