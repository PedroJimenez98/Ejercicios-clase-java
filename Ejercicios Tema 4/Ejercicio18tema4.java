/**
 *Primera cifra de un número
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio18tema4 {
    public static void main (String[] args) {
    
        System.out.println("Escribe un número de un máximo de 5 cifras");
        int n = Integer.parseInt( System.console().readLine() );
        
        if ( n < 10) {
            System.out.println("La primera cifra del número introducido es " + n);
        }
        if (( n >= 10) && (n < 100)) {
            System.out.println("La primera cifra del número introducido es " + n/10);
        }
        if ((n >= 100) && (n < 1000)) {
            System.out.println("La primera cifra del número introducido es " + n/100);
        }
        if ((n >= 1000) && (n < 10000)) {
            System.out.println("La primera cifra del número introducido es " + n/1000);
        }
        if (( n >= 10000) && (n < 100000)) {
            System.out.println("La primera cifra del número introducido es " + n/10000);
        }
        if (n >=100000) {
            System.out.println("Ese número tiene más de 5 cifras");
        }
    }
}
