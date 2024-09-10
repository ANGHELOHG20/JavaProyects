public class GeneradorEmail {
    public static void main(String[] args) {

        //Declaracion de Variables
        var nombre="Ubaldo Acosta Soto";
        var empresa="Global Mentoring";
        var dominio=".com.mx";

        //Numero de caracteres de las variables
        System.out.println("Nombre = " + nombre.length());
        System.out.println("Empresa = " + empresa.length());
        System.out.println("Dominio = " + dominio);

        //Imprimir Variables
        System.out.println("Nombre usuario = " + nombre);
        System.out.println("Nombre usuario normalizado = " + nombre.replace(" ","").trim().toLowerCase());
        System.out.println("Extensión del dominio = " + dominio);
        System.out.println("Dominio del email normalizado: " +
                dominio.replace(" ","").toLowerCase());

        //Email
        System.out.println("Email: " + );
    }
}
