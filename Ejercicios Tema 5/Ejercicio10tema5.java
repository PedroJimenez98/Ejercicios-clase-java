/**
 * media de x números introducidos por teclado
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio10tema5 {
    public static void main (String[] args) {
        
        int div = 0;
        int a = 0;
        int x = 0;
        boolean f = false;
        do {
            System.out.println("Introduce un número entero positivo, para acabar introduce un número negativo");
            x = Integer.parseInt( System.console().readLine() );
            if (x >= 0) {
                a += x;
                div ++;
            } else {
                f = true;
            }
        } while (f != true);
        System.out.println("Tu media es " + (a / div));
    }
}
