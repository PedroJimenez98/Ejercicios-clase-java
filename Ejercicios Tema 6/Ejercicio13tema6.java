/**
 * Tirada de dos dados hasta que sean iguales
 * 
 * @author Pedro Jiménez Brenes
 * 
 */

public class Ejercicio13tema6 {
  public static void main(String[] args) {
    
    int dado1 = 1;
    int dado2 = 0;
    
    while (dado1 != dado2) {
      
      dado1 = (int)(Math.random()*6) + 1;
      dado2 = (int)(Math.random()*6) + 1;
      
      System.out.println(dado1 + " " + dado2);
    }
  }
}
