package Actividad6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Principal {

	static final String PATRON = "[A-Z]{2}.* [A-Z]{2}.* [A-Z]{2}.* [12][A-Z]{3}";
	public static void main(String[] args) {
		
		try(	FileReader fl = new FileReader("EjemploFicheroEjercicio6.txt");
				BufferedReader br = new BufferedReader(fl);){
			
			/*Leemos la linea*/
			String linea = br.readLine();
			
			while(linea != null) {
				
				/*Si entra el patrón es correcto*/
				if (linea.matches(PATRON)) {
					
					/*Dividimos la linea en un array*/
					String[] arrayLinea = linea.split(" ");
					
					/*Cogemos los datos*/
					String nombre = arrayLinea[0];
					String primerApellido = arrayLinea[1];
					String segundoApellido = arrayLinea[2];
					String curso = arrayLinea[3];
					
					File f1 = new File(curso);
					
					/*Creamos la carpeta curs y la carpeta alumno*/
					if (!f1.exists()) {
						f1.mkdir();
						
						File carpetaAlumno = new File(f1 + "/" + primerApellido+segundoApellido+nombre);
						carpetaAlumno.mkdir();
						
						File txtCurso = new File(f1 + "/" +curso + ".txt");
						escribirTXT(txtCurso, nombre);
						
					} else {
						/*Si el curso ya existe solo crea la carpeta alumno*/
						File carpetaAlumno = new File(curso + "/" + primerApellido+segundoApellido+nombre);
						
						if (!carpetaAlumno.exists()) {
							carpetaAlumno.mkdir();
							
							File txtCurso = new File(f1 + "/" + curso + ".txt");
							escribirTXT(txtCurso, nombre);
						}
					}
				}
				
				/*Leemos la siguiente linea*/
				linea = br.readLine();
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo");
		} catch (IOException e) {
			System.out.println("Error");
		}
	}
	private static void escribirTXT(File txtCurso, String nombre) {
		
		try(	FileWriter fw = new FileWriter(txtCurso, true);
				PrintWriter pw = new PrintWriter(fw)
				){
			
			
			pw.write(nombre + "\n");
			
		} catch (IOException e) {
			System.out.println("Error");
		}
		
	}

}
