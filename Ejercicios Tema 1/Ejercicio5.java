/**
  *horario colores
  *
  *@author Pedro Jiménez
  */
  
public class Ejercicio5 { // Clase principal
  public static void main(String[] args) {
    String r = "\033[31m";
    String v = "\033[32m";
    String n = "\033[33m";
    String a = "\033[34m";
    String m = "\033[35m";
    String w = "\033[37m";
    
    System.out.println("Hora   LUNES   MARTES  MIERCOLES   JUEVES  VIERNES");
    System.out.printf(w + "8.15/9.15"+ r + "%12s" + v + "%12s" + v + "%12s" + n + "%12s" + a + "%12s", "S.INF","PROG","PROG","B.D","L.M");
    
  }
}
    
    
