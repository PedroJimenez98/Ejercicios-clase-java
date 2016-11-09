/**
 * precio de un producto
 *
 *@author Pedro Jiménez
 */
 
public class Ejercicio23tema4 {
    public static void main (String[] args) {
        System.out.print("Escribe el precio del producto: ");
        double a = Integer.parseInt( System.console().readLine() );
        
        System.out.print("Introduce el tipo de IVA (general, reducido o superreducido): ");
        String iva = System.console().readLine();
        
        System.out.print("Introduce el código promocional (nopro, mitad, meno5 o 5porc): ");
        String promo = System.console().readLine() ;
        
        double x = 0;
        
        switch (iva) {
            case "general":
                x = a * 0.21;
                break;
                
            case "reducido":
                x = a * 0.1;
                break;
            case "superreducido":
                x = a * 0.04;
                break;
            }
            
            double z = 0;
            
        switch (promo) {
            case "nopro":
                z = 0;
                break;
            
            case "mitad":
                z = a /2;
                break;
                
            case "meno5":
                z = 5;
                break;
            
            case "5porc":
                z = a * 0.05;
                break;
        }
        System.out.println("Base imponible      " + a);
        System.out.println("IVA                 " + x);
        System.out.println("Precio con IVA      " + (x + a));
        System.out.println("Cód. promo. (" + promo + ") " + (-z));
        System.out.println("TOTAL               " + (x + a - z));
    }
}
