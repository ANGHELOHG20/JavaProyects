public class OperadoresAritmeticos {
    public static void main(String[] args) {
        System.out.println("*** Operadores Aritméticos ***\n");

        int a= 101, b=5, resultado;
        //Suma
        System.out.println("\tSuma");
        resultado = a+b;
        System.out.println("\tResultado de la suma: " + resultado);
        System.out.println("");
        //Resta
        System.out.println("\tResta");
        resultado = a-b;
        System.out.println("\tResultado de la resta: " + resultado);
        System.out.println("");
        //División
        System.out.println("\tDivisión");
        resultado = a/b;
        System.out.println("\tResultado de la división: " + resultado);
        System.out.println("");
        //Multiplicación
        System.out.println("\tMultiplicación");
        resultado = a*b;
        System.out.println("\tResultado de la multiplación: " + resultado);
        System.out.println("");
        //Módulo
        System.out.println("\tMódulo");
        resultado = a%b;
        System.out.println("\tResultado del módulo: " + resultado);
    }
}
