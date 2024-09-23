import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {

        System.out.println("*** Sistema Bancario");
        var in = new Scanner(System.in);
        System.out.println("¿Desea salir del sistema?");
        var out = in.nextBoolean();
        if(!out){
            System.out.println("Continuamos dentro del sistema ....");
        } else{
            System.out.println("Saliendo del sistema ....");
        }
    }
}
