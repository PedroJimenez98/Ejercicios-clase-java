/**
 * 50 números aleatorios entre 100 y 199
 * 
 * @author Pedro Jiménez Brenes
 * 
 */

public class Ejercicio6tema6 {
	public static void main (String[] args) { 
		
		int n = (int)(Math.random()*100);
		
		System.out.println("Intenta adivinar el número que estoy pensando de 0 a 100");
		int m = 0;
		
		int intentos = 4;
		for (int i = 0; i < 5; i++) {
			
			m = Integer.parseInt(System.console().readLine());
			
			if (m != n) {
				if (intentos > 0) {
					System.out.println("Intentalo otra vez, te quedan " + intentos + " intentos");
					if (m < n) {
						System.out.println("El número que pienso es mayor");
					} else {
						System.out.println("El número que pienso es menor");
					}
				} else {
					System.out.println("No te quedan intentos");
				}
				
			} else {
				System.out.println("Enhorabuena, has acertado");
			}
			intentos --;
		}
	}
}
