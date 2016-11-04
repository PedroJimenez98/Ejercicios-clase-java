/**
 *ecuacion de primer grado
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio5tema4 {
  public static void main (String[] args) {
    
    String linea;
    
    System.out.print("Introduce el valor de a: ");
    linea = System.console().readLine();
    double a = Integer.parseInt( linea );
    
    System.out.print("Introduce el valor de b: ");
    linea = System.console().readLine();
    double b = Integer.parseInt( linea );
    
    double x = -b / a;
    
    System.out.print("x tiene el valor de : " + x);
  }
}
