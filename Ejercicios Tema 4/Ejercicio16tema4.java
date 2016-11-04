/**
 *Test de infidelidad
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio16tema4 {
  public static void main (String[] args) {
    
    
    System.out.println("Este es un programa que nos dice si nuestra pareja puede estar siendo infiel");
    System.out.println("Escribe V si la respuesta es verdadera y F si es falsa");
    
    int puntos;
    puntos = 0;
    
    System.out.println("1. ¿Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente?");
    
    String a = System.console().readLine();
    
    if (a == "V") {
      puntos += 3;
    }
    
    System.out.println("¿2. Ha aumentado sus gastos de vestuario?");
    
    String b = System.console().readLine();
    
    if(b == "V") {
      puntos += 3;
    }
    
    System.out.println("¿3. Ha perdido el interés que mostraba anteriormente por ti?");
    
    String c = System.console().readLine();
    
    if (c == "V") {
      puntos += 3;
    }
    
    System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
    
    String d = System.console().readLine();
    
    if (d == "V") {
      puntos += 3;
    } 
    
    System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
    
    String e = System.console().readLine();
    
    if (e == "V") {
      puntos += 3;
    }
    
    System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
    
    String f = System.console().readLine();
    
    if (f == "V") {
      puntos += 3;
    }
    
    System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    
    String g = System.console().readLine();
    
    if (g == "V") {
      puntos +=3;
    }
    
    System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    
    String h = System.console().readLine();
    
    if (h == "V") {
      puntos +=3;
    }
    
    System.out.println("9. Has notado que últimamente se perfuma más");
    
    String i = System.console().readLine();
    
    if (i == "V") {
      puntos +=3;
    }
    
    System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    
    String j = System.console().readLine();
    
    if (j == "V") {
      puntos +=3;
    }
    
    if ((puntos <= 0) && (puntos >= 10)) {
      System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    } else if ((puntos <= 11) && (puntos >= 22)) {
      System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
    } else if ((puntos <= 23) && (puntos >= 30)) {
      System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
    }
  }
}
