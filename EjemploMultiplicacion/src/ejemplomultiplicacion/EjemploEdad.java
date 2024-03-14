
package ejemplomultiplicacion;
import java.util.Scanner;

public class EjemploEdad {


    public static void main(String[] args) {
        System.out.println("Roberto Carlos");
        Scanner entradaconsola = new Scanner(System.in);
        int anio = entradaconsola.nextInt();
        int edad = 2023 - anio;
        
        System.out.println("Tu edad es: " + edad);
    }
    
}
