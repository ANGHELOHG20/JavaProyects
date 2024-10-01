import java.util.Scanner;

public class RotarMatriz {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        // Pedimos el tamaño de la matriz
        System.out.print("Proporciona el tamaño de la matriz (n x n): ");
        int n = consola.nextInt();

        // Definimos la matriz original
        int[][] matriz = new int[n][n];

        // Rellenamos la matriz con valores del usuario
        System.out.println("Introduce los valores de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Valor [" + i + "][" + j + "] = ");
                matriz[i][j] = consola.nextInt();
            }
        }

        // Imprimimos la matriz original
        System.out.println("\nMatriz Original:");
        imprimirMatriz(matriz);

        // Creamos una nueva matriz para almacenar la rotación
        int[][] matrizRotada = new int[n][n];

        // Rotamos la matriz 90 grados
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // El valor en [i][j] de la matriz original se mueve a [j][n-1-i]
                matrizRotada[j][n - 1 - i] = matriz[i][j];
            }
        }

        // Imprimimos la matriz rotada
        System.out.println("\nMatriz Rotada 90 Grados:");
        imprimirMatriz(matrizRotada);
    }

    // Método para imprimir cualquier matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
