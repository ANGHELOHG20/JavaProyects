import java.util.Scanner;

public class MenuIterativo {
    public static void main(String[] args) {
        System.out.println("*** Menú Iterativo ***");

        var cd = new Scanner(System.in);
        var salir = false;

        System.out.print("Ingrese una opción (1-2-3)");

        while(!salir){
            System.out.print("""
                *** Sistema de Administración de cuentas ***
                Menú
                1. Crear cuenta
                2. Eliminar cuenta
                3. Salir
                Escoge una opción:\s
                """);
            var option = cd.nextInt();

            switch (option) {
                case 1 -> System.out.println("Creando un nueva cuenta .....\n");
                case 2 -> {
                    System.out.println("Eliminando la cuenta .....\n");
                }
                case 3 -> {
                    System.out.println("Saliendo del sistema\n");
                    salir = true;
                } default -> System.out.println("Opción inválida\n");
            }
        }
        System.out.println("Fin del Sistema de Administración de Cuentas");

    }
}
