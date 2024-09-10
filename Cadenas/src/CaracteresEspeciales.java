public class CaracteresEspeciales {
    public static void main(String[] args) {
        //Caracteres Especiales

        // '\n' - imprime un salto de linea
        var cadena1 = "Hola Mundo \nEn primer Lugar";
        System.out.println("cadena1 = " + cadena1);
        // '\t' - tabuladro
        var cadena2= "\tHola \tMundo";
        System.out.println("cadena2 = " + cadena2);
        // \' - imprime comilla simple
        var cadena3= "Hola \' Mundo";
        System.out.println("cadena3 = " + cadena3);
        // \" - imprime comilla doble
        var cadena4= "Hola \" Mundo";
        System.out.println("cadena4 = " + cadena4);
        // \\ - imprime una diagonal invertida
        var cadena5= "Hola \\ Mundo";
        System.out.println("cadena5 = " + cadena5);
    }
}
