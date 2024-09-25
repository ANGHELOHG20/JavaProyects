import java.util.Scanner;

public class AplicacionCalculadora {
    public static void main(String[] args) {
        System.out.println("*** Calculadora Básica ***");

        var in = new Scanner(System.in);
        var salir = false;

        while (!salir) {
            System.out.println("""
                    Menú de opciones
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                                        
                    Escoge una opción:\s
                    """);
            var opcion = in.nextInt();
        }
    }
}
