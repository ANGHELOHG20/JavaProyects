import java.util.Scanner;

public class SistemaDeEnvios {
    public static void main(String[] args) {

        System.out.println(" ***** Sistema de Envíos *****");

        var in = new Scanner(System.in);
        System.out.print("El envío es nacional: ");
        var isNacional = in.nextBoolean();

        System.out.print("Ingrese el peso del paquete: ");
        var pesoPaquete = in.nextDouble();

        if( isNacional == false ){
            var costoTotal = 20*pesoPaquete;
            System.out.println("Destino : Internacional");
            System.out.println("Peso del paquete = " + pesoPaquete + " Kilogramos");
            System.out.println("Costo total: $ %.2f".formatted(costoTotal));
        } else if (isNacional = true) {
            var costoTotal = 10*pesoPaquete;
            System.out.println("Destino : Nacional");
            System.out.println("Peso del paquete = " + pesoPaquete + " Kilogramos");
            System.out.println("Costo total: $ %.2f".formatted(costoTotal));
        }
    }
}
