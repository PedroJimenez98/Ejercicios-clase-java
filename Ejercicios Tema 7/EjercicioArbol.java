/**
 * arbol de navidad
 * 
 * @author Pedro Jiménez Brenes
 * 
 */

public class EjercicioArbol {
  public static void main(String[] args) { 
    
    int altura = 0;
    int espacios = 0;
    int follaje = 1;
    
    System.out.println("Escribe la altura del arbol (mínimo 4):");
    altura = Integer.parseInt(System.console().readLine());
    
    for (int i = 0; i < altura; i++) {
      //Pinta la estrella
      if (i == 0) {
        while(espacios < altura -2) {
          System.out.print(" ");
          espacios ++;
        }
        System.out.print("*");
      }
      //Pinta espacios
      for ( i = 0; i < altura; i++){
        espacios = 0;
        while(espacios < altura-2) {
          System.out.print(" ");
          espacios++;
        }
        for (i = 0; i < follaje; i++) {
          System.out.print("^");
          follaje += 2;
        }
        altura --;
      }
    }
  }
}
