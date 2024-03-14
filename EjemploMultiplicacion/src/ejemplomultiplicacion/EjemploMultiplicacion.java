
package ejemplomultiplicacion;
import java.util.Scanner;

public class EjemploMultiplicacion {
    public static void main(String[] args) {
        
        System.out.println("Ingrese el primer numero");
        Scanner entradaconsola = new Scanner(System.in);
        
        float n1 = entradaconsola.nextFloat();
        
        System.out.println("Ingresa el segundo numero");
        float n2= entradaconsola.nextFloat();
        
        float resultado = n1 * n2;
        
        System.out.println("El resultado es: " + resultado);
    }
}
