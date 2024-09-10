public class MetodosCadena {
    public static void main(String[] args) {
        //Metodo cadenas
        var cadena1= "Hola mundo";
        System.out.println("cadena1 = " + cadena1);

        //Longitud de cadena
        var longitud= cadena1.length();

        //Imprimir longitud de cadena
        System.out.println("longitud = " + longitud);

        //Modificar cadena
        var cadenaModificada = cadena1.replace('o','x');
        System.out.println("cadenaModificada = " + cadenaModificada);

        //Convertir a mayúsculas
        var cadenaMayuscaula = cadena1.toUpperCase();
        System.out.println("cadenaMayuscaula = " + cadenaMayuscaula);

        //Convertir a minusculas
        var varcadenaMinuscula = cadenaMayuscaula.toLowerCase();
        System.out.println("varcadenaMinuscula = " + varcadenaMinuscula);

        //Eliminar espacios al inicio y al final
        var texto = "   Anghelo Huane     ";
        System.out.println("texto = " + texto);
        System.out.println("texto = " + texto.trim());
    }
}
