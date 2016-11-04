/**
 *Pirámide
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio15tema4 {
  public static void main (String[] args) {
    
    String linea;
    
    System.out.println("Este programa pinta una pirámide apuntando hacia donde elijas");
    System.out.println("1. Apunta hacia la derecha");
    System.out.println("2. Apunta hacia abajo");
    System.out.println("3. Apunta hacia la izquierda");
    System.out.println("4. Apunta hacia arriba");
    System.out.println("Escribe un número de los anteriores: ");
    
    linea = System.console().readLine();
    int direccion = Integer.parseInt( linea );
    
    System.out.println("Escribe el caracter con el que quieres que quieres que se forme la pirámide");
    String c = System.console().readLine();
    System.out.println("---------------------------");
    
    if (direccion == 1) {
      System.out.println(c);
      System.out.println(c + c);
      System.out.println(c + c + c);
      System.out.println(c + c);
      System.out.println(c);
    }
    if (direccion == 2) {
      System.out.println(c + c + c + c + c);
      System.out.println(" " + c + c + c);
      System.out.println(" " + " " + c);
    }
    if (direccion == 3) {
      System.out.println(" " + " " + c);
      System.out.println(" " + c + c);
      System.out.println(c + c + c);
      System.out.println(" " + c + c);
      System.out.println(" " + " " + c);
    }
    if (direccion == 4) {
      System.out.println(c + c + c + c + c);
      System.out.println(" " + c + c + c);
      System.out.println(" " + " " + c);
    }
  }
}
