import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        System.out.println("***** Día de la semana *****");

        var in = new Scanner(System.in);
        System.out.print("Ingrese el valor de un día (1 - 7): ");
        var dia = in.nextInt();

        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Ingrese un valor dentro del rango (1 - 7)");
                break;
        }
        System.out.print("Ingrese el valor de un día (1 - 7): ");
        var diaNuevo = in.nextInt();

            String diaSemana = switch (diaNuevo){
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "Día inválido";
        };
        System.out.println(diaSemana);
    }
}
