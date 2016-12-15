/**
 * Pecera
 * 
 * @author Pedro Jiménez Brenes
 * 
 */

public class Ejercicio17tema6 {
  public static void main(String[] args) {
    
    int altura = 0;
    int ancho = 0;
    
    
    System.out.print("Introduzca la altura de la pecera (mínimo 4): ");
    altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el ancho de la pecera (mínimo 4): ");
    ancho = Integer.parseInt(System.console().readLine());
    
    int altoPez = (int)(Math.random()*altura) - 3; 
    int anchoPez = (int)(Math.random()*ancho) - 3;
    
    for (int i = 0; i < altura; i++) {     
        for (int filas = 0; filas < ancho; filas ++) {
          if (i == 0 || i == (altura - 1 )  || filas == 0 || filas == (ancho - 1 )){
          System.out.print("*");
        }else {
        System.out.print(" ");
        if ((altoPez == i) && (anchoPez == filas)) {
          System.out.print("&");
        }
      }
        
      }
      System.out.println();
    }
    
  }
}
