
package calcularpuntos;
import java.util.Scanner;

public class CalcularPuntos {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("ingrese la cantidad de partidos ganados: ");
        int partidosGanados = scanner.nextInt();

        System.out.println("Ingrese la cantidad de partidos empatados: ");
        int partidosEmpatados = scanner.nextInt();

        System.out.println("Ingrese la cantidad de partidos perdidos: ");
        int partidosPerdidos = scanner.nextInt();

        
        int puntoTotales = partidosGanados * 3 + partidosEmpatados * 1 + partidosPerdidos * 0;

        
        System.out.println("El equipo obtubo " + puntoTotales + " points.");
    }
    
}
