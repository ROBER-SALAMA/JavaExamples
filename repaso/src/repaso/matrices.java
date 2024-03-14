
package repaso;
import java.util.Scanner;

public class matrices {
    public static void main(String[] args) {
        Scanner entradaConsola = new Scanner(System.in);
        
        //matriz (vector) (matriz unidireccional)
        String[][] persona = new String[4][2];
        
        System.out.println("Ingrese el primer nombre");
        persona[0][0] = entradaConsola.nextLine();
        
        System.out.println("Ingrese el segundo nombre");
        persona[0][1] = entradaConsola.nextLine();
        
        System.out.println("Ingrese el tercer nombre");
        persona[1][0] = entradaConsola.nextLine();
        
        System.out.println("Ingrese el cuarto nombre");
        persona[1][1] = entradaConsola.nextLine();
        
        System.out.println("Personal registrado: " + persona[0][0] + persona[0][1] + persona[1][0] + persona[1][1]);
    }
}
