import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        System.out.println("***** Número Mayor *****");

        var in = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        var numero1 = in.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        var numero2 = in.nextDouble();

        if (numero1 > numero2) {
            System.out.println("El numero mayor es: " + numero1);
        } else if (numero2 > numero1){
            System.out.println("El numero mayor es: " + numero2);
        } else {
            System.out.println("Los números ingresados son iguales");
        }
    }
}
