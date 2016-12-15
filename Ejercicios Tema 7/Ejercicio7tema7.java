/**
 * array ej 7
 * 
 * @author Pedro Jiménez Brenes
 * 
 */

public class Ejercicio7tema7 {
  public static void main(String[] args) { 
    
    int[] numero = new int[100];
    
    
    for (int i = 0; i < 100; i++) {
      
      numero[i] = (int)(Math.random()*21);
      System.out.print(numero[i] + " ");
    }
    System.out.println("\nEscribe dos números");
    int n1 = Integer.parseInt(System.console().readLine());
    int n2 = Integer.parseInt(System.console().readLine());
    
    for (int i = 0; i < 100; i++) {
      if (numero[i] == n1) {
        numero[i] = n2;
      }
    }
    for (int i = 0; i < 100; i++) {
      System.out.print(numero[i] + " ");
    }
  }
}
