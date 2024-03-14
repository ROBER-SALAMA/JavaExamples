
package ejercicioss;
import java.util.Scanner;

public class calcularPuntos {
    public static void main(String[] args) {
        Scanner entradaConsola = new Scanner(System.in);

        System.out.println("ingrese la cantidad de partidos ganados: ");
        int partidosGanados = entradaConsola.nextInt();

        System.out.println("Ingrese la cantidad de partidos empatados: ");
        int partidosEmpatados = entradaConsola.nextInt();

        System.out.println("Ingrese la cantidad de partidos perdidos: ");
        int partidosPerdidos = entradaConsola.nextInt();

        
        int puntoTotales = partidosGanados * 3 + partidosEmpatados * 1 + partidosPerdidos * 0;

        System.out.println("El equipo obtubo " + puntoTotales + " puntos.");
    }
}
