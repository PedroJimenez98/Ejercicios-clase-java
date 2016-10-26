/**
 *Conversor pesetas a euros
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio3tema3 {
  public static void main(String[] args) {
    
    String linea;
    
    System.out.print("Introduce un número de pesetas: ");
    linea = System.console().readLine();
    double pesetas = Integer.parseInt( linea );
    
    double euros = pesetas * 0.006;
    System.out.println(pesetas + " pesetas equivalen a " + euros + " euros");
  }
}
