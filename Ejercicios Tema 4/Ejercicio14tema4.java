/**
 *Número par y/o divisible entre 5
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio14tema4 {
  public static void main (String[] args) {
    
    String linea;
    
    System.out.print("Introduce un número: ");
    linea = System.console().readLine();
    double n = Double.parseDouble( linea );
    
    if (n %2 == 0) {
      System.out.println("El número es par");
    }
    if (n %5 == 0) {
      System.out.println("El número es divisible entre 5");
    }
    if ((n %2 != 0) && (n %5 != 0)) {
      System.out.println("El número no es par ni divisible entre 5");
    }
  }
}
