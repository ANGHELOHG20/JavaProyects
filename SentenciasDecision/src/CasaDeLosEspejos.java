import java.util.Scanner;

public class CasaDeLosEspejos {
    public static void main(String[] args) {

        System.out.println("*** Casa de los espejos ***");
        var cd = new Scanner(System.in);
        System.out.print("Ingrese la edad: ");
        var edad = cd.nextInt();
        System.out.print("Le tiene miedo a la oscuridad: ");
        var hasFear = cd.nextBoolean();

        if(edad>= 18 && !hasFear){
            System.out.println("Bienveniedo");
            System.out.println("Puede ingresar");
        } else{
            System.out.println("No cumple los requisitos");
            System.out.println("No puede ingresar");
        }
    }
}
