public class OperadorNot {
    public static void main(String[] args) {
        System.out.println("*** Operador Not ***");

        boolean a= false;

        // operador not ! (invertir el valor logico)
        var resultado = !a;
        System.out.println("resultado a= false= " + resultado);

        boolean b= true;
        resultado = !b;
        System.out.println("resultado b= true= " + resultado);
    }
}
