
package calcularpuntoss;
import java.util.Scanner;

public class proyectoX {
    public static void main(String[] args) {
        //instanciar objeto scanner para capturar datos de la consola
        Scanner entradaConsola = new Scanner(System.in);
        
        // solicitamos el tamaño del vector
        System.out.println("Ingrese el tamaño del vector ");
        
        //creamos el tamaño del vector
        int N = entradaConsola.nextInt();
        
        //creamos el vector con el numero ingresado
        int [] vector = new int [N];
        
        
        //recoremos el tamaño del vector
        for (int i = 0; i < N; i++) {
            // se ejecuta si es verdadero
            System.out.println("Ingres el valor de la pocicion " + i);
            vector[i] = entradaConsola.nextInt();
        }
        
        //variable que almacena la suma de todos los datos del vector
        int resultado = 0;
        //luego repetimos la suma uno a uno segun el numero de datos del vector
        for (int i = 0; i < N; i++) {
            resultado += vector[i];
        }
        //imprimimos la suma de los datos
        System.out.println("la suma es " + resultado);
    }
        
}
