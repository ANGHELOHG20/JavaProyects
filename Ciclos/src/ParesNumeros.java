public class ParesNumeros {
    public static void main(String[] args) {
        System.out.println("*** Números pares Del 0 al 20 ***");
        int contador = 1;
        while(contador <= 20){
            if( contador % 2 == 0)
                System.out.print(contador + ", ");
                contador++;
                System.out.println(contador);
        }
    }
}
