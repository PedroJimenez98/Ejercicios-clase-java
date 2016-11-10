/**
 * Caja fuerte
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio7tema5 {
    public static void main (String[] args) {
        System.out.println("#####################");
        System.out.println("#####CAJA FUERTE#####");
        System.out.println("#####################");
        System.out.println("Introduce el código de seguridad");
        
        int intentos = 0;
        int contrasena = 1234;
        int a = 4;
        
        while (intentos <= 3) {
            
            contrasena = Integer.parseInt( System.console().readLine() );
            if (contrasena == 1234) {
                System.out.println("Caja fuerte abierta");
                intentos = 5;
            } else {
                if (a != 1) {
                    System.out.println("Prueba otra vez, te quedan " + (a-1) + " intentos");
                    intentos ++;
                    a --;
                } else {
                    System.out.println("No te quedan intentos, caja bloqueada");
                    intentos ++;
                }
            }
        }
    }
}
