/**
 * nota media
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio7tema4 {
  public static void main (String[] args) {
    
     String linea;
    
    System.out.print("Introduce la primera nota: ");
    linea = System.console().readLine();
    double a = Integer.parseInt( linea );
    
    System.out.print("Introduce la segunda nota: ");
    linea = System.console().readLine();
    double b = Integer.parseInt( linea );
    
    System.out.print("Introduce la tercera nota: ");
    linea = System.console().readLine();
    double c = Integer.parseInt( linea );
    
    double media = (a + b + c) / 3;
    System.out.print("Tu nota media es: " + media);
  }
}
