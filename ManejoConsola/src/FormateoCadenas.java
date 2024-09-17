public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("*** Formateo de Cadenas ***");
        var nombre = "Anghelo Huane";
        var edad = 20;
        var salario = 50000.000;

        // String.format
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario $%.2f", nombre, edad,salario);
        System.out.println(mensaje);

        // Mentodo printf
        System.out.printf("Nombre: %s, Edad: %d, Salario $%.2f", nombre, edad,salario);

        var numeroEmpleado = 10;

        System.out.println("\n");
        mensaje = """
                \nDetalle Persona
                --------------------
                \tNombre: %s
                \tNúmero de empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """.formatted(nombre, numeroEmpleado, edad, salario);
        // Formateo con tex block
        System.out.println(mensaje);

        // Formateo con tex block y pritf directamente
        System.out.printf("""
                \nDetalle Persona
                --------------------
                \tNombre: %s
                \tNúmero de empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """, nombre, numeroEmpleado, edad, salario);

    }
}
