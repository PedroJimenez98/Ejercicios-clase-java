/**
 * cuadrado y cubo de los 5 siguientes números
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio11tema5 {
    public static void main (String[] args) {
        
        System.out.println("Introduce un número entero");
        int n = Integer.parseInt( System.console().readLine() );
        int a = 1;
        System.out.println("----------------------------------");
        System.out.println("número    cuadrado    cubo");
        
        do {
            n ++;
            System.out.println(n + "          "+ n*n + "            " + n * n * n);
            a ++;
            
        } while (a < 6);
    }
}
