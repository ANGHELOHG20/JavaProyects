import java.util.Scanner;

public class FuncionPar {

    static boolean esPar(int numero){
        if (numero % 2 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        var goku = new Scanner(System.in);
        System.out.print("Enter the number: ");
        var numero = goku.nextInt();
        System.out.println("¿El numero es par? " + esPar(numero));
    }
}
