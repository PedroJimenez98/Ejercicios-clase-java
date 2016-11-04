/**
 *dia de la semana
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio3tema4 {
  public static void main (String[] args) {
    
    System.out.print("Escribe un número entero de 1 a 7: ");
    String linea = System.console().readLine();
    int n = Integer.parseInt( linea );
    
    String dia;
    
    switch (n) {
      
      case 1:
        dia = "lunes";
        break;
        
      case 2:
        dia = "martes";
        break;
        
      case 3:
        dia = "miercoles";
        break;
        
      case 4:
        dia = "jueves";
        break;
        
      case 5:
        dia = "viernes";
        break;
        
      case 6:
        dia = "sábado";
        break;
        
      case 7:
        dia = "domingo";
        break;
        
      default:
        dia = "";
        System.out.println("Ese número no esta entre el 1 y el 7");
        break;
    }
    System.out.println("El número " + n + " corresponde al " + dia);
  }
}
