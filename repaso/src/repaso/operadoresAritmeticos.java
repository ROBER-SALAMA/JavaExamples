
package repaso;
import java.util.Scanner;


public class operadoresAritmeticos {
    public static void main(String[] args) {
        //Escriba un programa que pida la base y la altura de un triangulo
        //y calcule su area la formula es base por altura entre dos (b*a)/2
        Scanner entradaConsola = new Scanner(System.in);
        
        System.out.println("Ingrese la base del triangulo");
        float base = entradaConsola.nextFloat();
        
        System.out.println("Ingrese la altura del triangulo");
        float altura = entradaConsola.nextFloat();
        
        float area = (base*altura)/2;
        
        System.err.println("el area del triangulo es: " + area);
        
    }
}
