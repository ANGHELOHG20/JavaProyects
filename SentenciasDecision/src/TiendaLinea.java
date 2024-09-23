import java.util.Scanner;

public class TiendaLinea {
    public static void main(String[] args) {
        System.out.println("*** TIENDA EN LINEA ***");
        var in = new Scanner(System.in);
        System.out.print("Ingrese el total de la compra: ");
        var totalCompra = in.nextDouble();
        System.out.print("Es miembro de la tienda (True or False): ");
        var esMiembro = in.nextBoolean();
        double descuento = 0;
        if (esMiembro == true && totalCompra > 1000) {
            descuento = totalCompra*0.1;
        } else if (esMiembro == true) {
             descuento = totalCompra*0.05;
        } else{
            System.out.println("");
            System.out.println("No obtuviste ningún descuento");
            System.out.println("Te invitamos a ser miembro de la tienda");
             descuento = 0;
        }
        double nuevoTotal = totalCompra - descuento;
        System.out.println("El descuento es: $ %.2f".formatted(descuento));
        System.out.print("El valor total es: $ %.2f".formatted(nuevoTotal));

    }
}
