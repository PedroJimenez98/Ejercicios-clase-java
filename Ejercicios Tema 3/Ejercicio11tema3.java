/**
 *Conversor de Kb a Mb
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio11tema3 {
  public static void main(String[] args) {
  
    String linea;
    
    System.out.print("Introduce un número de Kb: ");
    linea = System.console().readLine();
    double kb = Integer.parseInt( linea );
    
    double mb = kb * 0.001;
    System.out.print(kb + " Kb equivalen a " + mb + " Mb");
  }
}
