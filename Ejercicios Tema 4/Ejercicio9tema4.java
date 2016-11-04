/**
 *Ecuación de segundo grado
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio9tema4 {
  public static void main (String[] args) {
    
    String linea;
    
    System.out.print("Introduce el valor de a: ");
    linea = System.console().readLine();
    double a = Integer.parseInt( linea );
    
    System.out.print("Introduce el valor de b: ");
    linea = System.console().readLine();
    double b = Integer.parseInt( linea );
    
    System.out.print("Introduce el valor de c: ");
    linea = System.console().readLine();
    double c = Integer.parseInt( linea );
    
    double x;
    
    if ((a == 0) && (b != 0) && (c != 0)) {
      x = -c / b;
      System.out.println("x vale: " + x);
    }
    if ((b == 0) && (a != 0) && (c != 0)) {
      x = Math.sqrt (-c / a);
      System.out.println("x vale: " + x);
    }
    if ((c == 0) && (a != 0) && (b != 0)) {
      x = -b / a;
      System.out.println("x vale: " + x);
    }
    if ((a == 0) && (b == 0)) {
      System.out.println("No tiene solución");
    }
    if ((a == 0) && (c == 0)) {
      System.out.println("No tiene solución");
    }
    if ((b == 0) && (c == 0)) {
      System.out.println("No tiene solución");
    }
    if ((a != 0) && (b != 0)) {
    double x2 = (-b + Math.sqrt(b * b -4 * a * c)) /2 * a;
    
    double x1 = (-b - Math.sqrt(b * b -4 * a * c)) /2 * a;
    
    System.out.println("x vale: " + x1 + " y " + x2);
    }
  }
}
