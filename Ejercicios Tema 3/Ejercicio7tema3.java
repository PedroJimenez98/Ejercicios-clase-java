/**
 *Calculo de la factura sin iva
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio7tema3 {
  public static void main(String[] args) {
    
    String linea;
    
    System.out.print("Introduce el precio del primer producto: ");
    linea = System.console().readLine();
    double producto1 = Integer.parseInt( linea );
    
    System.out.print("Introduce el precio del segundo producto: ");
    linea = System.console().readLine();
    double producto2 = Integer.parseInt( linea );
    
    System.out.print("Introduce el precio del tercer producto: ");
    linea = System.console().readLine();
    double producto3 = Integer.parseInt( linea );
    
    double total = producto1 + producto2 + producto3;
    System.out.print("El precio total de los productos es: " + total + " euros");
  }
}
