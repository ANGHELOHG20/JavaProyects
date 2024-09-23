import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        System.out.println("***** Sistema de Reserva de Hotel*****");
        var cd = new Scanner(System.in);
        System.out.print("Nombre del cliente: ");
        var nombreCliente = cd.nextLine();
        System.out.print("Días de estancia: ");
        var diasEstancia = cd.nextInt();
        System.out.print("Tiene vista al mar: ");
        var hasView = cd.nextBoolean();

        System.out.println("\n*** Datos del usuario ***");
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Días de estancia: " + diasEstancia);

        if (hasView){
            var costoTotal = 190.50 * diasEstancia;
            System.out.println("Tiene vista al mar: Sí ");
            System.out.println("Costo total: $ %.2f".formatted(costoTotal));
        } else {
            var costoTotal = 150.50 * diasEstancia;
            System.out.println("Tiene vista al mar: No ");
            System.out.println("Costo total: $ %.2f".formatted(costoTotal));
        }
        System.out.println("La reservación fue realizada con exito");
    }
}
