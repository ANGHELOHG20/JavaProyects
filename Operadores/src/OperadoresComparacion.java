public class OperadoresComparacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de comparacion ***");
        System.out.println("");
        int a=2, b=3;
        System.out.printf("a = %d, b %d", a, b);
        //Igualdad ==
        System.out.println("");
        var resultado = a == b;
        System.out.println("resultado a == b = " + resultado);

        //Distinto !=
        resultado = a != b;
        System.out.println("resultado a != b = " + resultado);

        //Mayor que
        resultado= a > b;
        System.out.println("Resultado a > b: " + resultado);
        //Mayor o igual que
        resultado= a >= b;
        System.out.println("Resultado a >= b: " + resultado);
        //Menor que
        resultado= a < b;
        System.out.println("Resultado a < b: " + resultado);
        //Menor o igual que
        resultado= a =< b;
        System.out.println("Resultado a =< b: " + resultado);
    }
}
