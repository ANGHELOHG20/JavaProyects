import java.util.Random;
import java.util.Scanner;

public class GeneradorDeId {
    public static void main(String[] args) {
        System.out.println("*** Generador de ID Único ***\n");
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        var nombre= in.nextLine();

        System.out.print("Ingrese el apellido: ");
        var apellido= in.nextLine();

        System.out.print("Ingrese el año de nacimiento: ");
        var añoNacimiento= in.nextLine();

        Random random = new Random();
        var numeroRandom = random.nextInt(1,9999);

        System.out.printf("""
                \nID Único
                ---------------------
                \tHola %s,
                \tTú nuevo número de identificacion (ID) generado por el sistema es:
                \t%s%s%s%04d
                \t¡Felicidades!
                """, nombre, nombre.toUpperCase().substring(0,2), apellido.toUpperCase().substring(0,2), añoNacimiento.substring(2), numeroRandom);
    }
}
