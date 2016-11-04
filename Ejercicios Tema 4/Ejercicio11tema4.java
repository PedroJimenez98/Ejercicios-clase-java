/**
 *Segundos hasta media noche
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio11tema4 {
  public static void main (String[] args) {
    
    String linea;
    
    System.out.print("Escribe la hora actual: ");
    linea = System.console().readLine();
    int hora = Integer.parseInt( linea );
    
    System.out.print("Escribe los minutos: ");
    linea = System.console().readLine();
    int min = Integer.parseInt( linea );
    
    int segundos = (((23 - hora) * 3600) + ((60 - min) * 60));
    
    System.out.print("Quedan exactamente " + segundos + " segundos");
  }
}
