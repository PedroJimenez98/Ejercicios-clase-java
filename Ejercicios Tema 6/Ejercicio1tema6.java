/**
 * tira 3 dados y suma los resultados
 * 
 * @author Pedro Jiménez Brenes
 * 
 */

public class Ejercicio1tema6 {
    public static void main (String[] args) {
		
		System.out.println("Vamos a lanzar 3 dados y a sumar los resultados");
		
		int n = 0;
		int a = 0;
		
		for (int i = 1; i < 4; i++) {
			
			n = ((int)(Math.random()*6 + 1));
			System.out.println(n);
			
			a += n;
		}
		System.out.print("Los dados suman: " + a);
	}
}
