/**
 *buenos dias, tardes o noches
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio2tema4 {
  public static void main (String[] args) {
    
    System.out.println("¿Qué hora es? ");
    String linea = System.console().readLine();
    int h = Integer.parseInt( linea );
    
    if ((h >= 6) && (h <= 12)) {
      System.out.println("Buenos dias");
    }
    
    if ((h >= 13) && (h <= 20)) {
      System.out.println("Buenas tardes");
    }
    
    if (((h >= 21) && (h < 24)) || ((h >= 0) && (h <= 5))){
      System.out.println("Buenas noches");
    }
  }
}
    
