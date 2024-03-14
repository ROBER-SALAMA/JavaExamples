
package repaso;
import java.util.Scanner;

public class ciclos {
    public static void main(String[] args) {
        Scanner entradaConsola = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de inicio");
        int nInicio = entradaConsola.nextInt();
        
        System.out.println("Ingrese el numero final");
        int nFinal = entradaConsola.nextInt();
        
        for (int i = nInicio; i < nFinal; i++) {
            System.out.println(i);
        }
    }
}
