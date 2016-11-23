/**
 * 20 notas aleatorias
 * 
 * @author Pedro Jiménez Brenes
 * 
 */

public class Ejercicio11tema6 {
  public static void main(String[] args) {
    
    int nota = 0;
    int sus = 0;
    int suf = 0;
    int bien = 0;
    int not = 0;
    int sobr = 0;
    
    for (int i = 0; i < 21; i++) {
      
      nota = (int)(Math.random()*11);
      
      switch (nota) {
        case 1:
        System.out.println("Suspenso");
        sus ++;
        break;
        
        case 2:
        System.out.println("Suspenso");
        sus ++;
        break;
        
        case 3:
        System.out.println("Suspenso");
        sus ++;
        break;
        
        case 4:
        System.out.println("Suspenso");
        sus ++;
        break;
        
        case 5: 
        System.out.println("Suficiente");
        suf ++;
        break;
        
        case 6:
        System.out.println("Bien");
        bien ++;
        break;
        
        case 7:
        System.out.println("Notable");
        not ++;
        break;
        
        case 8:
        System.out.println("Notable");
        not ++;
        break;
        
        case 9:
        System.out.println("Sobresaliente");
        sobr ++;
        break;
        
        case 10:
        System.out.println("Sobresaliente");
        sobr ++;
        break;
      }
    }
    System.out.println("Hay " + sus + " suspensos, " + suf + " suficientes, " + bien + " bien, " + not + " notables y " + sobr + " sobresalientes.");
  }
}
