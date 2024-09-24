import java.util.Scanner;

public class EstacionDelAño {
    public static void main(String[] args) {
        System.out.println("***** Estaciones del año *****");


        var in = new Scanner(System.in);
        System.out.print("Ingrese el valor de un mes (1-12): ");
        var mes = in.nextInt();

        if (mes == 1 || mes == 2 || mes == 12) {
            System.out.println("Invierno");
        } else if (mes == 3 || mes == 4 || mes == 5){
            System.out.println("Primavera");
        } else if (mes == 6 || mes == 7 || mes == 8){
            System.out.println("Verano");
        } else if (mes == 9 || mes == 10 || mes == 11){
            System.out.println("Otoño");
        } else {
            System.out.println("Estación Desconocida");
        }

        System.out.println("\nUsando switch");
        System.out.print("Ingrese el valor de un mes (1-12): ");
        var mesNuevo = in.nextInt();

        var out = switch (mesNuevo){
            case 1,2,12 -> "Invierno";
            case 3,4,5 -> "Primavera";
            case 6,7,8 -> "Verano";
            case 9,10,11 -> "Otoño";
            default -> "Estación desconocida";
        };
        System.out.println(out);
    }
}
