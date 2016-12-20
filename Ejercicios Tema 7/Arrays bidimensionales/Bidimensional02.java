/**
 * Bidimensional 2
 * 
 * @author Pedro Jiménez Brenes
 * 
 */

public class Bidimensional02 {
  public static void main(String[] args) { 
    
    int[][] numeros = new int[4][5];
    int filas, columnas;
    int suma = 0;
    int sumaCol = 0;
    System.out.println("Introduce 20 números por teclado: ");
    
    for (filas = 0; filas < 4; filas ++) {
      for (columnas = 0; columnas < 5; columnas ++) {
        numeros[filas][columnas] = Integer.parseInt(System.console().readLine());
      }
    }
    
    for (filas = 0; filas < 4; filas ++) {
      suma = 0;
      
      for (columnas = 0; columnas < 5; columnas ++) {
        System.out.printf("%5d" , numeros[filas][columnas]);
        suma += numeros[filas][columnas];
      }
      System.out.printf("%5d" , suma);
      System.out.println();
    }
    suma = 0;
    for (columnas = 0; columnas < 5; columnas ++) {
      sumaCol = 0;
      for (filas = 0; filas < 4; filas ++) {
        sumaCol += numeros[filas][columnas];
      }
      suma += sumaCol;
      System.out.printf("%5d" , sumaCol);
    }
    System.out.printf("%5d" , suma);
  }
}
