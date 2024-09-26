import java.sql.SQLOutput;
import java.util.Scanner;

public class AplicacionCalculadora {
    public static void main(String[] args) {
        System.out.println("*** Calculadora Básica ***");

        double numero1 = 0;
        double numero2 = 0;

        var in = new Scanner(System.in);
        var salir = false;

        while (!salir) {
            System.out.println("""
                    \n***** Menú de opciones *****
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                                        
                    Escoge una opción:\s
                    """);
            var opcion = in.nextInt();
            if (opcion >=1 && opcion <=4) {
                System.out.print("Ingresa el primer valor: ");
                numero1 = in.nextDouble();
                System.out.print("Ingresa el segundao valor: ");
                numero2 = in.nextDouble();
            }
            switch (opcion){
                case 1 -> {
                    System.out.println("*** Suma ***");
                   var resultado = numero1 + numero2;
                    System.out.println("Resultado de la suma: " + resultado);
                }
                case 2 -> {
                    System.out.println("*** Resta ***");
                    var resultado = numero1 - numero2;
                    System.out.println("Resultado de la resta: " + resultado);
                }
                case 3 -> {
                    System.out.println("*** Multiplicación ***");
                    var resultado = numero1 * numero2;
                    System.out.println("Resultado de la multiplicación: " + resultado);
                }
                case 4 -> {
                    if (numero2 != 0) {
                        System.out.println("*** División ***");
                        var resultado = numero1 / numero2;
                        System.out.println("Resultado de la división = " + resultado);
                    }  else
                        System.out.println("Error no se puede dividir entre 0");
                } case 5 -> {
                    salir = true;
                    System.out.println("Saliendo de la Calculadora Básica ......");

                } default -> System.out.println("Opción Inválida");
            }
                }
    }
}
