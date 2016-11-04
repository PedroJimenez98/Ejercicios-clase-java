/**
 *orden de los números
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio13tema4 {
  public static void main (String[] args) {
    
    String linea;
    
    System.out.print("Escribe un número: ");
    linea = System.console().readLine();
    int n1 = Integer.parseInt( linea );
    
    System.out.print("Escribe un segundo número: ");
    linea = System.console().readLine();
    int n2 = Integer.parseInt( linea );
    
    System.out.print("Escribe un tercer número: ");
    linea = System.console().readLine();
    int n3 = Integer.parseInt( linea );
    
    String x;
    
    if ((n1 < n2) && (n2 < n3)) {
      System.out.print(n1 + " < " + n2 + " < " + n3);
    }
    if ((n1 < n2) && (n2 > n3) && (n1 < n3)) {
      System.out.print(n1 + " < " + n3 + " < " + n2);
    }
    if ((n1 < n2) && (n2 > n3) && (n1 > n3)) {
      System.out.print(n3 + " < " + n1 + " < " + n2);
    }
    if ((n1 > n2) && (n2 > n3)) {
      System.out.print(n1 + " > " + n2 + " > " + n3);
    }
    if ((n1 > n2) && (n2 < n3) && (n3 < n1)) {
      System.out.print(n1 + " > " + n3 + " > " + n2);
    }
    if ((n1 > n2) && (n2 < n3) && (n3 > n1)) {
      System.out.print(n3 + " > " + n1 + " > " + n2);
    }
    if ((n1 == n2) && (n2 == n3)) {
      System.out.print(n1 + " = " + n2 + " = " + n3);
    }
    if ((n1 == n2) && (n2 < n3)) {
      System.out.print(n1 + " = " + n2 + " < " + n3);
    }
    if ((n1 == n2) && (n2 > n3)) {
      System.out.print(n1 + " = " + n2 + " > " + n3);
    }
    if ((n1 < n2) && (n2 == n3)) {
      System.out.print(n1 + " < " + n2 + " = " + n3);
    }
    if ((n1 > n2) && (n2 == n3)) {
      System.out.print(n1 + " > " + n2 + " = " + n3);
    }
    if ((n1 == n3) && (n2 > n3)) {
      System.out.print(n1 + " = " + n3 + " < " + n2);
    }
    if ((n1 == n3) && (n2 < n3)) {
      System.out.print(n1 + " = " + n3 + " > " + n2);
    }
  }
}
