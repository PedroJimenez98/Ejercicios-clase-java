/**
 *Primera asignatura del dia
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio1tema4 {
  public static void main (String[] args) {
    
    String dia;
    
    System.out.print("Dime un dia de la semana: ");
    dia = System.console().readLine();
    
    String asignatura;
    
    switch (dia) { 
      
      case "lunes":
        asignatura = "Sistemas Informaticos";
        break;
        
      case "martes":
        asignatura = "Programación";
        break;
        
      case "miercoles":
        asignatura = "Programación";
        break;
        
      case "jueves":
        asignatura = "Base de datos";
        break;
      
      case "viernes":
        asignatura = "Lenguaje de marcas";
        break;
        
      case "sabado":
        asignatura = "Ese dia no hay clase";
        break;
      
      case "domingo":
        asignatura = "Ese dia no hay clase";
        break;
        
      default:
        asignatura = "Ese dia no existe";
    }
    
    System.out.println("La primera clase del " + dia + " es " + asignatura);
  }
}
