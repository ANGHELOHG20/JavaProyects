
import java.util.*;
public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("*** Números aleatorios ***");
        Random random = new Random();

        // Generar un numero aleatorio entre 0 y 9
        var numeroAleatorio = random.nextInt(10);
        System.out.println("Número aleatorio entre 0 y 9: " + numeroAleatorio);

        // Generar un numero aleatorio entre 1 y 10
        numeroAleatorio=random.nextInt(10) + 1;
        System.out.println("Número aleatorio entre 1 y 10: " + numeroAleatorio);

        // Generar un numero aleatoria entre 0 y 100
        numeroAleatorio=random.nextInt(100);
        System.out.println("numeroAleatorio = " + numeroAleatorio);

    }
}
