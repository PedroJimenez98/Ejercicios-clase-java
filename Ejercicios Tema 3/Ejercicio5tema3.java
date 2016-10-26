/**
 *Calculo del area de un rectángulo
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio5tema3 {
  public static void main(String[] args) {
    
    String linea;
    
    System.out.print("Introduzca la altura del rectángulo: ");
    linea = System.console().readLine();
    double altura = Integer.parseInt( linea );
    
    System.out.print("Introduzca en valor de la base del rectángulo: ");
    linea = System.console().readLine();
    double base = Integer.parseInt( linea );
    
    double area = base * altura;
    System.out.println("El area del rectángulo es: " + area);
  }
}
