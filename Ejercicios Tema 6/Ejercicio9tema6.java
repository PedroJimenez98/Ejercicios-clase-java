/**
 * números pares entre 0 y 100
 * 
 * @author Pedro Jiménez Brenes
 * 
 */

public class Ejercicio9tema6 {
  public static void main(String[] args) {
    
    int n = 0;
    int cantidad = 0;
    
    while (n != 24) {
      
      n = (int)(Math.random()*100) + 1;
      
      if (n %2 == 0) {
        System.out.println(n);
        cantidad ++;
      }
    }
    System.out.println("Se han escrito " + cantidad + " números");
  }
}
