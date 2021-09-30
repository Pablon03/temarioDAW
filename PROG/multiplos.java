import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    // Numerical input
    int num = myObj.nextInt();

    // Output input by user
    System.out.println("El número introducido es: " + num );      
    if (num % 2 == 0 && num % 3==0) {
  System.out.println("El número introducido es múltiplo de 2 y de 3");
} else {
        if (num % 3 == 0){
            System.out.println("El número es múltiplo de 3");
        } else  if(num %2==0){
            System.out.println("El número introducido es múltiplo de 2");
        } else {
            System.out.println("El número introducido no es múltiplo de 2 ni de 3");
        }
} 
  }
}
