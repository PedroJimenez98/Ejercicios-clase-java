/**
 * array ej 3
 * 
 * @author Pedro Jiménez Brenes
 * 
 */

public class Ejercicio3tema7 {
  public static void main(String[] args) {  
    
    System.out.println("Introduce numeros enteros pulsando enter entre cada uno de ellos");
    int[] numeros = new int[10];
    
    for (int i = 0; i < 10; i++) {
      
      numeros[i] = Integer.parseInt(System.console().readLine());
    }
    for (int i = 9; i >= 0; i--) {
      System.out.print(numeros[i] + " ");
    }
  }
}
