package Actividad9;

public class Principal {

	public static void main(String[] args) {
		
		Publicaciones listaPublicaciones[] = new Publicaciones[4];
		listaPublicaciones[0] = new Libros("1685R", "Mktg Digital", 2021);
		listaPublicaciones[1] = new Libros("1234Q", "El perro y el gato", 2015);
		listaPublicaciones[2] = new Revistas("123456W", "Rompe la barrera del NO", 2010, 1);
		listaPublicaciones[3] = new Revistas("68546P", "Vende como el mejor", 2020, 2);
		
		//Transformamos a libro y lo prestamos
		Libros i = (Libros)listaPublicaciones[0];
		i.prestar();
		
		//Mostramos el array
		for (int j = 0; j < listaPublicaciones.length; j++) {
			System.out.println(listaPublicaciones[j]);
		}
		
		//¿Cuántos hay prestados?
		System.out.println("Hay " + cuantosPrestados(listaPublicaciones) + " publicaciones prestadas"); 
		
		// Publicacion anterior A
		int resultado = publicacionesAnterioresA(1990, listaPublicaciones);
		System.out.println("Hay " + resultado + " publicaciones anteriores a " + 1990);
		
		
	}
	
	public static int publicacionesAnterioresA(int anio, Publicaciones publicaciones[]) {
		int sumaAnteriores = 0;
		
		for (int i = 0; i < publicaciones.length; i++) {
			if (publicaciones[i].getAnioPublicacion() < anio) {
				sumaAnteriores ++;
			}
		}
		
		return sumaAnteriores;
	}
	
	public static int cuantosPrestados(Object[] listaPublicaciones) {
		int prestados = 0;
		for (int i = 0; i < listaPublicaciones.length; i++) {
			if (listaPublicaciones[i] instanceof Prestable && ((Prestable)listaPublicaciones[i]).prestado()) {
				prestados ++;
			}
		}
		return prestados;
	}
}
