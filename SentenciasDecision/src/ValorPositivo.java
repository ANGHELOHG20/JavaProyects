import java.util.Scanner;

public class ValorPositivo {
    public static void main(String[] args) {

        var cd = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        var numero = cd.nextDouble();

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0){
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }
    }
}
