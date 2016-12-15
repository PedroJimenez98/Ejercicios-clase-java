/**
 * Máquina tragaperras
 * 
 * @author Pedro Jiménez Brenes
 * 
 */

public class Ejercicio16tema6 {
  public static void main(String[] args) {
    
    int figura = 0;
    int figura1 = 0;
    int figura2 = 0;
    int figura3 = 0;
    
    for (int i = 0; i < 3; i++) {
      
      figura = (int)(Math.random()*5) + 1;
      
      switch (figura) {
        case 1:
        System.out.print("corazón |");
        break;
        
        case 2:
        System.out.print("diamante |");
        break;
        
        case 3:
        System.out.print("herradura |");
        break;
        
        case 4:
        System.out.print("campana |");
        break;
        
        case 5:
        System.out.print("limón |");
        break;
      }
      
      switch (i) {
        case 0:
        figura1 = figura;
        break;
        
        case 1:
        figura2 = figura;
        break;
        
        case 2:
        figura3 = figura;
        break;
      }
    }
    if ((figura1 == figura2) && (figura2 == figura3)) {
      System.out.println("\nEnhorabuena, ha ganado 10 monedas");
    } else if (((figura1 == figura2) && (figura2 != figura3)) || ((figura1 != figura2) && (figura2 == figura3)) || ((figura1 == figura3) && (figura3 != figura2))) {
      System.out.println("\nBien, ha recuperado su moneda");
    } else {
      System.out.println("\nLo siento, ha perdido");
    }
  }
}
