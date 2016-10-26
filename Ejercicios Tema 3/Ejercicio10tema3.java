/**
 *Conversor de Mb a Kb
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio10tema3 {
  public static void main(String[] args) {
  
    String linea;
    
    System.out.print("Introduce un número de Mb: ");
    linea = System.console().readLine();
    double mb = Integer.parseInt( linea );
    
    double kb = mb * 1024;
    System.out.print(mb + " Mb equivalen a " + kb + " Kb");
  }
}
