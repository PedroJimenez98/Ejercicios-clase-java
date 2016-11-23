/**
 * Carácteres aleatorios a lo matrix
 * 
 * @author Pedro Jiménez Brenes
 * 
 */

public class Ejercicio12tema6 {
  public static void main(String[] args) {
    
    int n = 0;
    char p;
    
    while(true) {
      
      n = (int) (Math.random()*94)+33;
      
      p = (char) n;
      
      System.out.print(p);
    }
  }
}
