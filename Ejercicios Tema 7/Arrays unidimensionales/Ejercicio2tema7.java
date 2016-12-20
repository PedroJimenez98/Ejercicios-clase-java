/**
 * array ej 2
 * 
 * @author Pedro Jiménez Brenes
 * 
 */

public class Ejercicio2tema7 {
  public static void main(String[] args) {  
    
    char[] simbolo = new char[10];
    
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[2] = ' ';
    simbolo[3] = ' ';
    simbolo[4] = '@';
    simbolo[5] = ' ';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'Q';
    simbolo[9] = ' ';
    
    for (int i = 0; i < 10; i ++) {
      
      System.out.printf("%5d", i);
      
    }
    System.out.println();
    for (int i = 0; i < 10; i ++) {
      System.out.printf("%5s", simbolo[i]);
    }
  }
}
