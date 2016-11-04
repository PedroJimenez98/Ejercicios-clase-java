/**
 *Horóscopo
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio10tema4 {
  public static void main (String[] args) {
    
    String linea;
    
    System.out.print("Introduce tu mes de nacimiento (con números): ");
    linea = System.console().readLine();
    int mes = Integer.parseInt( linea );
    
    System.out.print("Ahora escribe tu dia de nacimiento: ");
    linea = System.console().readLine();
    int dia = Integer.parseInt( linea );
    
    String x = "";
    
    if (((mes == 1) && (dia >= 20)) || ((mes == 2) && (dia <= 18))) {
      x = "acuario";
    }
    if (((mes == 2) && (dia >= 19)) || ((mes == 3) && (dia <= 20))) {
      x = "piscis";
    }
    if (((mes == 3) && (dia >= 21)) || ((mes == 4) && (dia <= 19))) {
      x = "aries";
    }
    if (((mes == 4) && (dia >= 20)) || ((mes == 5) && (dia <= 20))) {
      x = "tauro";
    }
    if (((mes == 5) && (dia >= 21)) || ((mes == 6) && (dia <= 20))) {
      x = "géminis";
    }
    if (((mes == 6) && (dia >= 21)) || ((mes == 7) && (dia <= 22))) {
      x = "cáncer";
    }
    if (((mes == 7) && (dia >= 23)) || ((mes == 8) && (dia <= 22))) {
      x = "leo";
    }
    if (((mes == 8) && (dia >= 23)) || ((mes == 9) && (dia <= 22))) {
      x = "virgo";
    }
    if (((mes == 9) && (dia >= 23)) || ((mes == 10) && (dia <= 22))) {
      x = "libra";
    }
    if (((mes == 10) && (dia >= 23)) || ((mes == 11) && (dia <= 21))) {
      x = "escorpio";
    }
    if (((mes == 11) && (dia >= 22)) || ((mes == 12) && (dia <= 21))) {
      x = "sagitario";
    }
    if (((mes == 12) && (dia >= 22)) || ((mes == 1) && (dia <= 19))) {
      x = "capricornio";
    } 
    
    System.out.println("Tu horóscopo es " + x);
  }
}
