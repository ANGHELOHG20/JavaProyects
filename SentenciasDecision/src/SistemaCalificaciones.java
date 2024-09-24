import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {

        System.out.println(" ***** Sistema de Calificaciones *****");
        var in = new Scanner(System.in);
        System.out.print("Ingrese la califación (0 - 10): ");
        var nota = in.nextDouble();

        if (nota >= 9 && nota < 10){
            System.out.println("A");
        } else if (nota >= 8 && nota < 9){
            System.out.println("B");
        } else if (nota >= 7 && nota < 8){
            System.out.println("C");
        } else if (nota >= 6 && nota < 7) {
            System.out.println("D");
        } else if (nota >= 0 && nota < 6){
            System.out.println("F");
        } else {
            System.out.println("Valor Desconocido");
        }
    }
    }
