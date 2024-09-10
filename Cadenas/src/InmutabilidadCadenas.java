public class InmutabilidadCadenas {
    public static void main(String[] args) {
        //Inmutabilidad de Cadenas
        var cadena1="Hola";
        System.out.println("cadena1 = " + cadena1);
        System.out.println("cadena1 - Longitud = " + cadena1.length());
        var cadena2 = cadena1;
        cadena1="Adiós";
        System.out.println("cadena1 modificado = " + cadena1);
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena1 - Longitud = " + cadena1.length());
    }
}
