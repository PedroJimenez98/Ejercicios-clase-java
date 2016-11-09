/**
 * Minutos hasta el fin de semana
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio22tema4 {
    public static void main (String[] args) {
        System.out.println("Introduce la hora actual");
        int h = Integer.parseInt( System.console().readLine() );
        
        System.out.println("Escribe los minutos actuales");
        int min = Integer.parseInt( System.console().readLine() );
        
        System.out.println("Escribe el dia de la semana(lunes/viernes)");
        String dia =System.console().readLine();
        
        int x = 0;
        
        if (dia.equals("lunes")) {
            x = ((23 - h)*60 + (60 - min) + (24 * 60 * 3) + (15 * 60));
            System.out.println("Quedan " + x + "minutos para el fin de semana");
        } else if (dia.equals("martes")) {
            x = ((23 - h)*60 + (60 - min) + (24 * 60 * 2) + (15 * 60));
            System.out.println("Quedan " + x + "minutos para el fin de semana");
        } else if (dia.equals("miércoles")) {
            x = ((23 - h)*60 + (60 - min) + (24 * 60 ) + (15 * 60));
            System.out.println("Quedan " + x + "minutos para el fin de semana");
        } else if (dia.equals("jueves")) {
            x = ((23 - h)*60 + (60 - min) + (15 * 60));
            System.out.println("Quedan " + x + "minutos para el fin de semana");
        } else if (dia.equals("viernes")) {
            x = ((14 - h)*60 + (60 - min));
            System.out.println("Quedan " + x + "minutos para el fin de semana");
        }
    }
}
