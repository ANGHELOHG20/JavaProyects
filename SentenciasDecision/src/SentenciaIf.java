
import java.util.Scanner;

public class SentenciaIf {
    public static void main(String[] args) {
        System.out.println("*** Sentencia If ***");

        var cd = new Scanner(System.in);
        System.out.print("Ingrese la edad: ");
        var edad = cd.nextInt();

        if (edad >= 18 && edad < 150) {
            System.out.println("Es mayor de edad");
        } else if (edad >= 0 && edad < 18) {
            System.out.println("Es menor de edad");
        } else {
            System.out.println("Error al ingresar la edad");
        }
    }
}
