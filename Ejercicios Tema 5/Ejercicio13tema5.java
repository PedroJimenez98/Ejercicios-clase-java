/**
 * lista de 10 números negativos y positivos
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio13tema5 {
    public static void main (String[] args) {
        System.out.println("Escribe 10 números enteros pulsando [ENTER] entre cada uno");
        int positivos = 0;
        int negativos = 0;
        int n = 0;
        int num = 0;
        
        do {
            
            n = Integer.parseInt( System.console().readLine() );
            
            if (n < 0) {
                negativos ++;
                num ++;
            } else {
                positivos ++;
                num ++;
            }
        } while (num < 10);
        System.out.println("Hay " + positivos + " números positivos y " + negativos + " números negativos");
    }
}
