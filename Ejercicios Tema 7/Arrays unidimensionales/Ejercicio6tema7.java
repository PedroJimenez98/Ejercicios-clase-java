/**
 * array ej 6
 * 
 * @author Pedro Jiménez Brenes
 * 
 */

public class Ejercicio6tema7 {
  public static void main(String[] args) { 
    
    System.out.println("Escribe 15 números introduciendo ENTER entre cada uno.");
    
    int[] numero = new int[15];
    int j = 0;
    
    for (int i = 0; i < 15; i ++) {
      
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    numero[1] = numero[0];
    for (int i = 14; i > 0; i--) {
      j = i-1;
      
      if ((i != 14) && (i != 1)) {
        numero[i] = numero[j];
      } if (i == 14) {
        numero[0] = numero[i];
        numero[i] = numero[j];
      }
    }
    for (int i = 0; i < 15; i++) {
      System.out.print(numero [i] + " ");
    }
  }
}
