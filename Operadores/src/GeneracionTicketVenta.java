import java.util.Random;
import java.util.Scanner;

public class GeneracionTicketVenta {
    public static void main(String[] args) {
        System.out.println("***Ticket de Venta ***");

        var cd = new Scanner(System.in);

        System.out.print("Precio Jabon: ");
        var Leche = cd.nextDouble();

        System.out.print("Precio Pasta: ");
        var Pasta = cd.nextDouble();

        System.out.print("Precio Pollo: ");
        var Pollo = cd.nextDouble();

        System.out.print("Precio Harina: ");
        var Harina = cd.nextDouble();

        System.out.print("Precio Lechuga: ");
        var Lechuga = cd.nextDouble();

        Random random = new Random();
        var descuento = random.nextDouble(100);

        var precioTotalSinIgv = Leche + Harina + Pasta +
                Pollo + Lechuga;

        System.out.println("FELICIDADES GANO UN DESCUENTO DE: %.2f%%".formatted(descuento));

        var aplicandoDescuento = precioTotalSinIgv*(descuento/100);
        System.out.println("Precio total sin IGV = $ %.2f".formatted(aplicandoDescuento));

        var precioIgv = aplicandoDescuento * 0.18;
        System.out.println("IGV = $ %.2f".formatted(precioIgv));

        var precioTotal = precioIgv + aplicandoDescuento;
        System.out.printf("Precio total $ %.2f%n", precioTotal);

    }
}
