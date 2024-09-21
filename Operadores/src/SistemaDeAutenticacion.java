import java.util.Scanner;

public class SistemaDeAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticación ***");

        var user = "user";
        var password = "password";
        var cd = new Scanner(System.in);
        System.out.print("Ingresa el usuario: ");
        var isUser = cd.nextLine();
        System.out.print("Ingresa la contraseña: ");
        var isPassword = cd.nextLine();

        var mensaje = user.equals(isUser) && password.equals(isPassword) ;
        System.out.println("¿Los datos son correctos?: " + mensaje);
    }
}
