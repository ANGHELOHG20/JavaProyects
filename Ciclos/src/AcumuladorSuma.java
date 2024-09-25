public class AcumuladorSuma {
    public static void main(String[] args) {
        System.out.println("*** Acumulador Suma usando Ciclos ***");

        System.out.println("\nCiclo While");
        final int numeroMaximo = 5;
        int acumulador = 0;
        int numero = 0;
        while (numero <= numeroMaximo){
            //Imprime el acumuladro y lo que se va a agregar
            System.out.println("(Acumulador + numero) --> "
            + acumulador + " + " + numero);
            acumulador+=numero;
            numero ++;
            System.out.println("Suma parcial acumulada: " + acumulador);
        }
        System.out.println("Suma de los primeros " + numeroMaximo +
                " números es: " + acumulador);

        System.out.println("\nCiclo Do - While");
        acumulador = 0;
        numero = 0;
        do {
            System.out.println("(Acumulador + numero) --> "
                    + acumulador + " + " + numero);
            acumulador+=numero;
            numero ++;
            System.out.println("Suma parcial acumulada: " + acumulador);

        } while (numero <= numeroMaximo);
        System.out.println("Suma de los primeros " + numeroMaximo +
                " números es: " + acumulador);

        System.out.println("\nCiclo For");
        acumulador = 0;
        for (numero = 0; numero <= numeroMaximo; numero++) {
            System.out.println("(Acumulador + numero) --> "
                    + acumulador + " + " + numero);
            acumulador+=numero;
            // No se agrega porque el for ya lo hace por defecto - numero ++;
            System.out.println("Suma parcial acumulada: " + acumulador);
        }
        System.out.println("Suma de los primeros " + numeroMaximo +
                " números es: " + acumulador);

    }
}
