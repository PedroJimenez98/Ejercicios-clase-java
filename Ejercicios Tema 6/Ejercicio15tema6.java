/**
 * Generador de canciones
 * 
 * @author Pedro Jiménez Brenes
 * 
 */

public class Ejercicio15tema6 {
  public static void main(String[] args) {
    
    int repeticiones = 0;
    int numero = 0;
    
    repeticiones = (int)(Math.random()*6) +1;
    
    while (repeticiones > 1) {
      
      for (int i = 0; i < 4; i++) {
        numero = (int)(Math.random()*7) + 1;
        
        switch (numero) {
          case 1:
          System.out.print("Do ");
          break;
          
          case 2:
          System.out.print("Re ");
          break;
          
          case 3:
          System.out.print("Mi ");
          break;
          
          case 4:
          System.out.print("Fa ");
          break;
          
          case 5:
          System.out.print("Sol ");
          break;
          
          case 6:
          System.out.print("La ");
          break;
          
          case 7:
          System.out.print("Si ");
          break;
          default:
        }
      }
      System.out.print("|");
      repeticiones --;
    }
    System.out.print("|");
  }
}
