import java.util.Scanner;

public class DiagonalMatriz {
    public static void main(String[] args) {
        //Suma diagonal de una matriz
        int renglon, columnas;
        var consola = new Scanner(System.in);
        //Definimos la matriz
        System.out.print("Proporciona los renglones: ");
        renglon = consola.nextInt();
        System.out.print("Proporciona los columnas: ");
        columnas = consola.nextInt();
        var matriz = new int [renglon][columnas];
        for (int ren = 0; ren < renglon ; ren++) {
            for (int col = 0; col < columnas; col++) {
                System.out.print("Valor [" + ren + "][" + col + "] = ");
                matriz [ren][col] = consola.nextInt();
            }
        }
        System.out.println();
        var sumaDiagonal = 0;
        for (int ren = 0; ren < renglon ; ren++) {
            for (int col = 0; col < columnas; col++) {
                if (ren == col)
                    sumaDiagonal += matriz[ren][col];
            }
        }
        System.out.println("Suma Diagonal de la Matriz: " + sumaDiagonal);
    }
}
