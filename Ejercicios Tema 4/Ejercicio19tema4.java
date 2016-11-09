/**
 *Número de cifras de un número
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio19tema4 {
    public static void main (String[] args) {
        
        System.out.println("Escribe un número entero de un máximo de 5 cifras");
        int n = Math.abs(Integer.parseInt( System.console().readLine() ));
        
        if (n < 10) {
            System.out.println("El número introducido tiene 1 cifra");
        }
        if ((n >= 10) && (n < 100)) {
            System.out.println("El número introducido tiene 2 cifras");
        }
        if ((n >= 100) && (n < 1000)) {
            System.out.println("El número introducido tiene 3 cifras");
        }
        if ((n >= 1000) && (n < 10000)) {
            System.out.println("El número introducido tiene 4 cifras");
        }
        if ((n >= 10000) && (n < 100000)) {
            System.out.println("El número introducido tiene 5 cifras");
        }
        if (n > 100000)  {
            System.out.println("El número introducido tiene más de 5 cifras");
        }
    }
}
