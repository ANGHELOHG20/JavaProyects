import java.util.Scanner;

public class ControlInventario {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        // Pedimos el número de productos y almacenes
        System.out.print("Proporciona el número de productos: ");
        int productos = consola.nextInt();
        System.out.print("Proporciona el número de almacenes: ");
        int almacenes = consola.nextInt();

        // Definimos la matriz para almacenar las cantidades
        int[][] inventario = new int[productos][almacenes];

        // Pedimos al usuario que introduzca las cantidades de productos por almacén
        for (int i = 0; i < productos; i++) {
            for (int j = 0; j < almacenes; j++) {
                System.out.print("Cantidad de Producto " + (i + 1) + " en Almacén " + (j + 1) + ": ");
                inventario[i][j] = consola.nextInt();
            }
        }

        // Calculamos el total de productos por tipo de producto (suma de las filas)
        System.out.println("\nTotal de productos por tipo:");
        for (int i = 0; i < productos; i++) {
            int totalProducto = 0;
            for (int j = 0; j < almacenes; j++) {
                totalProducto += inventario[i][j];
            }
            System.out.println("Producto " + (i + 1) + ": " + totalProducto);
        }

        // Calculamos el total de productos por almacén (suma de las columnas)
        System.out.println("\nTotal de productos por almacén:");
        for (int j = 0; j < almacenes; j++) {
            int totalAlmacen = 0;
            for (int i = 0; i < productos; i++) {
                totalAlmacen += inventario[i][j];
            }
            System.out.println("Almacén " + (j + 1) + ": " + totalAlmacen);
        }
    }
}
