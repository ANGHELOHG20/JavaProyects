public class IndicesCadena {
    public static void main(String[] args) {
        //Manejo de indices en una cadena
        var cadena1 = "Hola Mundo";
        //Longitud de cadena
        System.out.println("Longitud = " + cadena1.length());

        //Recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0); //Recupera el caracter 'H'
        System.out.println("primerCaracter = " + primerCaracter);
        //Recuperar el ultimo caracter
        var ultimoCaracter = cadena1.charAt(9); //Recupera el caracter 'o'
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        //Recuperar la letra 'M'
        var letraM = cadena1.charAt(5);
        System.out.println("letraM = " + letraM);
    }
}
