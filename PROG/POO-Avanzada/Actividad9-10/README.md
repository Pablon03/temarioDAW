# Actividad 9
Escribe un programa para una biblioteca que contenga libros y revistas.
- Las características comunes que se almacenan tanto para las revistas como para los libros son el código, el título, y el año de publicación. Estas tres características se pasan por parámetro en el momento de crear los objetos.
- Los libros tienen además un atributo prestado. Los libros, cuando se crean, no están prestados.
- Las revistas tienen un número. En el momento de crear las revistas se pasa el número por parámetro.
- Tanto las revistas como los libros deben tener (aparte de los constructores) un método toString() que devuelve el valor de todos los atributos en una cadena de caracteres. También tienen un método que devuelve el año de publicación, y otro el código.
- Para prevenir posibles cambios en el programa se tiene que implementar una interfaz Prestable con los métodos prestar(), devolver() y prestado(). La clase Libro implementa esta interfaz.
- 
# Actividad 10 
Continúa desarrollando la aplicación del ejercicio anterior incluyendo estos dos métodos:
- cuentaPrestados: recibe por parámetro un array de objetos, y devuelve cuántos de ellos están prestados.
- publicacionesAnterioresA: recibe por parámetro un array de Publicaciones y un año, y devuelve cuántas publicaciones tienen fecha anterior al año recibido por
parámetro.
- En el método main(), crear un array de Publicaciones, con 2 libros y 2 revistas, prestar uno de los libros, mostrar por pantalla los datos almacenados en el array y mostrar por pantalla cuántos hay prestados y cuantos hay anteriores a 1990
