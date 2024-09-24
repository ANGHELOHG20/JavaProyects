import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("***** Sistema de Autenticación *****");

        var user = "user";
        var password = "password";
        var cd = new Scanner(System.in);
        System.out.print("Ingresa el usuario: ");
        var isUser = cd.nextLine();
        System.out.print("Ingresa la contraseña: ");
        var isPassword = cd.nextLine();


        if (user.equals(isUser) && password.equals(isPassword)) {
            System.out.println("Bienvenido al sistema");
        } else if  (!(user.equals(isUser)) && password.equals(isPassword)){
            System.out.println("Usuario inválido, favor de corregirlos!");
        } else if ((user.equals(isUser)) && !(password.equals(isPassword))) {
            System.out.println("Password inválido, favor de corregirlos!");
        } else {
            System.out.println("Usuario y password inválidos, favor de corregirlos!");
        }
    }
}