public class OperadoriosUnarios {
    public static void main(String[] args) {
        System.out.println("***  Operadorios Unarios ***");

        int a =3, b = -2, resultado;
        var c = true;

        System.out.println("");
        //Operador unario +
        resultado = +a;
        System.out.println("resultado +a= " + resultado);
        //Operador unario -
        resultado = -a;
        System.out.println("resultado -a= " + resultado);
        System.out.println("");
        //Operadores unarios incremento-decremento
        //Pre-incremento ++a
        a = 3;
        resultado = ++a; // Primero se incrementa el valor
        System.out.println("Pre-incremento ++a = " + resultado);
        //Post-incremento a++
        a = 3;
        resultado = a++; // Primero se usa el valor y después se incrementa
        System.out.println("Primero se usa el valor a++ = " + resultado);
        System.out.println("Post-incremento a++ = " + a);
        System.out.println("");
        //Pre-decremento --b
        b = -2;
        resultado = --b; // Primero se incrementa el valor
        System.out.println("Pre-decremento --b = " + resultado);
        //Post-decremento b--
        b = -2;
        resultado = b--; // Primero se usa el valor y después se incrementa
        System.out.println("Primero se usa el valor b-- = " + resultado);
        System.out.println("Post-decremento b-- = " + b);

    }
}
