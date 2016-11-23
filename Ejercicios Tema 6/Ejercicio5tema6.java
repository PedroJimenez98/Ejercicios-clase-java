/**
 * 50 números aleatorios entre 100 y 199
 * 
 * @author Pedro Jiménez Brenes
 * 
 */

public class Ejercicio5tema6 {
	public static void main (String[] args) {
	
		for (int i = 0; i < 50; i++) {
			int n = (int)(Math.random()*100) + 100;
			System.out.print(n + " ");
		}
	}
}
