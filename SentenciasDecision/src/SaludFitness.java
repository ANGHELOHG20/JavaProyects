import java.util.Scanner;

public class SaludFitness {
    public static void main(String[] args) {
        System.out.println("***** Salud y Fitness *****");

        var in = new Scanner(System.in);
        System.out.print("Nombre de usuario: ");
        var nombreUsuario = in.nextLine();
        System.out.print("Pasos caminados en el día: ");
        var pasosDia = in.nextDouble();

        final var metaDiaria = 10000;
        final var caloriaPorPaso = 0.04;

        double caloriasQuemadas = pasosDia * caloriaPorPaso;

        System.out.println("");
        System.out.println("Usuario: " + nombreUsuario);
        System.out.println("Pasos caminados: " + pasosDia);
        System.out.println("Calorias quemadas = " + caloriasQuemadas +" Kcal");
        if((pasosDia >= metaDiaria)){
            System.out.println("Meta alcanzada");
        } else {
            System.out.println("No lograste la meta");
        }
        System.out.println("La meta diaria es: " + metaDiaria);
    }
}
