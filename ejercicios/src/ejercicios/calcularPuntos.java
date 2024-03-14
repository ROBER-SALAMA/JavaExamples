

package ejercicios;
import java.util.Scanner;

public class calcularPuntos {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el número de partidos ganados: ");
        int partidosGanados = scanner.nextInt();
        
        System.out.print("Ingrese el número de partidos empatados: ");
        int partidosEmpatados = scanner.nextInt();
        
        System.out.print("Ingrese el número de partidos perdidos: ");
        int partidosPerdidos = scanner.nextInt();
        
        int puntosObtenidos = calcularPuntos(partidosGanados, partidosEmpatados, partidosPerdidos);
        
        System.out.println("El equipo obtuvo " + puntosObtenidos + " puntos.");
}
