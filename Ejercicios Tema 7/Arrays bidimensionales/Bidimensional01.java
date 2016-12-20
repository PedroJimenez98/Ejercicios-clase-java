/**
 * Bidimensional 1
 * 
 * @author Pedro Jiménez Brenes
 * 
 */

public class Bidimensional01 {
  public static void main(String[] args) { 
    
    int[][] num = new int[3][6];
    String[] array = new String[1];
    int fila;
    int columna;
    
    System.out.print("Array num");
    for (int i = 0; i < 6; i ++) {
      System.out.printf("%10s" + i, "Columna");
    }
    System.out.println();
    
    num[0][1] = 30;
    num[0][2] = 2;
    num[0][5] = 5;
    num[1][0] = 75;
    num[2][2] = -2;
    num[2][3] = 9;
    num[2][5] = 11;
    
    
    for (fila = 0; fila < 3; fila ++) {
      System.out.print("Fila " + fila);
      for (columna = 0; columna < 6; columna ++) {
        System.out.printf("%11d" , num[fila][columna]);
      }
      System.out.println();
    }
  }
}
