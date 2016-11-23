/**
 * 10 lineas de carácteres aleatorios
 * 
 * @author Pedro Jiménez Brenes
 * 
 */

public class Ejercicio10tema6 {
  public static void main(String[] args) {
    
    String caracter = "";
    int linea = 0;
    int x = 0;
    
    for (int i = 0; i < 10; i++) {
      
      x = (int)(Math.random()*6) + 1;
      
      switch (x) {
        case 1:
        caracter = "*";
        break;
        
        case 2:
        caracter = "-";
        break;
        
        case 3:
        caracter = "=";
        break;
        
        case 4:
        caracter = ".";
        break;
        
        case 5:
        caracter = "|";
        break;
        
        case 6:
        caracter = "@";
        break;
      }
      
      linea = (int)(Math.random()*40) + 1;
      
      while (linea > 0) {
        System.out.print(caracter);
        linea --;
      }
      System.out.println();
    }
  }
}
