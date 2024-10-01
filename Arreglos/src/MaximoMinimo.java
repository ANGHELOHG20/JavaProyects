import java.util.Scanner;

public class MaximoMinimo {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        // Pedimos el número de elementos del arreglo
        System.out.print("Introduce el número de elementos del arreglo: ");
        int numElementos = consola.nextInt();

        // Creamos el arreglo para almacenar los números
        int[] numeros = new int[numElementos];

        // Pedimos los valores al usuario
        System.out.println("Introduce los números:");
        for (int i = 0; i < numElementos; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = consola.nextInt();
        }

        // Inicializamos el valor máximo y mínimo con el primer elemento del arreglo
        int maximo = numeros[0];
        int minimo = numeros[0];

        // Buscamos el valor máximo y mínimo en el arreglo
        for (int i = 1; i < numElementos; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        // Imprimimos el valor máximo y mínimo
        System.out.println("\nEl valor máximo es: " + maximo);
        System.out.println("El valor mínimo es: " + minimo);
    }
}
