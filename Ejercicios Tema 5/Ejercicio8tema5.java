/**
 * Tablas de multiplicar
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio8tema5 {
    public static void main (String[] args) {
		
		System.out.println("Introduce un número entero");
		
		int n = Integer.parseInt( System.console().readLine() );
		int x = 2;
		
		do {
			
			System.out.println(n * x);
			x ++;
		} while (x < 11);
	}
}
