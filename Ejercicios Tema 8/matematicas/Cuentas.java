package matematicas;

public class Cuentas {
  
  
  /*
   * Cuenta los dígitos de un número
   * 
   * @param x número al que se quieren contar los dígitos
   * @return número de dígitos de un número
   * 
   **/
  
  public static int digitos(long x) {
    if (x < 0) {
      x = -x;
    } 
    if (x == 0) {
      return 1;
    } else {
      int n = 0;
      while (x > 0) {
        x = x / 10;
        n++;
      }
      return n;
    }
  }
  
  public static int digitos(int x) {
    return digitos((long) x);
  }
  
  /*
   * Da la vuelta a un número
   * 
   * @param x número al que se le quiere dar la vuelta
   * @return número al revés
   * 
   */
  
  public static long voltear(long x) {
    if (x < 0) {
      return -voltear(-x);
    }

    long volteado = 0;

    while(x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x = x / 10;
    }

    return volteado;
  }
  
  public static int voltear(int x) {
    return (int)voltear((long) x);
  }
  
  /*
   * Comprueba si un número es capicúa
   * 
   * @param x número que se quiere comprobar si es capicúa
   * @return si el número es capicúa o no
   * 
   */
  
  public static boolean esCapicua(long x) {
    if (x == voltear(x)) {
      return true;
    } else {
      return false;
    }
  }
  
  public static boolean esCapicua(int x) {
    return esCapicua((long) x);
  }
  
  /*
   * Comprueba si un número es primo
   * 
   * @param x número que se quiere comprobar si es primo
   * @return si el número es primo
   * 
   */
  
  public static boolean esPrimo(int x) {
    for (int i = 2; i < x; i++) {
      
      if ((x %i) == 0) {
        return false;
      }
    }
    return true;
  }
  
  /*
   * Devuelve el menor primo que sea mayor al número que se pasa como parámetro
   * 
   * @param x número entero
   * @return el siguiente primo mayor el número entero
   * 
   */
  
  public static int siguientePrimo(int x) {
    while (esPrimo(x) != true) {
      x++;
    }
    return x;
  } 
  
  
}
