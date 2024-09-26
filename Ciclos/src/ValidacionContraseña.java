import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class ValidacionContraseña {
    public static void main(String[] args) {
        System.out.println("*** Creación de contraseña ***");

        var cd = new Scanner(System.in);

        System.out.print("Ingrese una contraseña (Mínimo 6 caracteres): ");
        var password = cd.nextLine();

        while (password.length() < 6){
            System.out.println("Error burro, acaso no sabes leer. " +
                    "Mínimo 6 caracteres");
            System.out.println("Ingrese una contraseña");
            password = cd.nextLine();
        }
        System.out.println("Contraseña creada con éxito");
        System.out.println("Saliendo del Sistema de Creación de contraseña .....");

    }
}
