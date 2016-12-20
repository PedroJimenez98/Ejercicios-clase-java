/**
 * Ejercicio 8
 * 
 * @author Pedro Jiménez Brenes
 * 
 */

public class Ejercicio8tema7 {
  public static void main(String[] args) { 
    
    int[] temperatura = new int[12];
    System.out.println("Introduce la temperatura media de cada mes del año");
    
    for (int i = 0; i < 12; i ++) {
      
      temperatura[i] = Integer.parseInt(System.console().readLine());
    }
    for (int i = 0; i < 12; i++) {
      while (temperatura[i] > 0) {
        System.out.print("*");
        temperatura[i] --;
      
      }
      System.out.println();
    }
    
  }
}
