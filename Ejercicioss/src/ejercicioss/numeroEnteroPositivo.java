
package ejercicioss;
import java.util.Scanner;

public class numeroEnteroPositivo {
    
    public static void main(String[] args) {
        Scanner entradaConsola = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = entradaConsola.nextInt();

        System.out.println("Números impares entre 0 y " + numero + ":");

        for (int i = 1; i <= numero; i += 2) {
            System.out.println(i);
        }
    }
}
