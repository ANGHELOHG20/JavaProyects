import java.util.*;

public class RangoVariable {
    public static void main(String[] args) {
        System.out.println("*** Rangos ***");

        var cd = new Scanner(System.in);

        System.out.print("Digita un número: ");
        var numero = cd.nextInt();

        // Dentro del rango 1 - 100;
        var Mango = numero >= 1 && numero <= 100;
        System.out.println("Valor dentro 1 -100: "+ Mango);

        // Fuera del rango 1 - 100
        Mango =! (numero >= 1 && numero <= 100);
        System.out.println("Valor fuera 1 -100: "+ Mango);
    }
}
