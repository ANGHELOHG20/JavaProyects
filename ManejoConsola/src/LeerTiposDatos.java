
import java.sql.SQLOutput;
import java.util.Scanner;
public class LeerTiposDatos {
    public static void main(String[] args) {

        System.out.println("*** Leer tipos de datos ***");

        //Tipo int
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        var edad= consola.nextInt();
        System.out.println("edad = " + edad);

        //Tipo double
        System.out.print("Ingresa tu altura: ");
        var altura= consola.nextDouble();
        System.out.println("Altura = " + altura);

        //Consumimos el caracter de salto de línea
        consola.nextLine();

        //Tipo String
        System.out.print("Ingresa tu nombre: ");
        var nombre= consola.nextLine();
        System.out.println("Nombre = " + nombre);

        //Conversion de datos

    }
}
