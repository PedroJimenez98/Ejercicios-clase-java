/**
 * array ej 4
 * 
 * @author Pedro Jiménez Brenes
 * 
 */

public class Ejercicio4tema7 {
  public static void main(String[] args) { 
    
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    
    for (int i = 0; i < 20; i++) {
      numero[i] = (int)(Math.random()*101);
    }
    
    for (int i = 0; i < 20; i++) {
      cuadrado[i] = numero[i] * numero[i];
    }
    
    for (int i = 0; i < 20; i++) {
      cubo[i] = numero[i] * numero[i] * numero[i];
    }
    
    for (int i = 0; i < 20; i++) {
      System.out.printf("%6d " + " " + "%6d " + " " + "%6d ", numero[i], cuadrado[i], cubo[i]);
      System.out.println();
    }
  }
}
