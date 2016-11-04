/**
 *buenos dias, tardes o noches
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio6tema4 {
  public static void main (String[] args) {
    
    System.out.print("Introduce la altura a la que se encuentra el objeto: ");
    String linea = System.console().readLine();
    int h = Integer.parseInt( linea );
    
    double t = Math.sqrt ((2 * h) / 9.81);
    System.out.print("El objeto tarda en caer " + t + " segundos.");
  }
}
