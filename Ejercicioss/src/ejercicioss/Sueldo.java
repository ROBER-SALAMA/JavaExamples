
package ejercicioss;
import java.util.Scanner;

public class Sueldo {

    public static void main(String[] args) {
        Scanner entradaConsola = new Scanner(System.in);

        System.out.println("Ingrese su salario: ");
        double salario = entradaConsola.nextDouble();

        double descuento = 0.0;
        if (salario < 500.00) {
            descuento = 0.0;
        } else if (salario >= 500.00 && salario < 750.00) {
            descuento = salario * 0.05;
        } else if (salario >= 750.00) {
            descuento = salario * 0.10;
        }
        
        System.out.println("Monto a descontar en consepto de renta es:" + descuento);
    }
}
