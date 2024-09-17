public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de Asignación ***");

        //Asignación simple =
        var numero1=20;
        System.out.println("Número escogido: " + numero1);

        //Asignación Compuesta +=
        numero1 +=5;
        System.out.println("numero1 = " + numero1);
        numero1=20;
        numero1 *=2;
        System.out.println("numero1 = " + numero1);

        //Asignación de multiples variables
        int a= 100,b= 200,c= 300;
        System.out.printf("a = %d, b = %d, c = %d", a ,b, c);
    }
}
