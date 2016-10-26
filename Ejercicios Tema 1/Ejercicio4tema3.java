/**
 *Calculo con dos números introducidos por teclado
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio4tema3 {
  public static void main(String[] args) {
    
    String linea;
    
    System.out.print("Introduzca un número: ");
    linea = System.console().readLine();
    double primerNumero = Integer.parseInt( linea );
    
    System.out.print("Introduzca otro número: ");
    linea = System.console().readLine();
    double segundoNumero = Integer.parseInt( linea );
    
    double total1 = primerNumero * segundoNumero;
    System.out.println("El resultado de multiplicar los dos números es: " + total1);
    
    double total2 = primerNumero + segundoNumero;
    System.out.println("El resultado de sumar los dos números es: " + total2);
    
    double total3 = primerNumero - segundoNumero;
    System.out.println("El resultado de restar los dos números es: " + total3);
    
    double total4 = primerNumero / segundoNumero;
    System.out.println("El resultado de dividir los dos números es: " + total4);
  }
}
