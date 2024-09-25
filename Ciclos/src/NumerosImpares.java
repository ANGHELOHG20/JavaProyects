public class NumerosImpares {
    public static void main(String[] args) {
        System.out.println("*** Números Impares del 1 al 20 ***");

        var i =1;
        do {
        if(!(i % 2 ==0))
            System.out.print(i + " ");
        i++;
        } while (i<=20);
    }
}
