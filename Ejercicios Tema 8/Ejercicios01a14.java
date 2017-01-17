
import matematicas.Cuentas;


public class Ejercicios01a14 {
  
  public static void main(String[] args) {
    
    //esCapicúa
    
    if (matematicas.Cuentas.esCapicua(34677642)) {
      System.out.println("El 34677642 es capicúa");
    }
    if (matematicas.Cuentas.esCapicua(131)) {
      System.out.println("El 131 es capicúa");
    }
    
    //esPrimo
    if (matematicas.Cuentas.esPrimo(7)) {
      System.out.println("El 7 es primo");
    }
    if (matematicas.Cuentas.esPrimo(45)) {
      System.out.println("El 45 es primo");
    }
    
    //siguientePrimo
      System.out.println("El siguiente primo es el " + matematicas.Cuentas.siguientePrimo(25));
      
      //
  }
}
