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
  
  /*
   * Dada una base y un exponente devuelve una potencia
   * 
   * @param base y exponente con los que se quieren calcular la potencia
   * @return potencia
   * 
   */
  
  public static long potencia(int base, int exponente) {
    
    if (exponente == 0) {
      return 1;
    }
    int n = 1;
    
    for (int i = 0; i < exponente; i ++) {
      n = n * base;
      
    }
    return n;
  }
  
  /*
   * Devuelve el dígito que está en la posición n de un número entero
   * 
   * @param x número al que se quiere sacar el dígito
   * @param n lugar del dígito
   * @return el dígito que está en la posición n
   */
   
  public static int digitoN(long x, int n) {
    
    x = voltear(x);
    
    while (n-- > 0) {
      x = x / 10;
    }
    return (int)x % 10;
  }
  
  public static int digitoN(int x, int n) {
    return digitoN((long) x, n);
  }
  
  /*
   *Da la posición de la primera ocurrencia de un dígito dentro de un número entero 
   * 
   * @param x número
   * @return la posición del dígito deseado 
   * 
   */
  
  public static int posicionDeDigito(int x, int n) {
      int i;
      
      for (i = 0; (i < digitos(x)) && (digitoN(x, i) != n); i++) {}
    
    if (i == digitos(x)) {
      return -1;
    } else {
      return i;
    }
    
  }
  
}
