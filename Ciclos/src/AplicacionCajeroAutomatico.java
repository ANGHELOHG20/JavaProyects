import java.util.Scanner;

public class AplicacionCajeroAutomatico {
    public static void main(String[] args) {
        System.out.println("*** Cajero Automatico ***");

        var in = new Scanner(System.in);
        var salir = false;
        final double saldoBase = 1000;

        while (!salir){
            System.out.println("""
                    Menú
                    1. Depositar
                    2. Retirar
                    3. Consultar Saldo
                    4. Salir
                    
                    Escoge una opción:\s
                    """);
            var opcion = in.nextInt();

            switch (opcion){
                case 1 -> {
                    System.out.println("Ingrese el monto a depositar");
                    var deposito = in.nextInt();
                    var saldoFinal = saldoBase+deposito;
                    System.out.printf("Saldo Final: $ %.2f%n%n", saldoFinal);
                } case 2 ->{
                    System.out.println("Ingrese el monto a retirar");
                    var retiro = in.nextInt();
                    if(retiro>saldoBase) {
                        System.out.printf("Saldo insuficiente. Saldo actual es: $ %.2f%n%n", saldoBase);
                    } else {
                        var saldoFinal = saldoBase - retiro;
                        System.out.printf("Saldo Final: $ %.2f%n%n", saldoFinal);
                    }
                } case 3 -> System.out.printf("Saldo: $ %.2f%n%n", saldoBase);
                case 4 -> {
                    System.out.println("Saliendo del sistema");
                    salir = true;
                } default -> System.out.println("Opción Inválida");
            }
        }
        System.out.println("Fin del Sistema de Cajero Automático");
    }
}
