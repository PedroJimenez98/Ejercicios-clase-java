/**
 * fibonacci
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio12tema5 {
    public static void main (String[] args) {
        
        System.out.println("Escribe un número para mostrarte esa cantidad de fibonacci");
        int n = Integer.parseInt( System.console().readLine() );
        int f = 0;
        int a = 1;
        int fin = 0;
        
        while (fin < n) {
            if (fin != n){
                System.out.print(f + " ");
            }
            fin ++;
            if (fin != n) {
                System.out.print(a + " ");
            }
            fin++;
            f += a;
            a += f;
        }
    }
}
