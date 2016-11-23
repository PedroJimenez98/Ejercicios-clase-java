/**
 * Carta aleatoria de la baraja francesa
 * 
 * @author Pedro Jiménez Brenes
 * 
 */

public class Ejercicio2tema6 {
	public static void main (String[] args) {
		
		System.out.println("Vamos a generar una carta aleatoria");
		
		int palo = (int)(Math.random()*4) + 1;
		String p = "";
		
		
		
		switch(palo) {
			case 1:
			p = "picas";
			break;
			
			case 2:
			p = "corazones";
			break;
			
			case 3:
			p = "diamantes";
			break;
			
			case 4:
			p = "tréboles";
			break;
			default:
		}
		
		int num = ((int)(Math.random()*13) + 1);
		String n = "";
		
		switch(num) {
			case 1:
			n = "A";
			break;
			
			case 11:
			n = "J";
			break;
			
			case 12:
			n = "Q";
			break;
			
			case 13:
			n = "K";
			break;
			default:
				n = num+"";
				break;
		}
	System.out.println(n + " de " + p);
	}
}
