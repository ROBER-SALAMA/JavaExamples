
import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner entradaConsola = new Scanner(System.in);

        System.out.println("Ingrese el número de columnas:");
        int columnas = entradaConsola.nextInt();

        System.out.println("Ingrese el número de filas:");
        int filas = entradaConsola.nextInt();
        //objeto de matriz  crear la matriz con el tamaño especificado por el usuario
        int[][] matriz = new int[columnas][filas];
        
        //for para rellenar la matriz con los datos ingresados por el usuario
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.println("Ingrese el dato en la posición " + i + "," + j);
                matriz[i][j] = entradaConsola.nextInt();
            }
        }
        
        //imprime la matriz ingresada
        System.out.println("La matriz ingresada es:");
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Calcula la suma de cada columna y muestra el resultado
        System.out.println("Suma de columnas:");
        for (int i = 0; i < columnas; i++) {
            int sumaColumna = 0;
            for (int j = 0; j < filas; j++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("La suma de la columna " + i + " es: " + sumaColumna);
        }
        
        // Calcula la suma de cada fila y muestra el resultado
        System.out.println("Suma de filas:");
        for (int i = 0; i < filas; i++) {
            int sumaFila = 0;
            for (int j = 0; j < columnas; j++) {
                sumaFila += matriz[j][i];
            }
            System.out.println("La suma de la fila " + i + " es: " + sumaFila);
        }
    }
}


