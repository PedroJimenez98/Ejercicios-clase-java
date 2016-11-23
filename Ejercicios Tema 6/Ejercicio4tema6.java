/**
 * Números aleatorios entre 0 y 10
 * 
 * @author Pedro Jiménez Brenes
 * 
 */

public class Ejercicio4tema6 {
	public static void main (String[] args) {
		
		for (int i = 0; i < 20; i++) {
			int n = (int)(Math.random()*11);
			
			System.out.print(n + " ");
		}
	}
}
