/**
 *Número capicúa
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio20tema4 {
    public static void main (String[] args) {
        
        System.out.println("Escribe un número entero de un máximo de 5 cifras");
        int n = Integer.parseInt( System.console().readLine() );
        
        //una cifra
        if (n < 10) {
            System.out.println("El número es capicúa");
        }
        //dos cifras
        if ((n >= 10) && (n < 100)) {
            if ((n / 10) == (n %10)) {
                System.out.println("El número es capicúa");
            } else {
                System.out.println("El número no es capicúa");
            }
        }
        //tres cifras
        if ((n >= 100) && (n < 1000)) {
            if ((n / 100) == (n %10)) {
                System.out.println("El número es capicúa");
            } else {
                System.out.println("El número no es capicúa");
            }
        }
        //cuatro cifras
        if ((n >= 1000) && (n < 10000)) {
            if (((n / 1000) == (n %10)) && ((n /100)%10 == (n /10)%10)) {
                System.out.println("El número es capicúa");
            } else {
                System.out.println("El número no es capicúa");
            }
        }
        //cinco cifras
        if ((n >= 10000) && (n < 100000)) {
            if (((n / 10000) == (n %10)) && ((n /1000)%10 == (n /10)%10)) {
                System.out.println("El número es capicúa");
            } else {
                System.out.println("El número no es capicúa");
            }
        }
        if (n >= 100000) {
            System.out.println("El número tiene más de 5 cifras");
        }
    }
} 
