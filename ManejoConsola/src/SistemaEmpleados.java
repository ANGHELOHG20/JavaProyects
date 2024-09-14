
import java.util.*;

public class SistemaEmpleados {
    public static void main(String[] args) {

        System.out.println("*** Sistema de Empleados ***");

    Scanner in = new Scanner(System.in);

        //Declaracion de variables
        //Entrada de datos
        System.out.print("Ingrese el nombre del empleado: ");
        var nombreEmpleado = in.nextLine();
        System.out.print("Ingrese la edad del empleado:");
        var edadEmpleado = Integer.parseInt(in.nextLine());
        System.out.print("Ingrese el salario del empleado: ");
        var salarioEmpleado = Double.parseDouble(in.nextLine());
        System.out.print("Ingrese si es jefe de Departamento: ");
        var esJefe = Boolean.parseBoolean(in.nextLine());

        //Salida a consola
        System.out.println("\nDatos del empleado");
        System.out.println("Nombre: " + nombreEmpleado);
        System.out.println("Edad: " + edadEmpleado +" años");
        //Formato de salario, solo dos decimales
        System.out.println("salario: $ %.2f".formatted(salarioEmpleado));
        System.out.println("esJefe: " + esJefe);
    }
}
