/**
 * Cuantos dígitos tiene un número
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio9tema5 {
    public static void main (String[] args) {
        
        System.out.println("Introduce un número entero");
        
        int n = Integer.parseInt( System.console().readLine() );
        int a = 1;
        int b = 10;
        int cifras = 1;
        boolean fin = false;
        do {
            if ((n >= a) && (n < b)) {
                System.out.println("El número tiene " + cifras + " cifras");
                fin = true;
            } else {
                cifras ++;
                a *= 10;
                b *= 10;
            }
        } while (!fin);
    }
}
