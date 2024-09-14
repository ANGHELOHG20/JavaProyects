import java.util.Scanner;

public class RecetaCocina {
    public static void main(String[] args) {
        System.out.println("*** Recetas de Cocina ***");

        Scanner in = new Scanner(System.in);

        //Input
        System.out.println("Ingresa el nombre: ");
        var nombreReceta = in.nextLine();

        System.out.println("Ingresa los ingredientes: ");
        var ingredientesReceta = in.nextLine();

        System.out.println("Ingresa el tiempo de preparación: ");
        var tiempoReceta = Double.parseDouble(in.nextLine());

        System.out.println("Ingresa la dificultad: ");
        var dificultadReceta = in.nextLine();

        //Out
        System.out.println("--- Receta de Cocina ---");
        System.out.println("Nombre receta: " + nombreReceta);
        System.out.println("Ingredientes: " + ingredientesReceta);
        System.out.println("Tiempo de preparación: " + tiempoReceta);
        System.out.println("Dificultad: " + dificultadReceta);

    }
}
