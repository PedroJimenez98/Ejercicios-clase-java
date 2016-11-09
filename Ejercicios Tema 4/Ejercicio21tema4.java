/**
 * nota de programación
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio21tema4 {
    public static void main (String[] args) {
        
        System.out.print("Introduce la nota del primer examen: ");
        double a = Integer.parseInt( System.console().readLine() );
        
        System.out.print("Escribe la nota del segundo examen: ");
        double b = Integer.parseInt( System.console().readLine() );
        
        double x = (a + b) / 2;
        String r = "";
        
        if (x >=5) {
            System.out.println("Tu nota es: " + x);
        } else {
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
            r = System.console().readLine();
        }
        if (r.equals("apto")) {
            System.out.println("Tu nota es un 5");
        }
        if (r.equals("no apto")) {
            System.out.println("tu nota es: " + x);
        }
    }
}
