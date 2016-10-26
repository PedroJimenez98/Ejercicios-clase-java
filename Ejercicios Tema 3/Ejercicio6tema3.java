/**
 *Calculo del area de un triangulo
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio6tema3 {
  public static void main(String[] args) {
    
    String linea;
    
    System.out.print("Introduzca la altura del triángulo: ");
    linea = System.console().readLine();
    double altura = Integer.parseInt( linea );
    
    System.out.print("Introduzca el valor de la base del triángulo: ");
    linea = System.console().readLine();
    double base = Integer.parseInt( linea );
    
    double area = base * altura / 2;
    System.out.print("El area del triangulo es: " + area);
  }
}
