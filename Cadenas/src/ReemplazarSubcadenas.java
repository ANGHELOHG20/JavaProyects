public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        //Reemplazar subcadenas
        var cadena = "Hola Mundo";
        System.out.println("cadena original= " + cadena);

        //Reemplazar subcadena Mundo
        var nuevaCadena = cadena.replace("Mundo", "Sonsos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        //Reemplazar "Hola" por "Adios"
        nuevaCadena = cadena.replace("Hola", "Adiós");
        System.out.println("nuevaCadena = " + nuevaCadena);
    }
}
