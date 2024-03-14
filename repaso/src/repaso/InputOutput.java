package repaso;
import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        Scanner entradaConsola = new Scanner(System.in);
        System.out.println("Dijite su nombre");
        String nombre = entradaConsola.nextLine();
        System.out.println("Dijite su edad");
        String edad = entradaConsola.nextLine();
        System.out.println("Su nombre es: " + nombre + " Su edad es: " + edad);  
    }
}