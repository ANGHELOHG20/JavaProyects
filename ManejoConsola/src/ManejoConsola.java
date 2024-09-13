
import java.util.*;
public class ManejoConsola {
    public static void main(String[] args) {

        //Introducir valores por consola
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        var nombre=consola.nextLine();
        System.out.println("Nombre = " +nombre);
    }
}