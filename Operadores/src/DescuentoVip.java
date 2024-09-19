import java.util.Scanner;

public class DescuentoVip {
    public static void main(String[] args) {
        System.out.println(" *** Tienda Merla ***");

        System.out.println("");

        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de articulos: ");
        var articulosComprados = in.nextInt();
        in.nextLine();
        System.out.print("¿Tiene la membresia de la tienda?: ");
        var membresia = in.nextBoolean();

        var esVip = (10 <= articulosComprados || 10 < articulosComprados) && (membresia == true);
        System.out.println("¿Tiene acceso al descuento VIP? = " + esVip);
    }
}
