import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    // Numerical input
    int sec = myObj.nextInt();

    // Output input by user
    System.out.println("Empezamos en: " + sec + " segundos");      
    int min1 = sec / 60;
    int min2 = sec % 60;
    int hor1 = min1 / 60;
    int hor2 = min1 % 60;
    int dia1 = hor1 / 24;
    int dia2 = hor1 % 24;
    int ano1 = dia1 / 365;
    int ano2 = dia1 % 365;
    System.out.println(min2 + " segundos");
    System.out.println(hor2 + " minutos");
    System.out.println(dia2 + " horas"); 
    System.out.println(ano2 + " días");
    System.out.println(ano1 + " años");  
  }
}
