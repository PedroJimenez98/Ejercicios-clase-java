/**
 *salario semanal
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio4tema4 {
  public static void main (String[] args) {
    
    System.out.println("¿Cuántas horas extra que has trabajado esta semana?");
    String linea = System.console().readLine();
    int h = Integer.parseInt( linea );
    
    int total = (40 * 12) + (h * 16);
    
    System.out.print("Esta semana has ganado " + total + " euros");
  }
}
