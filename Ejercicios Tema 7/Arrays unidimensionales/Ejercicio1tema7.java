/**
 * array ej 1
 * 
 * @author Pedro Jiménez Brenes
 * 
 */

public class Ejercicio1tema7 {
  public static void main(String[] args) {
    
    int[] n = new int[12];
    
    n[0] = 39;
    n[1] = -2;
    n[2] = 0;
    n[3] = 0;
    n[4] = 0;
    n[5] = 0;
    n[6] = 14;
    n[7] = 0;
    n[8] = 5;
    n[9] = 120;
    n[10] = 0;
    n[11] = 0;
    
    
    for (int i = 0; i < 12; i ++) {
      
      System.out.printf("%5d", i);
      
    }
    System.out.println();
    for (int i = 0; i < 12; i ++) {
      System.out.printf("%5d", n[i]);
    }
  }
}
