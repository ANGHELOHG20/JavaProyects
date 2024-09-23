public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("*** Operador Ternario *** ");

        // Sintaxis
        // condicion ? expresion1 : expresion2;

        // Determinar si el numero es par o impar
        var numero = 11;
        var resultado = numero % 2 == 0 ? "PAR" : "IMPAR";
        System.out.println("El número es: " + resultado);

        // Determinar si es mayor de edad
        var edad = 20;
        var mensaje = edad >= 18 ? "Es mayor de edad" : "Es menor de edad";
        System.out.println(mensaje);

        // Determinar si el numero es positivo, negativo o cero
        numero = 0;
        resultado = numero > 0 ? "Positivo" : numero < 0 ? "Negativo" : "Cero";
        System.out.println("El número es: " + resultado);
    }
}
