
package Ejercicios;
import java.util.Scanner;

public class CalcularPuntos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         System.out.println("Ingrese el numero de partidos ganados()");
         int partidosGanados = scanner.nextInt();
         
         System.err.println("Ingrese el numero de partidos empatados");
         int partidosEmpatados = scanner.nextInt();
         
         System.err.println("Ingrese el numero de partidos perdidos");
         int partidosPerdidos = scanner.nextInt();
         
         int puntosObtenidos = calcularPuntos(partidosGanados, partidosEmpatados, partidosPerdidos);
         
         System.err.println("El equipo obtuvo: " + puntosObtenidos + " puntos");
         
    }
}
