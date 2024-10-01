import java.util.Scanner;

public class RedistribucionInventario {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        // Pedimos el número de tiendas
        System.out.print("Introduce el número de tiendas: ");
        int numTiendas = consola.nextInt();

        // Arreglos para el inventario actual y el mínimo requerido
        int[] inventarioActual = new int[numTiendas];
        int[] inventarioRequerido = new int[numTiendas];

        // Pedimos al usuario que ingrese el inventario actual de cada tienda
        System.out.println("Introduce el inventario actual de cada tienda:");
        for (int i = 0; i < numTiendas; i++) {
            System.out.print("Tienda " + (i + 1) + " inventario actual: ");
            inventarioActual[i] = consola.nextInt();
        }

        // Pedimos al usuario que ingrese el inventario mínimo requerido de cada tienda
        System.out.println("Introduce el inventario mínimo requerido de cada tienda:");
        for (int i = 0; i < numTiendas; i++) {
            System.out.print("Tienda " + (i + 1) + " inventario mínimo requerido: ");
            inventarioRequerido[i] = consola.nextInt();
        }

        // Calculamos el exceso y el déficit en cada tienda
        int[] exceso = new int[numTiendas];
        int[] deficit = new int[numTiendas];

        for (int i = 0; i < numTiendas; i++) {
            if (inventarioActual[i] > inventarioRequerido[i]) {
                exceso[i] = inventarioActual[i] - inventarioRequerido[i];  // Exceso en la tienda
            } else {
                deficit[i] = inventarioRequerido[i] - inventarioActual[i]; // Déficit en la tienda
            }
        }

        // Redistribuimos el inventario de las tiendas con exceso a las tiendas con déficit
        for (int i = 0; i < numTiendas; i++) {
            for (int j = 0; j < numTiendas; j++) {
                if (exceso[i] > 0 && deficit[j] > 0) {
                    int mover = Math.min(exceso[i], deficit[j]);
                    exceso[i] -= mover;
                    deficit[j] -= mover;
                    System.out.println("Moviendo " + mover + " productos de Tienda " + (i + 1) + " a Tienda " + (j + 1));
                }
            }
        }

        // Verificamos si se cubrieron todos los déficits
        boolean todosCubiertos = true;
        for (int i = 0; i < numTiendas; i++) {
            if (deficit[i] > 0) {
                todosCubiertos = false;
                System.out.println("La Tienda " + (i + 1) + " aún tiene un déficit de " + deficit[i] + " productos.");
            }
        }

        if (todosCubiertos) {
            System.out.println("\nSe ha redistribuido el inventario de manera exitosa. No hay déficits.");
        } else {
            System.out.println("\nNo fue posible cubrir todos los déficits.");
        }
    }
}


