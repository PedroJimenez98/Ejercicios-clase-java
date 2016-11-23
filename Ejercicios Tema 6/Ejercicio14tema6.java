/**
 * Programa adivina el número que piensas
 * 
 * @author Pedro Jiménez Brenes
 * 
 */

public class Ejercicio14tema6 {
  public static void main(String[] args) {
    
    int numero = 0;
    boolean fin = false;
    int oportunidades = 5;
    int minimo = 0;
    int maximo = 100;
    int numeroPensado = 0;;
    String respuesta = "";
    String respuesta2 = "";
    
    System.out.println("Piensa un número y yo intentaré adivinarlo");
    
    while ((!fin) && (oportunidades > 0)) {
      
      numero = (int)(Math.random()*(maximo - minimo) + minimo);
      
      System.out.println("¿El número que piensas es " + numero + "?(si/no)");
      
      respuesta = System.console().readLine();
      
      if (respuesta.equals("si")) {
        System.out.println("¡Si, he acertado!");
        fin = true;
      }
      if (respuesta.equals("no")) {
        if (oportunidades > 1){
          System.out.println("¿El número que piensas es mayor o menor?");
          respuesta2 = System.console().readLine();
          if (respuesta2.equals("mayor")) {
            minimo = 0;
            minimo = numero +1;
          }
          if (respuesta2.equals("menor")) {
            maximo = 100;
            maximo = numero -1;
          }
        }
        oportunidades --;
      }
    }
    if (oportunidades == 0) {
      System.out.println("¡No, he fallado!");
    }
  }
}
