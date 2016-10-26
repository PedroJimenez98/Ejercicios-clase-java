/**
 *Calculo del volumen de un cono
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio9tema3 {
  public static void main(String[] args) {
    
    String linea;
    
    System.out.print("Escribe la altura del cono: ");
    linea = System.console().readLine();
    double h = Integer.parseInt( linea );
    
    System.out.print("Escribe el radio de la base del cono: ");
    linea = System.console().readLine();
    double r = Integer.parseInt( linea );
    
    double volumen = 0.3 * 3.14 * r * r * h;
    System.out.print("El volumen total del cono es: " + volumen);
  }
}
