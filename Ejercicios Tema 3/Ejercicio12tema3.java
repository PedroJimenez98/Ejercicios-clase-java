/**
 *Calcular la nota necesaria para tener la media deseada
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio12tema3 {
  public static void main (String[] args) {
    
    String linea;
    
    System.out.print("¿Qué nota tienes en el primer examen? ");
    linea = System.console().readLine();
    double primerExamen;
    primerExamen = Integer.parseInt( linea );
    
    System.out.print("¿Qué nota quieres sacar en la evaluación? ");
    linea = System.console().readLine();
    int trimestre;
    trimestre = Integer.parseInt( linea );
    
    double segundoExamen = (trimestre - 0.4 * primerExamen)/0.6;
    
    System.out.print("En el segundo examen debes sacar un: " + segundoExamen);
  }
}
