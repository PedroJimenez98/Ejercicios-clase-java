/**
 * nota media 
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio8tema4 {
  public static void main (String[] args) {
    
     String linea;
    
    System.out.print("Introduce la primera nota: ");
    linea = System.console().readLine();
    double a = Integer.parseInt( linea );
    
    System.out.print("Introduce la segunda nota: ");
    linea = System.console().readLine();
    double b = Integer.parseInt( linea );
    
    System.out.print("Introduce la tercera nota: ");
    linea = System.console().readLine();
    double c = Integer.parseInt( linea );
    
    double media = (a + b + c) / 3;
    
    if (media <5) {
      System.out.print("Tu nota media es " + media + ", insuficiente");
    }
    if  ((media >=5) && (media < 6)) {
      System.out.print("Tu nota media es " + media + " ,suficiente");
    }
    if ((media >= 6) && (media < 7)) {
      System.out.print("Tu nota media es " + media + " ,bien");
    }
    if((media >= 7) && (media < 9)) {
      System.out.print("Tu nota media es " + media + " ,notable");
    }
    if((media >= 8) && (media <= 10)) {
      System.out.print("Tu nota media es " + media + " ,sobresaliente");
    }
  }
}
