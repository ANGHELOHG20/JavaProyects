import java.util.Scanner;

public class PrestamoLibros {
    public static void main(String[] args) {

        System.out.println(" *** Biblioteca UTP ***");
        System.out.println("");
        Scanner in = new Scanner(System.in);

        System.out.print("¿Tiene la credencial de estudiante?: ");
        var hasCredencial = in.nextBoolean();

        System.out.print("Ingrese la distancia del domicilio a la Universidad (en Km): ");
        var distanciaUniversidad = in.nextInt();
        in.nextLine();

        var esVip = (3 >= distanciaUniversidad || 3 > distanciaUniversidad) && (hasCredencial == true);
        System.out.println("¿Tiene acceso al préstamo? = " + esVip);
    }
}