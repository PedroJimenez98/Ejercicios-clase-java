/**
 * array ej 5
 * 
 * @author Pedro Jiménez Brenes
 * 
 */

public class Ejercicio5tema7 {
  public static void main(String[] args) {  
    
    System.out.println("Escribe 10 números por teclado introduciendo enter entre cada uno");
    int[] numeros = new int[10];
    int minimo = Integer.MAX_VALUE;
    int maximo = Integer.MIN_VALUE;
    
    
    for (int i = 0; i < 10; i++) {
      numeros[i] = Integer.parseInt(System.console().readLine());
      
      if (numeros[i] < minimo) {
        minimo = numeros[i];
      } 
      if(numeros[i] > maximo) {
        maximo = numeros[i];
      }
    }
    
    for (int i = 0; i < 10; i++) {
      System.out.print(numeros[i]);
      
      if (numeros[i] == maximo) {
        System.out.print(" máximo");
      }
      if (numeros[i] == minimo) {
        System.out.print(" mínimo");
      }
      System.out.println();
    }
  }
}
