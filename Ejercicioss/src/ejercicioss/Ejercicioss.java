
package ejercicioss;
import java.util.Scanner;

public class Ejercicioss {
    public static void main(String[] args) {
 
        Scanner entrdaConsola = new Scanner(System.in);

        String[] elementos = new String[16];

        for (int i = 0; i < elementos.length; i++) {
            System.out.println("Introduzca el nombre del elemento químico " + (i + 1) + ": ");
            elementos[i] = entrdaConsola.nextLine();
        }

        String[][] matrix = new String[4][4];

        for (int i = 0; i < elementos.length; i++) {
            matrix[i / 4][i % 4] = elementos[i];
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
    
}
