import java.util.Scanner;

public class CalcularAreaPerimetro {
    public static void main(String[] args) {
        System.out.println("*** AREA Y PERIMETRO DE UN RECTÁNGULO***");

        var cd = new Scanner(System.in);

        System.out.print("Ingrese la altura del rectángulo: ");
        var alturaRectangulo = cd.nextDouble();
        System.out.print("Ingrese la base del rectángulo: ");
        var baseRectangulo = cd.nextDouble();

        var perimetroRectangulo = 2*(alturaRectangulo + baseRectangulo);
        System.out.println("El perimetro del rectángulo es: " + perimetroRectangulo);

        var areaRectangulo= (baseRectangulo*alturaRectangulo);
        System.out.println("El área del rectángulo es: " + areaRectangulo);
    }
}
