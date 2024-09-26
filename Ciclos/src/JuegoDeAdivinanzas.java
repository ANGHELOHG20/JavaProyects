import java.util.Random;
import java.util.Scanner;

public class JuegoDeAdivinanzas {
    public static void main(String[] args) {
        System.out.println("*** Juego de Adivinanzas ***");

        var random = new Random();
        var cd = random.nextInt(50);

        var in = new Scanner(System.in);
        System.out.print("Adivina el número: ");
        var numero = in.nextInt();
        var intento = 1;

        while(!(numero == cd) && intento <= 10){
            if (numero>cd) {
                System.out.println("El número es menor");
            } else {
                System.out.println("El número es mayor");
            }
            System.out.println("Te equivocaste, prueba de nuevo");
            System.out.print("Adivina el número: ");
            numero = in.nextInt();
            intento++;
        }
        System.out.println("Numero: "+ numero);
        System.out.println("Felicidades, adivinaste el número");
        System.out.println("Intentos realizados: " + intento);
    }
}
