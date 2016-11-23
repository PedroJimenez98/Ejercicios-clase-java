/**
 * quiniela con distintas posibilidades
 * 
 * @author Pedro Jiménez Brenes
 * 
 */

public class Ejercicio8tema6 {
  public static void main(String[] args) {
  
    int x = 0;
    int columna = 3;
    
    for(int i = 1; i < 16; i++) {
      System.out.printf("%4d. |", i);
      
      if (i == 15) {
        columna = 1;
      }
      
      for (int a = 1; a <= columna; a++) {
        
        x = (int)(Math.random()*6) +1;
        
        switch (x) {
          case 1:
          System.out.print("1  |");
          break;
          
          case 2:
          System.out.print("1  |");
          break;
          
          case 3:
          System.out.print("1  |");
          break;
          
          case 4:
          System.out.print(" X |");
          break;
          
          case 5:
          System.out.print(" X |");
          break;
          case 6:
          System.out.print("  2|");
          break;
        }
      }
      System.out.println();
    }
  }
}
