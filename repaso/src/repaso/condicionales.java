
package repaso;
import java.util.Scanner;


public class condicionales {
    public static void main(String[] args) {
        Scanner entradaConsola = new Scanner(System.in);
        
        System.out.println("Ingrese la nota uno");
        float n1 = entradaConsola.nextFloat();
        
        System.out.println("Ingrese la nota dos");
        float n2 = entradaConsola.nextFloat();
        
        System.out.println("Ingrese la nota de tres");
        float n3 = entradaConsola.nextFloat();
        
        System.out.println("Ingrese la nota cuatro");
        float n4 = entradaConsola.nextFloat();
        
        float promedio = (n1+n2+n3+n4)/4;
        
        if (promedio >= 7) 
        {
            System.out.println("Mantiene la beca");
        } else 
        {
            System.out.println("pierde la beca");
        }
        
    }
    
    
    
}
