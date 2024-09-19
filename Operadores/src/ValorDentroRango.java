import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        System.out.println("*** Valor dentro del Rango ***");
        final var minimo = 0;
        final var maximo  = 5;

        System.out.print("Ingresa un numero entre 0 y 5: ");
        var numero = Integer.parseInt(new Scanner(System.in).nextLine());
        var estaDentroDeRango = numero >= minimo && numero <= maximo;
        System.out.println("estaDentroDeRango = " + estaDentroDeRango);

    }
}
