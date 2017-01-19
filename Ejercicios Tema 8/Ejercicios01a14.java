
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
      
      //potencia
      System.out.println("La potencia de base 4 y exponente 3 es " + matematicas.Cuentas.potencia(4, 3));
      
      //digitos
      System.out.println("El número 435 tiene " + matematicas.Cuentas.digitos(435) + " dígitos");
      
      //voltea
      System.out.println("El número 674 al revés es " + matematicas.Cuentas.voltear(674));
      
      //digitoN
      System.out.println("El dígito que está en la posición 3 del número 321 es el " + matematicas.Cuentas.digitoN(321, 3));
      
      //posicionDeDigito
      System.out.println("El número 5 en el 3456 está en la posición " + matematicas.Cuentas.posicionDeDigito(3456, 5));
  }
}
