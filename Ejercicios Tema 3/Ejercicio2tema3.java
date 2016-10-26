/**
 *Conversor euros a pesetas
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio2tema3 {
  public static void main(String[] args) {
    
    String linea;
    
    System.out.print("Escribe un número de euros: ");
    linea = System.console().readLine();
    double euros = Integer.parseInt( linea );
    
    double pesetas = euros * 166.39;
    System.out.println(euros  + " euros equivalen a " + pesetas + " pesetas");
  }
}
