/**
 * Carta aleatoria de la baraja francesa
 * 
 * @author Pedro Jiménez Brenes
 * 
 */

public class Ejercicio3tema6 {
	public static void main (String[] args) {
		
		System.out.println("Vamos a generar una carta aleatoria");
		
		int palo = (int)(Math.random()*4) + 1;
		String p = "";
		
		
		
		switch(palo) {
			case 1:
			p = "espadas";
			break;
			
			case 2:
			p = "oros";
			break;
			
			case 3:
			p = "bastos";
			break;
			
			case 4:
			p = "copas";
			break;
			default:
		}
		
		int num = ((int)(Math.random()*10) + 1);
		String n = "";
		
		switch(num) {
			case 1:
			n = "As";
			break;
			
			case 8:
			n = "Sota";
			break;
			
			case 9:
			n = "Caballo";
			break;
			
			case 10:
			n = "Rey";
			break;
			default:
				n = num+"";
				break;
		}
	System.out.println(n + " de " + p);
	}
}
